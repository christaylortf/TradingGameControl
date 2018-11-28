package tradinggamecontrol;

import java.util.Scanner;

/**
 *
 * @author Chris Taylor - crtaylor.co.uk
 */
public class TradingGameControl {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
      
        System.out.println("\n\n=== World Trading Game ===");
        int choice = printMenu();
        
        switch(choice) {
            case 0:
                System.out.println("Bye!");
                System.exit(0);
                break;
            case 1:
                companies.createCompany();
                break;
            case 2:
                companies.listCompanies();
                break;
            case 3:
                int companyNum = scan.integer("Enter company number");
                worldBank.tax(companyNum);
                break;
            case 4: 
                break;
            default:
                System.out.println("Not a valid option. Try again.");
        }
        
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
