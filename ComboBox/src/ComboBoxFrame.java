import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxFrame extends JFrame {
    JPanel panel = new JPanel();
    private JComboBox<String> combo;

    ComboBoxFrame() {
        //створюємо комбінований список і додаємо пункти
        //1
        //String[] items = {"Choose color, Blue, Yellow, Red"};
        combo = new JComboBox<>();
        combo.setEditable(true);
        //2
        combo.addItem("Choose color");
        combo.addItem("Blue");
        combo.addItem("Yellow");
        combo.addItem("Red");
        combo.addItem("Green");
        combo.addItem("White");
        combo.addItem("Light-Gray");
        combo.addItem("Pink");
        combo.addItem("Cyan");

        //додаємо обробника подій
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (combo.getSelectedItem().equals("Blue"))
                    panel.setBackground(Color.BLUE);
                if (combo.getSelectedItem().equals("Yellow"))
                    panel.setBackground(Color.YELLOW);
                if (combo.getSelectedItem().equals("Red"))
                    panel.setBackground(Color.RED);
                if (combo.getSelectedItem().equals("Green"))
                    panel.setBackground(Color.GREEN);
                if (combo.getSelectedItem().equals("White"))
                    panel.setBackground(Color.WHITE);
                if (combo.getSelectedItem().equals("Light-Gray"))
                    panel.setBackground(Color.LIGHT_GRAY);
                if (combo.getSelectedItem().equals("Pink"))
                    panel.setBackground(Color.PINK);
                if (combo.getSelectedItem().equals("Cyan"))
                    panel.setBackground(Color.CYAN);
            }
        });

        // додаємо список до панелі
        panel.add(combo);

        //додаємо панель у фрейм
        this.add(panel);

    }
}
