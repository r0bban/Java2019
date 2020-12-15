package collectionsinvitelab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsInviteLab {

    public static void main(String[] args) {

        String[] his = {"Zack", "Arvid", "Wilhem", "Anna", "Adam", "Albert", "August", "Doris"};
        String[] hers = {"Stefan", "Sara", "Sune", "Hugo", "Lotta", "Anna", "Albert", "Anton"};
        String[] zacks = {"Hugo", "Albert", "Arvid", "Anna"};

        ArrayList<String> hisFriends = new ArrayList<>(Arrays.asList(his));
        ArrayList<String> herFriends = new ArrayList<>(Arrays.asList(hers));
        ArrayList<String> zacksFriends = new ArrayList<>(Arrays.asList(zacks));

        //Invite all to a party (
        HashSet<String> party = new HashSet<>(hisFriends);
        party.addAll(herFriends);

//        for (String name : party) {
//            System.out.println(name);
//
//        }
        //but Zack is not invited
//        if (party.contains("Zack")) {
//            party.remove("Zack");
//        }
//        
        party.removeIf(namn -> namn.equalsIgnoreCase("Zack"));

        // nor is anyone of his friends
        party.removeAll(zacksFriends);

        // if both Doris and Wilhelm 
        if (party.contains("Doris") && party.contains("Wilhem")) {
            party.remove("Wilhem");
        }

        //if Lotta is invited remove all guests who starts with "A"
        if (party.contains("Lotta")) {
            party.removeIf(name -> name.startsWith("A") || name.startsWith("a"));
        }

//        //Alternativt (1):
//        Iterator<String> iterator = party.iterator();
//
//        while (iterator.hasNext()) {
//            if (iterator.next().startsWith("A")) {
//                iterator.remove();
//            }
//        }

//        //Alternativt (2):
//        ArrayList<String> party2 = new ArrayList<>(party);
//        for (int i = party2.size() - 1; i <= 0; i--) {
//            if (party2.get(i).startsWith("A")) {
//                party2.remove(i);
//            }
//        }

        //create a random placement list
        ArrayList<String> party2 = new ArrayList<>(party);
        
        Collections.shuffle(party2);
        for (String name : party2) {
            System.out.println(name);
        }

    }

}
