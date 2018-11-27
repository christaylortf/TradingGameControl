/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradinggamecontrol;

import java.util.Scanner;

/**
 *
 * @author christa
 */
public class companies {
    
    public static String companies[];
    public static void createCompany() {
        if (companies == null) {
            String companyName = scan.string("Enter Company Name:");
            companies[companies.length+1] = companyName;
        } else {
            String name = scan.string("Enter Company Name");
            companies[0] = "The World Bank";
            companies[1] = name;
        }
        
        
        
    }
}
