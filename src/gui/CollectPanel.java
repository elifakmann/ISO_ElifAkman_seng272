package gui;

import model.Metric;
import model.Scenario;
import service.ScoreCalculator;
import service.ScenarioRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

public class CollectPanel extends JPanel {

    public CollectPanel(MainFrame frame) {

        setLayout(new BorderLayout());

        String[] columns = {
                "Metric",
                "Value",
                "Score"
        };

        DefaultTableModel model = new DefaultTableModel(columns, 0);

        Scenario scenario = ScenarioRepository.getScenarios().get(0);

        for (model.Dimension dimension : scenario.getDimensions()) {

            for (Metric metric : dimension.getMetrics()) {

                double score = ScoreCalculator.calculateMetricScore(metric);

                model.addRow(new Object[]{
                        metric.getName(),
                        metric.getValue(),
                        score
                });
            }
        }

        JTable table = new JTable(model);

        JButton nextButton = new JButton("Next");

        nextButton.addActionListener(e -> {
            frame.showPanel("ANALYSE");
        });

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(nextButton, BorderLayout.SOUTH);
    }
}