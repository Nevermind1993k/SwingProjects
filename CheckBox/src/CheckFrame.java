import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckFrame extends JFrame implements ItemListener {
    Container box = Box.createVerticalBox();

    JCheckBox comps = new JCheckBox("Computers");
    JCheckBox netbooks = new JCheckBox("Netbooks");
    JCheckBox notebooks = new JCheckBox("Notebooks");
    JCheckBox photo = new JCheckBox("Photo-cameras");
    JCheckBox video = new JCheckBox("Video-cameras");
    JCheckBox priners = new JCheckBox("Printers");
    JLabel chooseLabel = new JLabel();

    CheckFrame() {
        comps.addItemListener(this);
        netbooks.addItemListener(this);
        notebooks.addItemListener(this);
        photo.addItemListener(this);
        video.addItemListener(this);
        priners.addItemListener(this);

        box.add(new JLabel("What are you interesting about?"));
        box.add(comps);
        box.add(netbooks);
        box.add(notebooks);
        box.add(photo);
        box.add(video);
        box.add(priners);
        box.add(new JLabel("You interesting about: "));
        box.add(chooseLabel);

        this.add(box);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String compClass, labelText = "<HTML>";

        //Отримати компоненти, що містяться в контейнері box
        Component[] components = box.getComponents();

        for (int i = 0; i < components.length; i++) {
            // отримати назву класу компонента
            compClass = components[i].getClass().toString();

            //якщо назва класу JCheckBox і стан "вибрано",
            //то в labelText дописати назву прапорця
            if (compClass.equalsIgnoreCase("class javax.swing.JCheckBox")) {
                JCheckBox cb = (JCheckBox) components[i];
                if (cb.isSelected()) {
                    labelText = labelText.concat("&nbsp " + cb.getText() + "<br>");
                }
            }
        }
        // оновити текст мітки, що виводить вибрані прапорці.
        chooseLabel.setText(labelText);
    }
}
