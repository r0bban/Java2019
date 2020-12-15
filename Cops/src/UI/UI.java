package UI;

import Utilities.GenderType;

public class UI {
    
//    public static void menuHeaderBottom(){
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//    }
    public static void menuHeaderBottom3(){
        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void menuHeaderBottom4(){
        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void menuHeaderBottom5(){
        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void menuHeaderBottom8(){
        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void menuHeaderTop(){
        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    

    public static void printHeader() {
        System.out.println("===================================================================");
        System.out.println(regularKategori());

    }

    public static String regularKategori() {
        return UI.fixLength("Department", 11) + "| " + UI.fixLength("ID", 5) + "| " + UI.fixLength("Name", 20) + "| " + UI.fixLength("Age", 3) + "| " + UI.fixLength("Gender", 8) + "| Salary";
    }

    public static void printFinish() {
        System.out.println("===================================================================");
    }
    public static void uiLine() {
        System.out.println("___________________________________________________________________\n");
    }

    public static String fixLength(String start, int length) {
        if (start.length() >= length) {
            return start.substring(0, length);
        } else {
            while (start.length() < length) {
                start += " ";
            }
            return start;
        }
    }

    public static String fixLength(int start, int length) {
        String startString = String.valueOf(start);
        return UI.fixLength(startString, length);
    }
    
    public static String fixLength(double start, int length) {
        String startString = String.valueOf(start);
        return UI.fixLength(startString, length);
    }

    public static String fixLength(GenderType gender, int length) {
        String startString = String.valueOf(gender);
        return UI.fixLength(startString, length);
    }

}
