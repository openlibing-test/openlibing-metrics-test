# openlibing-metrics-test

OpenLibing 代码度量指标扫描测试仓库（组织内私有）。

- 工作流文件：`.github/workflows/code-metrics-scan.yml`
- 扫描插件：`openlibing-test/code-metrics-action@github-actions-adaptation`
- 认证方式：OIDC 免密联邦认证（`id-token: write`）

推送 `main` 分支或在 Actions 页面手动触发 `code-metrics-scan` 即可运行代码度量扫描。

## 度量验证记录

- 新增 normalize_scores 至 demo_metrics.py 与 demo_complexity.py，内容逐字相同，用于验证跨文件重复代码检测。
- 本节为 README 新增的 3 行有效内容，用于验证代码规模统计口径。