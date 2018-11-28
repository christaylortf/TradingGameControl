package tradinggamecontrol;

import tradinggamecontrol.GUI.*;

public class guiController {
    static mainMenu mm = new mainMenu();
    static registerCompany rc = new registerCompany();
    static addFunds tm = new addFunds();
    static taxCompanies tc = new taxCompanies();
    static addFunds af = new addFunds();
    static removeFunds rf = new removeFunds();
    
    public static void mainMenu() {
        core.updatePage();
        mm.setVisible(true);
    }
    
    public static void registerCompany() {
        rc.setVisible(true);
    }
    
    public static void transferMoney() {
        tm.setVisible(true);
    }
    
    public static void taxCompanies() {
        tc.setVisible(true);
    }
    
    public static void addfunds() {
        af.setVisible(true);
    }
    
    public static void removeFunds() {
        rf.setVisible(true);
    }
}
