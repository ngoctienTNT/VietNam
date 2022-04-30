import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NgocTien.TNT
 */

public class VietNam {
    public static void OutputLoading() {
        int i=0;
        while (i<10)
        {
            i++;
            System.out.println("Loading..."+i+"0%");
            try {
                Thread.sleep(700);
            } catch (InterruptedException ex) {
                Logger.getLogger(VietNam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Successful loading...");
        try {
            Thread.sleep(700);
        } catch (InterruptedException ex) {
            Logger.getLogger(VietNam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void InputFile(String url)
    {
        FileInputStream fileInput=null;
        try {
            fileInput=new FileInputStream(url);
            Scanner scanner=new Scanner(fileInput);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(VietNam.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VietNam.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                fileInput.close();
            } catch (IOException ex) {
            Logger.getLogger(VietNam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void OutputSpace() {
        int i=0;
        while(i<15)
        {
            i++;
            System.out.println();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(VietNam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args) {
        boolean kt=true;
        do {       
            System.out.print("Enter password: ");
            Scanner sc=new Scanner(System.in);
            String passwordString=sc.nextLine();
            if (passwordString.equals("Viet Nam vi dai - Ho Chi Minh muon nam"))
            {
                System.out.println("Password correct!");
                try {
                Thread.sleep(700);
                } catch (InterruptedException ex) {
                    Logger.getLogger(VietNam.class.getName()).log(Level.SEVERE, null, ex);
                }
                OutputLoading();
                kt=false;
                InputFile("input1.inp");
                OutputSpace();    
                InputFile("input2.inp");
                OutputSpace(); 
                InputFile("input3.inp");
                OutputSpace();     
                InputFile("input4.inp");
                OutputSpace();        
            }
            else 
            {
                System.out.println("Sorry the password is incorrect! Please re-enter!");
            }
        } while (kt);        
    }    
}
