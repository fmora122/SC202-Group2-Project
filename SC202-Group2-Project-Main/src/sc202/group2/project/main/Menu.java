/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Josuel Rodriguez
 */

    public class Menu {

   

    public MenuleDelMenu() {
        cattleDelMain();
    }

    public void cattleDelMain() {

        JFrame frame = new JFrame();
        frame.setSize(400, 300);

        JPanel panelN = new JPanel();
        JPanel panelW = new JPanel();
        JPanel panelE = new JPanel();
        JPanel panelS = new JPanel();
        JPanel panelWMiddle = new JPanel();
        JPanel panelEMiddle = new JPanel();
        JPanel panelMiddle = new JPanel();
        JButton buttonExit = new JButton("Exit");
        buttonExit.addActionListener((ActionListener) new exitActionListener());
        JButton buttonDel = new JButton("Delete");
        buttonDel.addActionListener(new delActionListener());

        JLabel labelN = new JLabel("Delete Cattle Menu");
        JLabel labelS = new JLabel("");
        JLabel LBcattleID = new JLabel("Enter the Cattle ID");
        LBcattleID.setPreferredSize(new Dimension(135, 19));
        JLabel blank1 = new JLabel(" ");

        JTextField TXcattleID = new JTextField(20);
        TXcattleID.addActionListener(new TXcattleIDActionListener());

        panelN.add(labelN);
        panelS.add(labelS);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(LBcattleID);
        panelW.add(blank1);
        panelW.add(buttonDel);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());

        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());

        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(TXcattleID);
        panelE.add(Box.createVerticalGlue());

        panelEMiddle.add(Box.createHorizontalGlue());
        panelEMiddle.add(panelE);
        panelEMiddle.add(Box.createHorizontalGlue());

        frame.setTitle("Fincas Anónimas S.A");
        frame.getContentPane().add(BorderLayout.NORTH, panelN);
        frame.getContentPane().add(BorderLayout.WEST, panelWMiddle);
        frame.getContentPane().add(BorderLayout.EAST, panelEMiddle);
        frame.getContentPane().add(BorderLayout.SOUTH, panelS);
        frame.setVisible(true);

    }

    class TXcattleIDActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String inputText = TXcattleID.getText();
            int numID = Integer.parseInt(inputText);
        }
    }

    class exitActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            frame.dispose();
        }
    }

    class delActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            removeInfo.removeCattle(Integer.parseInt(TXcattleID.getText()));
            labelS.setText("Record Deleted! Delete Another One or Exit");
        }
    }

}

