# 复杂度指标测试模块：无重复代码，验证平均函数行数与平均圈复杂度


def classify_number(value):
    if value > 0:
        if value % 2 == 0:
            return "positive-even"
        return "positive-odd"
    if value < 0:
        return "negative"
    return "zero"


def process_items(items, flag):
    result = []
    for item in items:
        if flag and item > 0:
            result.append(item)
        if not flag and item < 0:
            result.append(-item)
    return result


def normalize_scores(scores):
    # 将分数线性归一化到 0~100 区间
    if not scores:
        return []
    lowest = min(scores)
    highest = max(scores)
    span = highest - lowest
    if span == 0:
        return [100] * len(scores)
    normalized = []
    for score in scores:
        scaled = (score - lowest) * 100 / span
        normalized.append(scaled)
    return normalized


if __name__ == "__main__":
    print(classify_number(4))
    print(process_items([-2, 3, -5], True))
