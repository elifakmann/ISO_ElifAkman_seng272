package gui;

import javax.swing.*;
import java.awt.*;

public class DefinePanel extends JPanel {

    public DefinePanel(MainFrame frame) {

        setLayout(new BorderLayout());

        JLabel label = new JLabel("Step 2 - Define Quality");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton nextButton = new JButton("Next");

        nextButton.addActionListener(e -> {
            frame.showPanel("PLAN");
        });

        add(label, BorderLayout.CENTER);
        add(nextButton, BorderLayout.SOUTH);
    }
}