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
      
        System.out.println("=== World Trading Game ===");
        int choice = printMenu();
        
        switch(choice) {
            case 0:
                System.out.println("Bye!");
                System.exit(0);
                break;
            case 1:
                companies.createCompany();
                printMenu();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4: 
                break;
            default:
                System.out.println("Not a valid option. Try again.");
                menu();
        }
    }
    
    public static int printMenu() {
        System.out.println("1 - Create Company");
        System.out.println("2 - Transactions");
        System.out.println("3 - World Bank");
        System.out.println("4 - Status");
        System.out.println("0 - Exit");
        
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        
        return choice;
    }
}
