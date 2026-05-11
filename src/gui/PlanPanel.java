package gui;

import model.Metric;
import model.Scenario;
import service.ScenarioRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

public class PlanPanel extends JPanel {

    public PlanPanel(MainFrame frame) {

        setLayout(new BorderLayout());

        String[] columns = {
                "Metric",
                "Coefficient",
                "Direction",
                "Range",
                "Unit"
        };

        DefaultTableModel model = new DefaultTableModel(columns, 0);

        Scenario scenario = ScenarioRepository.getScenarios().get(0);

        for (model.Dimension dimension : scenario.getDimensions()) {

            for (Metric metric : dimension.getMetrics()) {

                model.addRow(new Object[]{
                        metric.getName(),
                        metric.getCoefficient(),
                        metric.getDirection(),
                        metric.getMinValue() + " - " + metric.getMaxValue(),
                        metric.getUnit()
                });
            }
        }

        JTable table = new JTable(model);

        JButton nextButton = new JButton("Next");

        nextButton.addActionListener(e -> {
            frame.showPanel("COLLECT");
        });

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(nextButton, BorderLayout.SOUTH);
    }
}