package tradinggamecontrol;

import java.util.Scanner;

/**
 *
 * @author christa
 */
public class companies {
    
    public static String[] companies = new String[]{"THE WORLD BANK", "Company 1", "Company 2", "Company 3", "Companny 4", "Company 5"};
    public static void createCompany() {
        for(int cnt=0;cnt<companies.length;cnt++)
        {  
            System.out.println(cnt + " - " + companies[cnt]);
        }  
        int companyNum = scan.integer("Enter company number");
        String companyName = scan.string("Enter new Company Name");
        if (companyNum != 0) {
            companies[companyNum] = companyName;
            worldBank.balances[companyNum] = 200.00;
            System.out.println("\n================= \nCompany Number: " + companyNum);
            System.out.println("Company Name: " + companies[companyNum] + "\n=====================");
        } else {
            System.out.println("Sorry, you can't change the name of the world bank.");
        }
    }
    
    public static void listCompanies() {
        for(int cnt=0;cnt<companies.length;cnt++)
        {  
            System.out.println(cnt + " - " + companies[cnt] + " - £" + worldBank.balances[cnt]);
        } 
    }
}
