// Learned how to make windows with the help of BroCode on youtube

package windows;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("[This is the default text from the Window class]");
    Window(){

        label.setBounds(10,10, 1000,100);
        label.setFont(new Font(null, Font.PLAIN, 15));
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
