"""分支复杂度样例模块：用于验证函数行数与圈复杂度的变化。"""


def bucket_score(score, limits):
    """按阈值区间给分数分档。"""
    if score < 0:
        return "invalid"
    if score < limits[0]:
        return "low"
    if score < limits[1]:
        return "medium"
    return "high"


def toggle_flags(flags):
    """按奇偶位置翻转开关状态。"""
    toggled = []
    for index, flag in enumerate(flags):
        if index % 2 == 0 and not flag:
            toggled.append(True)
        else:
            toggled.append(flag)
    return toggled


if __name__ == "__main__":
    print(bucket_score(72, [60, 80]))
    print(toggle_flags([True, False, True]))
