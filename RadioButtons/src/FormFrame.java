import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormFrame extends JFrame {
    JPanel notrhPanel = new JPanel();
    JPanel westPanel = new JPanel();
    JPanel eastPanel = new JPanel();
    JPanel southPanel = new JPanel();

    Container westBox = Box.createVerticalBox();
    Container southBox = Box.createVerticalBox();

    Component strut = Box.createHorizontalStrut(10);
    Component glue = Box.createVerticalGlue();

    //Створюємо прапорці
    JCheckBox comps = new JCheckBox("Комп'ютери");
    JCheckBox netBooks = new JCheckBox("Нетбуки");
    JCheckBox notebook = new JCheckBox("Ноутбуки");
    JCheckBox photo = new JCheckBox("Фотоапарати");
    JCheckBox video = new JCheckBox("Відеокамери");
    JCheckBox printers = new JCheckBox("Принтери");

    JLabel chooseLabel = new JLabel();
    JLabel chooseLabel1 = new JLabel();
    JButton confirmButton = new JButton("Підтвердити");

    JFrame myFrame = this;

    FormFrame() {
        // встановити менеджер розташування BorderLayout
        setLayout(new BorderLayout());

        // північна панель
        notrhPanel.add(new JLabel("Анкета"));
        notrhPanel.setBackground(Color.red);

        // західна панель
        westBox.add(new JLabel("Що вас цікавить?"));
        westBox.add(comps);
        westBox.add(netBooks);
        westBox.add(notebook);
        westBox.add(photo);
        westBox.add(video);
        westBox.add(printers);

        //східна панель
        final ButtonGroup radioGroup = new ButtonGroup();

        Container eastBox = Box.createVerticalBox();

        //створєюмо і додаємо прапорці у східну панель
        eastBox.add(new JLabel("Ваш вік?"));
        JRadioButton radioButton;

        eastBox.add(radioButton = new JRadioButton("-"));
        radioButton.setSelected(true);
        radioButton.setActionCommand("-");
        radioGroup.add(radioButton);

        eastBox.add(radioButton = new JRadioButton("12-18"));
        radioButton.setActionCommand("12-18");
        radioGroup.add(radioButton);

        eastBox.add(radioButton = new JRadioButton("19-30"));
        radioButton.setActionCommand("19-30");
        radioGroup.add(radioButton);

        eastBox.add(radioButton = new JRadioButton("30-60"));
        radioButton.setActionCommand("30-60");
        radioGroup.add(radioButton);

        eastBox.add(radioButton = new JRadioButton(">60"));
        radioButton.setActionCommand(">60");
        radioGroup.add(radioButton);

        //південь
        confirmButton.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        southBox.add(confirmButton);

        chooseLabel1.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        southBox.add(chooseLabel1);

        chooseLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        southBox.add(strut);
        southBox.add(chooseLabel);
        southBox.add(glue);

        // додати панелі у відповідні сторони вікна
        add(notrhPanel, BorderLayout.NORTH);
        add(westBox, BorderLayout.WEST);
        add(eastBox, BorderLayout.CENTER);
        add(southBox, BorderLayout.SOUTH);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String compClass, labelText = "<HTML> Ви вибрали: <br/>";

                //Визначити яку радіокнопку було натиснуто
                //і вивести повідомлення з кількістю років
                String radioCommand = radioGroup.getSelection().getActionCommand();
                System.out.println(radioCommand);
                String labelText1 = "Вам " + radioCommand + " років";
                chooseLabel1.setText(labelText1);

                // отримати компоненти, що містяться в контейнері західній панелі-box
                // і вивести повідомлення, які прапорці вибрані
                Component[] components = westBox.getComponents();

                for (int i = 0; i < components.length; i++) {
                    compClass = components[i].getClass().toString();
                    if (compClass.equalsIgnoreCase("class javax.swing.JCheckBox")) {
                        JCheckBox cb = (JCheckBox) components[i];
                        if (cb.isSelected()) {
                            labelText = labelText.concat("&nbsp &nbsp" + cb.getText() + "<br>");
                        }
                    }
                }

                chooseLabel.setText(labelText);
            }
        });
    }

}
