import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//exercise three
public class Counter extends JFrame {
    protected JTextField TextFieldCount;
    protected JButton buttonCount;
    protected int count = 0;

    public Counter() {
        setLayout(new FlowLayout());

        add(new JLabel("Counter"));
        TextFieldCount = new JTextField(count + "", 12);
        TextFieldCount.setEditable(false);
        TextFieldCount.setHorizontalAlignment(JTextField.LEFT);
        add(TextFieldCount);

        buttonCount = new JButton("Count");
        add(buttonCount);
        buttonCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ++count;
                TextFieldCount.setText(count + "");
            }
        });

        setTitle("Swing Counter");

    }

    public static void main(String[] args) {
        Counter app=  new Counter();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(400,150);
        app.setVisible(true);

    }
}