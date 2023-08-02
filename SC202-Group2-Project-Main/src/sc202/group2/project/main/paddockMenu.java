/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author fmora
 */
public class paddockMenu {
    private JFrame frame;
    private JPanel panelN;
    private JPanel panelC;
    private JLabel labelN;
    private JButton buttonAdd;
    private JButton buttonDelete;
    private JButton buttonStatus;
    private JButton buttonExit;

    public paddockMenu(){
        paddockMain();
    }
    public void paddockMain() {
        
        frame = new JFrame();
        frame.setSize(300, 300);
        
        panelN = new JPanel();
        panelC = new JPanel();
        labelN = new JLabel("Paddock Menu");
        
        buttonAdd = new JButton("Add Paddock");
        buttonAdd.setMaximumSize(new Dimension(215, 25));
        buttonDelete = new JButton("Delete Paddock");
        buttonDelete.setMaximumSize(new Dimension(215, 25));
        buttonStatus = new JButton("Update Paddock Status");
        buttonStatus.setMaximumSize(new Dimension(215, 25));
        buttonExit = new JButton("Exit");
        buttonExit.setMaximumSize(new Dimension(215, 25));
        buttonExit.addActionListener( new exitActionListener());
        
        panelN.add(labelN);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.Y_AXIS));
        panelC.add(buttonAdd);
        panelC.add(buttonDelete);
        panelC.add(buttonStatus);
        panelC.add(buttonExit);
        
        frame.setTitle("Fincas Anónimas S.A");
        frame.getContentPane() .add(BorderLayout.NORTH, panelN);
        frame.getContentPane() .add(BorderLayout.CENTER, panelC);
        frame.setVisible(true);
 
    }
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }    
}
