import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pizza extends JFrame {

    private Frame frame;

    private JPanel line2 = new JPanel();

    double size;

    double servings;

    Pizza() {
        frame = new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel title = new JLabel("Pizza Servings Calculator", SwingConstants.CENTER);
        title.setForeground(Color.RED);
        title.setFont(new Font("Serif", Font.BOLD, 24));
        JLabel input = new JLabel("Enter the size of the pizza in inches: ");
        line2.add(input);
        final JTextField textField = new JTextField(4);
        line2.add(textField);
        JButton calculate = new JButton("Calculate Servings");
        final JLabel label = new JLabel("", SwingConstants.CENTER);

        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                size = Double.parseDouble(textField.getText());
                servings = Math.pow((size / 8), 2);
                label.setText("A " + size + " inch pizza will serve " + servings + " people");
            }
        });

        frame.add(title);
        frame.add(line2);
        frame.add(calculate);
        frame.add(label);
        frame.setLayout(new GridLayout(4, 1));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setTitle("Pizza Servings Calculator");
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Pizza();
    }

}

