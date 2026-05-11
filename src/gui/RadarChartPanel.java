package gui;

import model.Scenario;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class RadarChartPanel extends JPanel {

    private Scenario scenario;

    public RadarChartPanel(Scenario scenario) {
        this.scenario = scenario;
        setPreferredSize(new java.awt.Dimension(400, 400)); // avoid conflict
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        int centerX = 200;
        int centerY = 200;
        int radius = 120;

        int count = scenario.getDimensions().size();

        for (int i = 0; i < count; i++) {

            double angle = (2 * Math.PI / count) * i;

            int x = centerX + (int)(Math.cos(angle) * radius);
            int y = centerY + (int)(Math.sin(angle) * radius);

            g2.drawLine(centerX, centerY, x, y);

            // ✅ FIX: use String (name), not object
            String name = scenario.getDimensions().get(i).getName();
            g2.drawString(name, x, y);
        }
    }
}