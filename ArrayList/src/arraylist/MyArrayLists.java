package arraylist;

import java.util.*;

public class MyArrayLists {

    public static void main(String[] args) {

        // create an ArrayList that holds references to String Objects
        System.out.println("Process: Create a ArrayList \"names\" to hold Objects of type String");

        ArrayList<String> names = new ArrayList<>();

        //print size of ArrayList
        System.out.println("names size (numner of objects stored): " + names.size());

        // Add three String references
        System.out.println("\nProcess: Create three String Objects holdin content \"Yuliet\", \"Melkis\", \"Primitivo\" and adding three references to each if these to the ArrayList \"names\"");

        names.add("Yuliet");
        names.add("Melkis");
        names.add("Primitivo");

        //Access and print some of the String Objects, in this case ArrayList element 0 and 1
        System.out.println("Process: Printing the Objects in element 0 and 1 by using get-method of Class ArrayList (one element at time)");

        System.out.println("element 0: " + names.get(0));
        System.out.println("element 1: " + names.get(1));

        //print size of ArrayList
        System.out.println("names size (numner of objects stored): " + names.size());

        //Change replace the String Object in position 0 to a new String Object = "Robert"
        System.out.println("\nProcess: Change element 0 to \"Robert\" ");

        names.set(0, "Robert");

        //Print the whole ArrayList to control change has taken effect
        System.out.println("Process: Printing the whole ArrayList \"names\" by invoking the default toString method of ArrayList");

        System.out.println(names);

        //Create and place a new Strig Object at element position 1 using ArrayList method add(1, "Carlos") where number represent position in the ArrayList \"names\" 
        System.out.println("\nProcess: Create String Object \"Carlos\" and place in position 1 using ArrayList method add(1, \"Carlos\") which pushes the rest of list one position");

        names.add(1, "Carlos");

        //Print the whole ArrayList to control change has taken effect
        System.out.println("Process: Printing the whole ArrayList \"names\" by invoking the default toString method of ArrayList");

        System.out.println(names);

        //Printing all elemens line by by using "fore-loop" where I can declare a local variable
        System.out.println(""); //extra radbryt för syns skull

        for (Object x : names) {
            System.out.println(x);
        }

        //Hittade även denna som gör samma sak. Dock kanske mer begränsad än ovan då den inte har {} att skriva kod syntax innanför..?
        System.out.println(""); //extra radbryt för syns skull
        names.forEach(x -> System.out.println(x));
        
        //remove Carlos
        System.out.println("\nProcess: Remove Carlos by position 1");

        names.remove(1);

        System.out.println(""); //extra radbryt för syns skull
        names.forEach(x -> System.out.println(x));

        //Access and print out the Objects
        System.out.println(""); //extra radbryt för syns skull

        for (int i = 0; i < names.size(); i++) {
            System.out.println("element " + i + ": " + names.get(i));
        }

        //Add another Robert
        System.out.println("\nAdding another Robert");
        names.add("Robert");

        for (int i = 0; i < names.size(); i++) {
            System.out.println("element " + i + ": " + names.get(i));
        }

        //Remove Robert ----- kolla upp hur denna skiten fungerar!!!!!!!!!!
        System.out.println("\nRemove Robert by names.remove(\"Robert\")");
        names.remove("Robert");

        for (int i = 0; i < names.size(); i++) {
            System.out.println("element " + i + ": " + names.get(i));
        }

        names.remove(0);
        System.out.println("");

        for (int i = 0; i < names.size(); i++) {
            System.out.println("element " + i + ": " + names.get(i));
        }

    }

}
