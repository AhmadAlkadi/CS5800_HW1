/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inheritance;


public class EmployeeDriver {

    public static void main(String[] args) {
        SalariedEmployee firstEmployee = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee secondEmployee = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25,32);
        HourlyEmployee thirdEmployee = new HourlyEmployee("Joe", "Jones", "111-11-1111", 19,47);
        CommisionEmployee forthEmployee = new CommisionEmployee("Joe", "Jones", "111-11-1111", 15,50000);
        SalariedEmployee fifthEmployee = new SalariedEmployee("Joe", "Jones", "111-11-1111", 1700);
        BaseEmployee sixthEmployee = new BaseEmployee("Joe", "Jones", "111-11-1111", 95000);
        CommisionEmployee seventhEmployee = new CommisionEmployee("Joe", "Jones", "111-11-1111", 22,40000);
        
        System.out.println("First name |Last name |Social Sec# | Weekly Salary | Wage |Hours worked |Com rate | Gross salary |Base Salary");
        System.out.println(firstEmployee.getFirstName()+ "| " + firstEmployee.getLastName()+ "| " + firstEmployee.getSSN()+ "| " + firstEmployee.getWeeklySalary());
    }
}
