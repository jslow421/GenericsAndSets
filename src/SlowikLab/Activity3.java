/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlowikLab;

import common.Employee;
import common.Dog;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author John Slowik <jslowik@my.wctc.edu>
 */
public class Activity3 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Smith", "Jim", "123-23-0987");
        Employee employee2 = new Employee("Stone", "Jeff", "456-83-8787");
        Dog dog1 = new Dog("Woodford", 12345);
        
        List  mammalList = new ArrayList();
        
        mammalList.add(employee1.toString());
        mammalList.add(employee2.toString());
        mammalList.add(dog1.toString());
        
        for (int i = 0; i < mammalList.size(); i++) {
            String output = (String)mammalList.get(i);
            System.out.println(output);
        }
        
    }
    
}
