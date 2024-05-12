import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMI {
    public static void main(String[] args){
        //JFrame is a GUI window which we can add components to 
        JFrame frame1 = new JFrame("BMI"); //or use .setTitle method for changing the name of window
        JFrame frame2 = new JFrame("BMI Calculator");
        Dimension frameSize1 = new Dimension(275, 150);
        Dimension frameSize2 = new Dimension(275, 250);

        frame1.setSize(frameSize1);
        frame1.setLocationRelativeTo(null);
        frame1.setLayout(null);

        frame2.setSize(frameSize2);
        frame2.setLocationRelativeTo(null);
        frame2.setLayout(null);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setBounds(0 ,0, 275, 150);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setBounds(0 ,0, 275, 250);

        JLabel s1 = new JLabel("BMI Calculator");
        JLabel s2 = new JLabel("This app calculates body mass index");
        JLabel s3 = new JLabel("Enter Height(cm):");
        JLabel s4 = new JLabel("Enter Weight(kg):");
        JLabel ans = new JLabel();


        JTextField textInput1 = new JTextField();
        JTextField textInput2 = new JTextField();
        textInput1.setPreferredSize(new Dimension(125, 50));
        textInput2.setPreferredSize(new Dimension(125, 50));

        JButton button1 = new JButton("Start");
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // Buttons functionality
                frame2.setVisible(true);
                frame1.setVisible(false);

            }
        });
        JButton button2 = new JButton("Calculate");
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double bmi = Double.parseDouble(textInput2.getText()) / Math.pow(((Double.parseDouble(textInput1.getText())) / 100), 2.0);
                ans.setText(Double.toString(bmi));
                // Buttons functionality

            }
        });
        JButton button3 = new JButton("Back");
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // Buttons functionality
                frame2.setVisible(false);
                frame1.setVisible(true);
            }
        });

        panel2.add(s3);
        panel2.add(textInput1);
        panel2.add(s4);
        panel2.add(textInput2);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(ans);

        frame2.add(panel2);

        panel1.add(s1);
        panel1.add(button1);
        panel1.add(s2);

        frame1.add(panel1);

        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
