package tradinggamecontrol;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author christa
 */
public class core {
    public static boolean devMode = true;
    
    public static void updatePage() {
        String htmlTemplate = template();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("update.html"));
            bw.write(htmlTemplate);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(core.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void resetPage() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("update.html"));
            bw.write("<html><head><title>38th Rossendale Scout Group</title><meta http-equiv=\"refresh\" content=\"2\" ></head><p>No bank instance started.</p></html>");
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(core.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String template() {
        String htmltemplate = "";
        htmltemplate = "<html><head><title>38th Rossendale Scout Group</title><meta http-equiv=\"refresh\" content=\"2\" ></head><body><h1 align=\"center\">Bank Status</h1><h2>World Bank Balance: £%%world.bank.balance%%</h2><style type=\"text/css\">.tg {border-collapse:collapse;border-spacing:0;border-color:#aaa;}.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aaa;color:#333;background-color:#fff;}.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aaa;color:#fff;background-color:#f38630;}.tg .tg-84g4{font-size:24px;text-align:center;vertical-align:top}.tg .tg-dg7a{background-color:#FCFBE3;text-align:center;vertical-align:top}.tg .tg-0lax{text-align:center;vertical-align:top}</style><table class=\"tg\" align=\"center\"> <tr><th class=\"tg-84g4\">Company ID</th><th class=\"tg-84g4\">Company Name</th><th class=\"tg-84g4\">Bank Balance</th> </tr> <tr><td class=\"tg-dg7a\">%%company1_num%%</td><td class=\"tg-dg7a\">%%company1_name%%</td><td class=\"tg-dg7a\">£%%company1_balance%%</td> </tr> <tr><td class=\"tg-0lax\">%%company2_num%%</td><td class=\"tg-0lax\">%%company2_name%%</td><td class=\"tg-0lax\">£%%company2_balance%%</td> </tr> <tr><td class=\"tg-dg7a\">%%company3_num%%</td><td class=\"tg-dg7a\">%%company3_name%%</td><td class=\"tg-dg7a\">£%%company3_balance%%</td> </tr> <tr><td class=\"tg-0lax\">%%company4_num%%</td><td class=\"tg-0lax\">%%company4_name%%</td><td class=\"tg-0lax\">£%%company4_balance%%</td> </tr> <tr><td class=\"tg-dg7a\">%%company5_num%%</td><td class=\"tg-dg7a\">%%company5_name%%</td><td class=\"tg-dg7a\">£%%company5_balance%%</td> </tr></table></body></html>";
        String output = replace(htmltemplate);
        return output;
    }
    
    public static String replace(String template) {
        template = template.replaceFirst("%%company1_num%%", "1");
        template = template.replaceFirst("%%company2_num%%", "2");
        template = template.replaceFirst("%%company3_num%%", "3");
        template = template.replaceFirst("%%company4_num%%", "4");
        template = template.replaceFirst("%%company5_num%%", "5");
        
        template = template.replaceFirst("%%company1_name%%", companies.companies[1]);
        template = template.replaceFirst("%%company2_name%%", companies.companies[2]);
        template = template.replaceFirst("%%company3_name%%", companies.companies[3]);
        template = template.replaceFirst("%%company4_name%%", companies.companies[4]);
        template = template.replaceFirst("%%company5_name%%", companies.companies[5]);
        
        template = template.replaceFirst("%%world.bank.balance%%", Double.toString(worldBank.balances[0]));
        template = template.replaceFirst("%%company1_balance%%", Double.toString(worldBank.balances[1]));
        template = template.replaceFirst("%%company2_balance%%", Double.toString(worldBank.balances[2]));
        template = template.replaceFirst("%%company3_balance%%", Double.toString(worldBank.balances[3]));
        template = template.replaceFirst("%%company4_balance%%", Double.toString(worldBank.balances[4]));
        template = template.replaceFirst("%%company5_balance%%", Double.toString(worldBank.balances[5]));
        
        return template;
    }
}
