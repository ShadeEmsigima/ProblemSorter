package buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton implements ActionListener{
    JButton button = new JButton("Default text for Button class");

    Button(){
        button.setBounds(100, 160, 200, 30);
        button.setFocusable(false);
        button.addActionListener(this);
    }
}
