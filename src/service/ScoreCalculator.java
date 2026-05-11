package service;

import model.Direction;
import model.Metric;

public class ScoreCalculator {

    public static double calculateMetricScore(Metric metric) {

        double min = metric.getMinValue();
        double max = metric.getMaxValue();
        double value = metric.getValue();

        double score;

        if (metric.getDirection() == Direction.HIGHER) {

            score = 1 + ((value - min) / (max - min)) * 4;

        } else {

            score = 5 - ((value - min) / (max - min)) * 4;
        }

        score = Math.max(1, Math.min(5, score));

        score = Math.round(score * 2) / 2.0;

        metric.setScore(score);

        return score;
    }
}