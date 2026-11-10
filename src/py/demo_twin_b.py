# 完全一致文件测试模块：demo_twin_a.py 与 demo_twin_b.py 内容逐字节相同


def format_report(title, rows):
    lines = [title, "-" * len(title)]
    for row in rows:
        if row is None:
            row = "(empty)"
        lines.append(str(row))
    return "\n".join(lines)


def clamp(value, low, high):
    if value < low:
        return low
    if value > high:
        return high
    return value


if __name__ == "__main__":
    print(format_report("demo", [1, None, 3]))
    print(clamp(5, 0, 10))
