package com.dave.java.newfeature;

public class DataPoint {
    private String location;
    private Double temperature;

    public DataPoint(String location, Double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return """
                Location: %s
                Temperature: %.2f
                """.formatted(location, temperature);
    }

    public static void main(String[] args) {
        var hill = new DataPoint("Hill", 45.2);
        var dale = new DataPoint("Dale", 65.2);
        System.out.println(hill);
        System.out.println(dale);
    }
}
