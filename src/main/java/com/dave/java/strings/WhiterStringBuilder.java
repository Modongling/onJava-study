package com.dave.java.strings;

public class WhiterStringBuilder {
    public String implicit(String[] fields) {
        String result = "";
        //预期是循环体内多次创建StringBuilder对象
        for (String field : fields) {
            result += field;
        }
        return result;
    }

    public String explicit(String[] fields) {
        //只创建一次
        StringBuilder result = new StringBuilder();
        for (String field : fields) {
            result.append(field);
        }
        return result.toString();
    }
}
