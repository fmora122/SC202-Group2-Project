/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fmora
 */
public class analyticsMenu {
    private JFrame frame;
    private JPanel main;
    private JPanel panelS;
    private JPanel panelW;
    private JPanel panelW1;
    private JPanel panelW2;
    private JPanel panelE;
    private JPanel panelE1;
    private JPanel panelE2;
    private JPanel panelC;
    private JPanel panelC1;
    private JPanel panelC2;
    private JLabel labelW1; 
    private JLabel labelW2;
    private JLabel labelE1;
    private JLabel labelE2;
    private JLabel labelC1; 
    private JLabel labelC2;
    private JButton buttonExit;
    
    public analyticsMenu(){
        analyticsMain();
    }
    public void analyticsMain() {
        
        frame = new JFrame();
        frame.setSize(440, 300);
        
        main = new JPanel();
        panelS = new JPanel();
        panelW = new JPanel();
        panelW1 = new JPanel();
        panelW2 = new JPanel();
        panelE = new JPanel();
        panelE1 = new JPanel();
        panelE2 = new JPanel();
        panelC = new JPanel();
        panelC1 = new JPanel();
        panelC2 = new JPanel();       
        labelW1 = new JLabel("1");
        labelW2 = new JLabel("2");
        labelE1 = new JLabel("3");
        labelE2 = new JLabel("4");
        labelC1 = new JLabel("5");
        labelC2 = new JLabel("6");
        
        panelW1.add(labelW1);
        panelW2.add(labelW2);
        panelE1.add(labelE1);
        panelE2.add(labelE2);
        panelC1.add(labelC1);
        panelC2.add(labelC2);
        
        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(panelE1);
        panelE.add(panelE2);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(panelW1);
        panelW.add(panelW2);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.Y_AXIS));
        panelC.add(panelC1);
        panelC.add(panelC2);
        main.add(panelW);
        main.add(panelC);
        main.add(panelE);
        
        buttonExit = new JButton("Exit");
        buttonExit.setMaximumSize(new Dimension(215, 25));
        buttonExit.addActionListener( new exitActionListener());
        panelS.add(buttonExit);
                      
        frame.setTitle("Fincas Anónimas S.A");
        frame.add(main);
        //frame.getContentPane() .add(BorderLayout.CENTER, main);
        //frame.getContentPane() .add(BorderLayout.WEST, panelW);
        //frame.getContentPane() .add(BorderLayout.EAST, panelE);
        frame.getContentPane() .add(BorderLayout.SOUTH, panelS);
        
        
        frame.setVisible(true);
        
        String status = "";
        panelW1.setBackground(Color.RED);
        panelW2.setBackground(Color.GREEN);
        panelE1.setBackground(Color.ORANGE);
        panelE2.setBackground(Color.RED);
        panelC1.setBackground(Color.GREEN);
        panelC2.setBackground(Color.ORANGE);
    }
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }
    
}
