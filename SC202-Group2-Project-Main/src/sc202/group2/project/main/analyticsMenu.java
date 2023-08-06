/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.awt.BorderLayout;
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
    private JPanel panelN;
    private JPanel panelW;
    private JPanel panelE;
    private JPanel panelS;
    private JPanel panelWMiddle;
    private JPanel panelEMiddle;
    private JPanel panelMiddle;
    private JLabel labelN;
    private JLabel labelS;
    private JButton buttonExit;
    private JButton buttonView;
    private JLabel status; 
    private JLabel ingressDate;
    private JLabel egressDate;
    private JLabel restTime;
    private JLabel viewStatus; 
    private JLabel viewIngressDate;
    private JLabel viewEgressDate;
    private JLabel viewRestTime;
    private JLabel paddockID;
    private JTextField inputPaddockID;
    private JLabel blank1;
    private JLabel blank2;
    private JLabel blank3;
    private int numID = 0;
    
    public analyticsMenu(){
        analyticsMain();
    }
    public void analyticsMain() {
        
        frame = new JFrame();
        frame.setSize(440, 300);
        
        panelN = new JPanel();
        panelW = new JPanel();
        panelE = new JPanel();
        panelS = new JPanel();
        panelWMiddle = new JPanel();
        panelEMiddle = new JPanel();
        panelMiddle = new JPanel();
        
        buttonExit = new JButton("Exit");
        buttonExit.addActionListener( new exitActionListener());
        buttonView = new JButton("View");
        buttonView.addActionListener( new viewActionListener());
        
        blank1 = new JLabel(" ");
        blank2 = new JLabel(" ");
        blank3 = new JLabel(" ");
        labelN = new JLabel("Paddock Analytics Menu");
        labelS = new JLabel("");
        paddockID = new JLabel("Enter the Paddock ID");
        paddockID.setPreferredSize(new Dimension(165,19));
        status = new JLabel("Status"); 
        status.setPreferredSize(new Dimension(135,19));
        ingressDate = new JLabel("Ingress Date");
        ingressDate.setPreferredSize(new Dimension(135,19));
        egressDate = new JLabel("Egress Date");
        egressDate.setPreferredSize(new Dimension(135,19));
        restTime = new JLabel("Rest Time");
        restTime.setPreferredSize(new Dimension(135,19));
        
        viewStatus = new JLabel(""); 
        viewStatus.setPreferredSize(new Dimension(135,19));
        viewIngressDate = new JLabel("");
        viewIngressDate.setPreferredSize(new Dimension(135,19));
        viewEgressDate = new JLabel("");
        viewEgressDate.setPreferredSize(new Dimension(135,19));
        viewRestTime = new JLabel("");
        viewRestTime.setPreferredSize(new Dimension(135,19));
        
        inputPaddockID = new JTextField(20); 
        inputPaddockID.addActionListener(new inputPaddockIDActionListener());
        
        panelN.add(labelN);
        panelS.add(labelS);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(paddockID);
        panelW.add(blank1);
        panelW.add(status);
        panelW.add(ingressDate);
        panelW.add(egressDate);
        panelW.add(restTime);
        panelW.add(blank2);
        panelW.add(buttonView);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());
        
        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());
        
        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(inputPaddockID);
        panelE.add(blank3);
        panelE.add(viewStatus);
        panelE.add(viewIngressDate);
        panelE.add(viewEgressDate);
        panelE.add(viewRestTime);
        panelE.add(Box.createVerticalGlue());
        
        
        panelEMiddle.add(Box.createHorizontalGlue());
        panelEMiddle.add(panelE);
        panelEMiddle.add(Box.createHorizontalGlue());
        
              
        frame.setTitle("Fincas Anónimas S.A");
        frame.getContentPane() .add(BorderLayout.NORTH, panelN);
        frame.getContentPane() .add(BorderLayout.WEST, panelWMiddle);
        frame.getContentPane() .add(BorderLayout.EAST, panelEMiddle);
        frame.getContentPane() .add(BorderLayout.SOUTH, panelS);
        frame.setVisible(true);
 
    }
    class inputPaddockIDActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            numID = Integer.parseInt(inputPaddockID.getText());
      }
   }
    class viewActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            labelS.setText("Paddock "+numID+". View a New Record or Exit");
            
            viewStatus.setText("NA");
            viewIngressDate.setText("NA");
            viewEgressDate.setText("NA");
            viewRestTime.setText("NA");          
      }
   }    
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }
}
