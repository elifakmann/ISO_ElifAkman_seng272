package gui;

import model.Metric;
import model.Scenario;
import service.ScenarioRepository;

import javax.swing.*;
import java.awt.GridLayout;

public class AnalysePanel extends JPanel {

    public AnalysePanel(MainFrame frame) {

        setLayout(new GridLayout(10, 1));

        Scenario scenario = ScenarioRepository.getScenarios().get(0);

        for (model.Dimension dimension : scenario.getDimensions()) {

            double total = 0;
            double coeff = 0;

            for (Metric metric : dimension.getMetrics()) {
                total += metric.getScore() * metric.getCoefficient();
                coeff += metric.getCoefficient();
            }

            double result = total / coeff;

            JLabel label = new JLabel(
                    dimension.getName() + " Score: " + result
            );

            JProgressBar progressBar = new JProgressBar(0, 5);
            progressBar.setValue((int) result);

            add(label);
            add(progressBar);
        }

        add(new RadarChartPanel(scenario));
    }
}