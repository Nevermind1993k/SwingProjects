import javax.swing.*;

public class Form {
    public static void main(String[] args) {
        FormFrame frame = new FormFrame();
        frame.setSize(200, 350);
        frame.setTitle("Form v1.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        frame.pack();
    }
}
