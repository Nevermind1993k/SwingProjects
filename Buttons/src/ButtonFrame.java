import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    JLabel label = new JLabel();
    int i = 0;

    ButtonFrame() {
        Icon icon = new ImageIcon("E:/Dev/New/Swing/SwingProjects/Buttons/checkmark.gif");
        Icon icon2 = new ImageIcon("E:/Dev/New/Swing/SwingProjects/Buttons/cancel.gif");

        JButton button1 = new JButton(icon);
        JButton button2 = new JButton(icon2);

        // додаємо обробник подій, що визначається у внутрішньому класі
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                i++;
                label.setText("Натиснуто разів: " + i);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i--;
                label.setText("Натиснуто разів: " + i);
            }
        });
        //встанолюємо менеджер розташування
        setLayout(new FlowLayout());
        add(button1);
        add(button2);
        add(label);
    }
}
