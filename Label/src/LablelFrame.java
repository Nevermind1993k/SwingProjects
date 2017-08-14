import javax.swing.*;

public class LablelFrame extends JFrame {
    //створюємо панель
    JPanel panel = new JPanel();

    LablelFrame() {
        // вирівнювання за замовчуванням (CENTER)
        JLabel label1 = new JLabel("Багато левів, ");

        // вирівнювання вліво
        JLabel label2 = new JLabel("тигрів з тигрицями", SwingConstants.LEFT);

        // Створюему іконку
        Icon icon = new ImageIcon("E:/Dev/New/Swing/SwingProjects/Labels/cat.gif");

        // створюємо мітку із зображенням
        JLabel label3 = new JLabel(icon,SwingConstants.RIGHT);

        // мітка без тексту, вирівнювання за замовчуванням
        JLabel label4 = new JLabel();

        // задаємо текст для label3
        label4.setText("і ведмедів");

        // встановлюємо вирівнювання
        label4.setHorizontalAlignment(SwingConstants.RIGHT);

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);

        this.add(panel);
    }
}
