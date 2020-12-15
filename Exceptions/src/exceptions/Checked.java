package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Checked {

    static File file = new File("C:\\Users\\rober\\Documents\\myFile2.txt");
    //static Scanner sc = new Scanner(file);

    public static void main(String[] args) {

        //Scanner sc = null;
        try {
            Scanner sc = new Scanner(file);                 // Det går inte att använda Scanner att scanna från fil utan att hantera FileNotFoundException, därför lägger i try+catch
            System.out.println(sc.nextLine());
        } catch (FileNotFoundException ex) {
            System.out.println(file.getPath() + " finns inte");
        }
////////////////////////////////////////////////////
        try {
            getFirstLineInFile();
        } catch (FileNotFoundException ex) {                    //tvingen att hantera (eller hantera efterdsom jag throwade i getFirstLineInFile-metoden 
            Logger.getLogger(Checked.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setNumber("kalle");
    }
    
    
    static void setNumber(Object number){
        if(number instanceof String){
            throw new IllegalArgumentException("kan inte vara text");
        } else if(number instanceof Integer){
        number = (Integer)number+1;
        }
    }

    public static void getFirstLineInFile() throws FileNotFoundException {
        Scanner sc = new Scanner(file);                 // ......
        System.out.println(sc.nextLine());
    }

}
