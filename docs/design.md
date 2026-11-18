# 设计说明

## 目的

在 GitHub Actions 环境复现并验证「函数总数为 0 时不展示 0」的修复。

## 分支策略

- 从 `main` 创建临时分支 `metrics-docs-verify`
- 工作流引用 `openlibing-test/code-metrics-action` 的 `fix-metrics-zero-average-display` 分支
- 扫描时排除源码、示例、vendored 插件与 `.github` 目录，只统计文档类文件

## 判定口径

- 代码规模 > 0：说明文档行数被正常统计
- 函数总数 = 0：说明 lizard 未解析出任何函数
- 两个均值指标为空：插件上报 null（或省略 key），前端/摘要展示 `--`

## 清理

验证完成后删除本临时分支及动作仓中的临时引用分支。