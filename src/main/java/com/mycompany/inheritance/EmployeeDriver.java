package com.mycompany.inheritance;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;


public class EmployeeDriver {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        SalariedEmployee firstEmployee = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee secondEmployee = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25,32);
        HourlyEmployee thirdEmployee = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19,47);
        CommisionEmployee forthEmployee = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 15,50000);
        SalariedEmployee fifthEmployee = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee sixthEmployee = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommisionEmployee seventhEmployee = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22,40000);
        
        String[] columnNames = {"First name","Last name ","Social Sec#", "Weekly Salary ", "Wage ", "Hours worked ","Com rate ", "Gross salary","Base Salary"};
        
        Object[][] data = {
            {"First name","Last name ","Social Sec#", "Weekly Salary ", "Wage ", "Hours worked ","Com rate ", "Gross salary","Base Salary"},
            {firstEmployee.getFirstName(), firstEmployee.getLastName(), firstEmployee.getSSN(), "$"+firstEmployee.getWeeklySalary(), "", "", "", "", ""},
            {secondEmployee.getFirstName(), secondEmployee.getLastName(), secondEmployee.getSSN(), "", "$"+secondEmployee.getWage(), secondEmployee.getNumHoursWorked(), "", "", ""},
            {thirdEmployee.getFirstName(), thirdEmployee.getLastName(), thirdEmployee.getSSN(), "", "$"+thirdEmployee.getWage(), thirdEmployee.getNumHoursWorked(), "", "", ""},
            {forthEmployee.getFirstName(), forthEmployee.getLastName(), forthEmployee.getSSN(), "", "", "", forthEmployee.getComRate()+"%", "$"+forthEmployee.getGrossSales(), ""},
            {fifthEmployee.getFirstName(), fifthEmployee.getLastName(), fifthEmployee.getSSN(), "$"+fifthEmployee.getWeeklySalary(), "", "", "", "", ""},
            {sixthEmployee.getFirstName(), sixthEmployee.getLastName(), sixthEmployee.getSSN(), "", "", "", "", "", "$"+sixthEmployee.getBaseSalary()},
            {seventhEmployee.getFirstName(), seventhEmployee.getLastName(), seventhEmployee.getSSN(), "", "", "", seventhEmployee.getComRate()+"%", "$"+seventhEmployee.getGrossSales(), ""}
        };
        
        JTable table = new JTable(data, columnNames);
        
        frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,400);
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);
    }
    
}
