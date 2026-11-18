# 纯文档验证分支说明

本分支用于验证代码度量扫描在「有代码规模、函数数量为 0」场景下的表现。

## 场景

- 扫描时排除全部源码与配置目录，只保留 Markdown 文档
- 预期代码规模大于 0（文档行数计入代码规模）
- 预期函数总数为 0，两个均值指标为空值

## 预期结果

- 插件日志：`Avg function LOC: --`、`Avg cyclomatic complexity: --`
- 运行摘要与输出中两个均值指标展示为 `--`
- 对应 action 输出 `avg-function-loc` / `avg-cyclomatic-complexity` 为空字符串