package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 示例服务：用于代码度量扫描验证。
 */
public class DemoService {

    private final List<String> records = new ArrayList<>();

    public void addRecord(String record) {
        if (record == null || record.isEmpty()) {
            return;
        }
        records.add(record);
    }

    public int countValidRecords() {
        int count = 0;
        for (String record : records) {
            if (record != null && !record.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public String summarize() {
        StringBuilder builder = new StringBuilder();
        for (String record : records) {
            builder.append(record).append(",");
        }
        return builder.toString();
    }

    public List<String> filterByPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        for (String record : records) {
            if (record.startsWith(prefix)) {
                result.add(record);
            }
        }
        return result;
    }
}