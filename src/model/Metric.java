package model;

public class Metric {

    private String name;
    private int coefficient;
    private Direction direction;
    private double minValue;
    private double maxValue;
    private String unit;
    private double value;
    private double score;

    public Metric(String name, int coefficient, Direction direction,
                  double minValue, double maxValue, String unit, double value) {

        this.name = name;
        this.coefficient = coefficient;
        this.direction = direction;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.unit = unit;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public Direction getDirection() {
        return direction;
    }

    public double getMinValue() {
        return minValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public String getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}