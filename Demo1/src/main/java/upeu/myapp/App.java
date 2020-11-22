package upeu.myapp;

import javax.swing.*;
import diu.swe.habib.JPanelSlider.JPanelSlider;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Frame f = new Frame();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setResizable(true);
    }
}
class Frame extends JFrame implements MouseListener {
    public Frame(){
        setSize(400,400);
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
    }

    JPanelSlider slider = new JPanelSlider();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    public void initComponents(){
        panel1.setBounds(0,0,350,400);
        panel1.setBackground(new Color(25,0,0));
        panel1.addMouseListener(this);
        slider.add(panel1);
        panel2.setBounds(0,0,350,400);
        panel2.setBackground(new Color(25,0,55));
        panel2.addMouseListener(this);
        slider.add(panel2);
        slider.setBounds(0,0,350,400);
        slider.setBackground(new Color(88,0,24));
        getContentPane().add(slider);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == panel1){
            slider.nextPanel(9,panel2,slider.left);
        }
        if(e.getSource() == panel2){
            slider.nextPanel(9,panel1,slider.right);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
