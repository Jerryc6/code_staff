package BUILD_BUILD_BUILDProject;
//*Not finish Project*//
import javax.swing.*;
import java.awt.*;

import javax.swing.border.Border;

public class Java_Training extends JFrame{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel JP_west = new JPanel();
    JLabel jl_side = new JLabel("Side Line");


    public void UI(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 700);
        frame.add(panel);
        frame.setVisible(true);
        panel.setBackground(Color.LIGHT_GRAY); 
        panel.setLayout(null);


        panel.add(JP_west);
        JP_west.setLayout(new BoxLayout(JP_west, BoxLayout.Y_AXIS));
        JP_west.setSize(400, 700);
        JP_west.setMaximumSize(new Dimension(400,900));
        JP_west.setMinimumSize(new Dimension(400, 700));
        JP_west.setBackground(Color.BLUE);
        
        JButton b1_west = new JButton("Core Java Components");
        b1_west.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton b2_west = new JButton("Java User Interface (UI) Components (Swing, AWT)");
        b2_west.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton b3_west = new JButton("Java Collections Framework");
        b3_west.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton b4_west = new JButton("Networking Components");
        b4_west.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton b5_west = new JButton("Java Database Connectivity (JDBC)");
        b5_west.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton b6_west = new JButton("Java I/O (Input/Output) Components");
        b6_west.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton b7_west = new JButton("Java Security Components");
        b7_west.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton b8_west = new JButton("Java 8+ New Features");
        b8_west.setAlignmentX(Component.CENTER_ALIGNMENT);

        b1_west.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2_west.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3_west.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4_west.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5_west.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6_west.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b7_west.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b8_west.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JP_west.add(Box.createVerticalStrut(50));
        JP_west.add(b1_west);
        JP_west.add(Box.createVerticalStrut(10));
        JP_west.add(b2_west);
        JP_west.add(Box.createVerticalStrut(10));
        JP_west.add(b3_west);
        JP_west.add(Box.createVerticalStrut(10));
        JP_west.add(b4_west);
        JP_west.add(Box.createVerticalStrut(10));
        JP_west.add(b5_west);
        JP_west.add(Box.createVerticalStrut(10));
        JP_west.add(b6_west);
        JP_west.add(Box.createVerticalStrut(10));
        JP_west.add(b7_west);
        JP_west.add(Box.createVerticalStrut(10));
        JP_west.add(b8_west);
        JP_west.add(Box.createVerticalStrut(10));

        b1_west.setMaximumSize(new Dimension(380, 60));
        b1_west.setMinimumSize(new Dimension(380, 60));
        
        b2_west.setMaximumSize(new Dimension(380, 60));
        b2_west.setMinimumSize(new Dimension(380, 60));

        b3_west.setMaximumSize(new Dimension(380, 60));
        b3_west.setMinimumSize(new Dimension(380, 60));

        b4_west.setMaximumSize(new Dimension(380, 60));
        b4_west.setMinimumSize(new Dimension(380, 60));
    
        b5_west.setMaximumSize(new Dimension(380, 60));
        b5_west.setMinimumSize(new Dimension(380, 60));
    
        b6_west.setMaximumSize(new Dimension(380, 60));
        b6_west.setMinimumSize(new Dimension(380, 60));

        b7_west.setMaximumSize(new Dimension(380, 60));
        b7_west.setMinimumSize(new Dimension(380, 60));

        b8_west.setMaximumSize(new Dimension(380, 60));
        b8_west.setMinimumSize(new Dimension(380, 60));
    }


    public static void main(String[] args) {
        Loan_Management lm = new Loan_Management();
        lm.UI();
    }
}
