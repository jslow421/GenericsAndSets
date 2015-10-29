/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlowikLab;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author John Slowik <jslowik@my.wctc.edu>
 */
public class Activity2 {
    public static void main(String[] args) {
        
        List <String> employeeList = new ArrayList<String>();
        
        Employee employee1 = new Employee("Smith", "Jim", "123-23-0987");
        Employee employee2 = new Employee("Stone", "Jeff", "456-83-8787");
        Employee employee3 = new Employee("Slater", "Julia", "765-29-7654");
        
        employeeList.add(employee1.toString());
        employeeList.add(employee2.toString());
        employeeList.add(employee3.toString());
        
        
        
    }
}
