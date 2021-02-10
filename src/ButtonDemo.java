import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonDemo extends JFrame {
    protected JButton startButton, stopButton;

    public ButtonDemo() {
        super("Button demo");
        setSize(400,200);
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        setLayout(new FlowLayout());
        add(startButton);
        add(stopButton);


        ButtonListener myButtonListener = new ButtonListener();
        startButton.addActionListener(myButtonListener);
        stopButton.addActionListener(myButtonListener);
        setVisible(true);
    }

    public class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent evt) {
            String arg=evt.getActionCommand();
            if (arg.equals("Start")) {
                JOptionPane.showMessageDialog(new JFrame(),"You have clicked on start button","Button Event Handler",JOptionPane.INFORMATION_MESSAGE);
            } else if (arg.equals("Stop")) {
                JOptionPane.showMessageDialog(new JFrame(),"You want to exit?","Button Event Handler",JOptionPane.WARNING_MESSAGE);

            }
        }
    }

    public static void main(String[] main) {
        ButtonDemo app = new ButtonDemo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(400,150);
        app.setVisible(true);
    }


}
