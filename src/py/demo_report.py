"""代码度量扫描示例模块：按等级归类指标（供工作流测试使用）"""


class MetricsReport:
    """度量报告，按阈值将指标划分为不同等级"""

    def __init__(self, thresholds):
        # thresholds 形如 {"high": 80, "medium": 60}
        self.thresholds = thresholds

    def grade(self, value):
        """根据阈值返回指标等级"""
        if value >= self.thresholds.get("high", 80):
            return "high"
        if value >= self.thresholds.get("medium", 60):
            return "medium"
        return "low"

    def grade_all(self, metrics):
        """批量评级，返回 指标名 -> 等级 的字典"""
        result = {}
        for name, value in metrics.items():
            result[name] = self.grade(value)
        return result


if __name__ == "__main__":
    report = MetricsReport({"high": 80, "medium": 60})
    print(report.grade_all({"code_scale": 100, "duplication_rate": 5, "complexity": 12}))