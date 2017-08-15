import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TestMenu {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    public static void main(String[] args) {
        //створюємо фрейм
        JFrame frame = new JFrame();
        frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //додаємо меню
        frame.add(new Menu(frame));
        frame.setVisible(true);


    }
}

class Menu extends JMenuBar {
    public Menu(JFrame frame) {
        //створюємо рядок меню
        JMenuBar menuBar = new JMenuBar();
        //додаємо рядок меню у фрейм
        frame.setJMenuBar(menuBar);

        //Меню "Файл"
        JMenu fileMenu = new JMenu("Файл");
        menuBar.add(fileMenu);
        //додаємо пункти в меню файл
        JMenuItem openItem = new JMenuItem("Відкрити");
        fileMenu.add(openItem);
        //додаємо розділювач
        fileMenu.addSeparator();


        JMenuItem saveItem = new JMenuItem("Зберегти");
        fileMenu.add(saveItem);

        //створити меню "закрити" в якому поряд з написом буде зображення
        JMenuItem closeItem = new JMenuItem("Закрити",
                new ImageIcon("E:/Dev/New/Swing/SwingProjects/Menu/CloseIcon.jpg"));
        fileMenu.add(closeItem);
        //додаємо обробник подій використавши безіменний внутрішній клас
        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // додаємо гарячу клавіші Ctrl-X до пункту "Закрити"
        closeItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_X, Event.CTRL_MASK));

        // меню "Вигляд"
        JMenu viewMenu = new JMenu("Вигляд");
        menuBar.add(viewMenu);

        // меню "Допомога"
        JMenu helpMenu = new JMenu("Допомога");
        menuBar.add(helpMenu);
        // можна використати метод add()
        // для додавання пунктів в меню зразу ж при створенні
        JMenuItem helpItem = helpMenu.add("Довідка");
        JMenuItem aboutItem = helpMenu.add("Про програму");

        
    }
}
