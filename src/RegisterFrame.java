import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegisterFrame extends JFrame {

    protected JTextField tfUsername;
    protected JPasswordField pfPassword,pfConfirmPassword;
    protected JLabel lbUsername, lbPassword, lbReTypePassword;
    protected JButton btnRegister, btnCancel;


    public RegisterFrame() {
        super("Register New User");
        setLayout(new FlowLayout());
        JPanel pRight = new JPanel();
        pRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pRight.setPreferredSize(new Dimension(210, 75));
        JPanel pLeft = new JPanel();
        pLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
        pLeft.setPreferredSize(new Dimension(110, 70));

        lbUsername = new JLabel("Login:     ");
        pLeft.add(lbUsername);

        tfUsername = new JTextField(20);
        pRight.add(tfUsername);

        lbPassword = new JLabel("Password: ");
        pLeft.add(lbPassword);

        pfPassword = new JPasswordField(20);
        pRight.add(pfPassword);

        lbReTypePassword = new JLabel("Re-type password: ");
        pLeft.add(lbReTypePassword);

        pfConfirmPassword = new JPasswordField(20);
        pRight.add(pfConfirmPassword);

        btnRegister = new JButton("Register");

        btnRegister.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if (!getUsername().equals("") && getPassword().equals(getConfirmedPassword())) {
                    JOptionPane.showMessageDialog(RegisterFrame.this,
                            getUsername() + "! account has been successfully created",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(RegisterFrame.this,
                            "Please check your data",
                            "Error",
                            JOptionPane.QUESTION_MESSAGE);


                }
            }
        });

        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                tfUsername.setText("");
                pfPassword.setText("");
                pfConfirmPassword.setText("");
                tfUsername.grabFocus();
            }
        });

        add(pLeft);
        add(pRight);
        add(btnRegister);
        add(btnCancel);


    }

    public String getUsername() {
        return tfUsername.getText();
    }

    public String getPassword() {
        return new String(pfPassword.getPassword());
    }

    public String getConfirmedPassword() {
        return new String(pfConfirmPassword.getPassword());
    }


    public static void main(String[] args) {
        RegisterFrame app = new RegisterFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(350, 150);
        app.setVisible(true);
    }
}