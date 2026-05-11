package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;

    public MainFrame() {

        setTitle("ISO 15939 Measurement Process Simulator");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(new ProfilePanel(this), "PROFILE");
        mainPanel.add(new DefinePanel(this), "DEFINE");
        mainPanel.add(new PlanPanel(this), "PLAN");
        mainPanel.add(new CollectPanel(this), "COLLECT");
        mainPanel.add(new AnalysePanel(this), "ANALYSE");

        add(mainPanel);

        setVisible(true);
    }

    public void showPanel(String name) {
        cardLayout.show(mainPanel, name);
    }
}