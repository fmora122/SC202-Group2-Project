/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

/**
 *
 * @author fmora
 */
public class dateCalc {
    private LocalDate start = null; private LocalDate end = null;
    
    // this method collects year, month and day as integers and constructs a date formatted object
    public LocalDate collectDate() {
        int year = 0;
        int month = 0;
        int day = 0;
        year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year"));
        month= Integer.parseInt(JOptionPane.showInputDialog("Enter the month"));
        day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day"));
        LocalDate newDate = LocalDate.of(year, month, day);
        return newDate;
    }
    // here we receive 2 dates and calculate how many days are in between start and end date
    public int restCalc(LocalDate start1, LocalDate end1) {
        Period restPeriod = Period.between(start1, end1);
        int result = restPeriod.getDays();
        return result;
    }

}
