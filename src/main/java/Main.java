import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        ImageIcon image = new ImageIcon("rick.png");
        Border border = BorderFactory.createLineBorder(Color.green,5);

        JLabel label = new JLabel(); //create a label
        label.setText("Bro, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER,RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.BOTTOM); //set text TOP,CENTER,BOTTOM of ImageIcon
        label.setForeground(new Color(10,90,120)); // set color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,50)); //set font of text
        label.setIconTextGap(20); //set gap of text to image
        label.setBackground(Color.BLACK); //sets background color but needs the opaque = true to work
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon + text within label
        //label.setBounds(20,10,520,420); //set x,y and dimensions of label within frame when there's no layout manager - see line 30


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(640,480);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); //when using pack method all components needs to be added beforehand!!!

    }
}
