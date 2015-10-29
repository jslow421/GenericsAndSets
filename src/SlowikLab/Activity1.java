/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlowikLab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author John Slowik <jslowik@my.wctc.edu>
 */
public class Activity1 {
    public static void main(String[] args) {
        /*
        don't forget to do things like override tostring
        
        employee object in common package doesn't implement equal/hash so it will have to
        be done in order to remove duplicates in final challenge
        */
        List hobbyItems = new ArrayList();
        
        hobbyItems.add("Trumpet");
        hobbyItems.add("Music");
        hobbyItems.add("Valve Oil");
        
        for (int i = 0; i < hobbyItems.size(); i++) {
            String output = (String)hobbyItems.get(i);
            System.out.println(output);
        }
        System.out.println("");
        
        hobbyItems.add("Music Stand");
        hobbyItems.add("Tuner");
        
        for (int i = 0; i < hobbyItems.size(); i++) {
            String output = (String)hobbyItems.get(i);
            System.out.println(output);
        }
        System.out.println("");
        hobbyItems.remove(1);
        hobbyItems.remove(3);
        
        for (int i = 0; i < hobbyItems.size(); i++) {
            String output = (String)hobbyItems.get(i);
            System.out.println(output);
        }
        
    }
    
}
