"""示例模块：用于代码度量扫描验证。"""


class RecordStore:
    """记录存储。"""

    def __init__(self):
        self.records = []

    def add_record(self, record):
        if not record:
            return
        self.records.append(record)

    def count_valid_records(self):
        count = 0
        for record in self.records:
            if record:
                count += 1
        return count

    def summarize(self):
        return ",".join(self.records)

    def filter_by_prefix(self, prefix):
        result = []
        for record in self.records:
            if record.startswith(prefix):
                result.append(record)
        return result


def build_report(store):
    """构建统计报告。"""
    total = len(store.records)
    valid = store.count_valid_records()
    return {
        "total": total,
        "valid": valid,
        "summary": store.summarize(),
    }