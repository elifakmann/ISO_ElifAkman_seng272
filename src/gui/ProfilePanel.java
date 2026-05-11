package gui;

import javax.swing.*;
import java.awt.*;

public class ProfilePanel extends JPanel {

    public ProfilePanel(MainFrame frame) {

        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel title = new JLabel("Step 1 - Profile");
        JTextField usernameField = new JTextField();
        JTextField schoolField = new JTextField();
        JTextField sessionField = new JTextField();

        JButton nextButton = new JButton("Next");

        add(title);
        add(new JLabel());

        add(new JLabel("Username:"));
        add(usernameField);

        add(new JLabel("School:"));
        add(schoolField);

        add(new JLabel("Session Name:"));
        add(sessionField);

        add(new JLabel());
        add(nextButton);

        nextButton.addActionListener(e -> {

            if(usernameField.getText().isEmpty()) {

                JOptionPane.showMessageDialog(
                        frame,
                        "Please enter your username."
                );

                return;
            }

            frame.showPanel("DEFINE");
        });
    }
}