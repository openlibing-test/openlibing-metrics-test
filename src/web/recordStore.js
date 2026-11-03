'use strict';

/**
 * 示例工具：用于代码度量扫描验证。
 */
class RecordStore {
  constructor() {
    this.records = [];
  }

  addRecord(record) {
    if (!record) {
      return;
    }
    this.records.push(record);
  }

  countValidRecords() {
    let count = 0;
    for (const record of this.records) {
      if (record) {
        count += 1;
      }
    }
    return count;
  }

  summarize() {
    return this.records.join(',');
  }

  filterByPrefix(prefix) {
    return this.records.filter((record) => record.startsWith(prefix));
  }
}

module.exports = { RecordStore };