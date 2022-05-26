package com.dave.java.exceptions;

import java.util.Arrays;

public class DynamicFields {
    private Object[][] fields;

    public DynamicFields(int initialSize) {
        fields = new Object[initialSize][2];
        for (int i = 0; i < initialSize; i++) {
            fields[i] = new Object[]{null, null};
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] obj : fields) {
            result.append(obj[0]);
            result.append(": ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }

    private int hasField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0])) {
                return  i;
            }
        }
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchFieldException {
        int fieldNum = hasField(id);
        if (fieldNum == -1) {
            throw new NoSuchFieldException();
        }
        return fieldNum;
    }

    private int makeField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }

        Object[][] tmp = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; i++) {
            tmp[i] = fields[i];
        }
        for (int i = fields.length; i < tmp.length ; i++) {
            tmp[i] = new Object[]{null, null};
        }
        fields = tmp;
        return makeField(id);
    }

    public Object getField(String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)][1];
    }

    public Object setFields(String id, Object value) throws DynamicFieldsException {
        if (value == null) {
            DynamicFieldsException dynamicFieldsException = new DynamicFieldsException();
            //指向nep
            dynamicFieldsException.initCause(new NullPointerException());
            throw dynamicFieldsException;
        }
        int fieldNumber = hasField(id);
        if (fieldNumber == -1) {
            fieldNumber = makeField(id);
        }
        Object result = null;
        try {
            result = getField(id);
        } catch (NoSuchFieldException e) {
            //抛出新的运行时异常
            throw new RuntimeException(e);
        }
        fields[fieldNumber][1] = value;
        return result;
    }

    public static void main(String[] args) {
        DynamicFields dynamicFields = new DynamicFields(3);
        System.out.println(dynamicFields);
        try {
            dynamicFields.setFields("d", "A value for d");
            dynamicFields.setFields("number", 47);
            dynamicFields.setFields("number2", 48);
            System.out.println(dynamicFields);
            dynamicFields.setFields("d", "A new value for d");
            dynamicFields.setFields("number3", 11);
            System.out.println("df:" + dynamicFields);
            System.out.println("df.getField(\"d\"):" + dynamicFields.getField("d"));
            Object field = dynamicFields.setFields("d", null);
        } catch (NoSuchFieldException | DynamicFieldsException e) {
            e.printStackTrace(System.out);
        }
    }
}
class DynamicFieldsException extends Exception {}
