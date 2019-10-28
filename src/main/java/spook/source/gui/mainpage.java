package spook.source.gui;

import javax.swing.*;

public class mainpage extends JFrame{
    private JPanel panelMain;
    private JPanel panelFirstWord;
    private JPanel panelSecondWord;
    private JPanel panelButton;
    private JPanel panelResult;
    private JPanel panelEmpty;
    private JPanel panelEmpty2;
    private JLabel lblWord;
    private JLabel lblMeaning;
    private JButton btnGetWord;
    private JButton anlamınıGösterButton;


    public mainpage(){

        JFrame frame = new JFrame();
        frame.setContentPane(panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(50 , 50 , 640 , 480);


    }
}
