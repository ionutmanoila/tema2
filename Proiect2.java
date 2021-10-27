import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proiect2 extends JFrame {
    private JPanel Main;
    private JTextField txtName;
    private JTextField txtAddress;
    private JButton okButton;


        public Proiect2() {
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String name = txtName.getText();
                    String address = txtAddress.getText();

                    JOptionPane.showMessageDialog(null,name);
                    JOptionPane.showMessageDialog(null,address);
                }
            });
        }

        public static void main(String[] args)
        {
            Proiect2 j = new Proiect2();
            j.setContentPane(new Proiect2().Main);
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            j.setVisible(true);
            j.pack();
        }
    }

