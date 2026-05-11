package service;

import model.*;

import java.util.ArrayList;

public class ScenarioRepository {

    public static ArrayList<Scenario> getScenarios() {

        ArrayList<Scenario> scenarios = new ArrayList<>();

        Scenario educationA = new Scenario(
                "Scenario C - Team Alpha",
                ModeType.EDUCATION,
                QualityType.PRODUCT_QUALITY
        );

        Dimension usability = new Dimension("Usability", 25);

        usability.addMetric(new Metric(
                "SUS Score",
                50,
                Direction.HIGHER,
                0,
                100,
                "points",
                89
        ));

        usability.addMetric(new Metric(
                "Onboarding Time",
                50,
                Direction.LOWER,
                0,
                60,
                "min",
                5
        ));

        Dimension performance = new Dimension("Performance Efficiency", 20);

        performance.addMetric(new Metric(
                "Video Start Time",
                50,
                Direction.LOWER,
                0,
                15,
                "sec",
                2
        ));

        performance.addMetric(new Metric(
                "Concurrent Exams",
                50,
                Direction.HIGHER,
                0,
                600,
                "users",
                550
        ));

        educationA.addDimension(usability);
        educationA.addDimension(performance);

        scenarios.add(educationA);

        return scenarios;
    }
}