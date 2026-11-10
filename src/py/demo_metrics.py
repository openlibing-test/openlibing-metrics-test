"""代码度量扫描示例模块（供 code-metrics-action.yml 工作流测试使用）"""


def sum_even_numbers(numbers):
    """统计列表中所有偶数之和"""
    total = 0
    for num in numbers:
        # 偶数累加
        if num % 2 == 0:
            total += num
    return total


def find_max_and_min(values):
    """返回列表中的最大值与最小值（空列表返回 None）"""
    if not values:
        return None, None
    current_max = values[0]
    current_min = values[0]
    for value in values[1:]:
        if value > current_max:
            current_max = value
        if value < current_min:
            current_min = value
    return current_max, current_min


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
    print(sum_even_numbers([1, 2, 3, 4, 5, 6]))
    print(find_max_and_min([3, 1, 4, 1, 5, 9, 2, 6]))