/*
 * This software was written by John Slowik
 * Please don't do anything he wouldn't do
 *
 */
package SlowikLab;

import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author John Slowik <jslowik@my.wctc.edu>
 */
public class Activity4 {
    public static void main(String[] args) {
         List <Employee> employeeList = new ArrayList<>();
         
        
        Employee employee1 = new Employee("Smith", "Jim", "123-23-0987");
        Employee employee2 = new Employee("Stone", "Jeff", "456-83-8787");
        Employee employee3 = new Employee("Slater", "Julia", "765-29-7654");
        Employee employee4 = new Employee("Davis", "David", "456-83-8787");
        
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        
        Set <Employee> employeeHash = new HashSet<>(employeeList);
        employeeList.clear();
        employeeList.addAll(employeeHash);
        employeeHash = null;
        
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
       
        
    }
    
}
