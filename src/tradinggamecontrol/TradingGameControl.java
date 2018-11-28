package tradinggamecontrol;

import java.util.Scanner;
import tradinggamecontrol.GUI.mainMenu;

/**
 *
 * @author Chris Taylor - crtaylor.co.uk
 */
public class TradingGameControl {

    public static void main(String[] args) {
        System.out.println("Use the GUI?");
        String gui = "N"; //scan.string("Use the GUI (Y/N");
        if (gui.equalsIgnoreCase("Y")) {
            mainMenu mm = new mainMenu();
            mm.show();
        } else {
        menu();
        }
    }
    
    public static void menu() {
      
        System.out.println("\n\n=== World Trading Game ===");
        int choice = printMenu();

        switch(choice) {
            case 0:
                System.out.println("Bye!");
                core.resetPage();
                System.exit(0);
                break;
            case 1:
                companies.createCompany();
                break;
            case 2:
                companies.listCompanies();
                break;
            case 3:
                int companyFrom = scan.integer("From company number");
                int companyTo = scan.integer("To company number");
                double amount = scan.Double("Enter amount £");
                worldBank.transfer(companyTo, companyFrom, amount);
                break;
            case 4: 
                int companyNum = scan.integer("Enter amount to tax");
                worldBank.tax(companyNum);
                break;
            default:
                System.out.println("Not a valid option. Try again.");
        }
        core.updatePage();
        menu();
    }
    
    public static int printMenu() {
        System.out.println("1 - Create Company");
        System.out.println("2 - List Companies");
        System.out.println("3 - Transfer Money");
        System.out.println("4 - Tax All Comapnies");
        System.out.println("5 - Add Money");
        System.out.println("6 - Remove Money");
        System.out.println("0 - Exit");
        
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        
        return choice;
    }
}
