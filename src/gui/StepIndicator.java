package gui;

import javax.swing.*;
import java.awt.*;

public class StepIndicator extends JPanel {

    public StepIndicator(String activeStep) {

        setLayout(new FlowLayout());

        String[] steps = {
                "Profile",
                "Define",
                "Plan",
                "Collect",
                "Analyse"
        };

        for(String step : steps) {

            JLabel label = new JLabel(step);

            if(step.equals(activeStep)) {
                label.setForeground(Color.BLUE);
            }

            add(label);
        }
    }
}