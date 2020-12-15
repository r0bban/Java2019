package UI;

import static UI.PrintController.*;
import integration.CountryDAO;
import integration.CountryDAOImpl;
import java.util.Scanner;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import world.domain.City;
import world.domain.Country;

public class Menu {

    public static Scanner keyboard = new Scanner(System.in);
    static CountryDAO CountryDao = new CountryDAOImpl();

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("worldPU");

    static int tryCatchUserPositiveIntegerInputMenu(int min, int max) {
        int choice = -1;
        try {
            choice = intInput();
            if (choice < min || choice > max) {
                System.out.println("Not in range, try again!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ooops, not a number, try again!");
        }
        return choice;
    }

    public static int intInput() {
        int intInPut = 0;
        boolean loop = true;
        while (loop) {
            System.out.print(": ");
            try {
                intInPut = Integer.parseInt(keyboard.nextLine());
                loop = false;
            } catch (NumberFormatException e) {
                System.out.print("Use numbers");
            }
        }
        return intInPut;
    }

    public static String stringInput() {
        boolean stringIsValid = true;
        String string = "";
        while (stringIsValid) {
            System.out.print(": ");
            char first;
            string = keyboard.nextLine();
            if (string.length() > 0) {
                first = string.charAt(0);
                stringIsValid = false;
            } else {
                System.out.println("invalid input, try again");
            }
        }
        return string;
    }

    public static void menu() {
        boolean menuLoop = true;
        while (menuLoop) {
            System.out.println("\nMAIN MENU ");
            System.out.println("[1] SÖK LAND");
            System.out.println("[2] SÖK STAD");
            System.out.println("[3] SKAPA LAND");
            System.out.println("[4] UPDATERA LAND");
//            System.out.println("[5] SHOW ALL members");
            System.out.println("[0] EXIT PROGRAM");
            System.out.print("\nChoose between [1][2][0]");
            int minIntInclusive = 0;
            int maxIntInclusive = 4;
            int choice = tryCatchUserPositiveIntegerInputMenu(minIntInclusive, maxIntInclusive);
            switch (choice) {
                case 1:
                    searchCountryMenu();
                    break;
                case 2:
                    searchCityMenu();
                    break;
                case 3:
                    createCountryMenu();
                    break;
                case 4:
                    updateCountryMenu();
                    break;
//                case 5:
//                    showAllMembers();
//                    break;
                case 0:
                    System.out.println("Exit program");
                    menuLoop = false;
                    break;

            }
        }
    }

    static void searchCountryMenu() {
        System.out.print("\nSök efter land");
        String country = stringInput();
        printCountryByName(country);
    }

    static void searchCityMenu() {
        System.out.print("\nSök efter stad");
        String city = stringInput();
        printCityByName(city);
    }

    static void createCountryMenu() {

        System.out.print("\nLandets namn");
        String countryName = stringInput();
        System.out.print("Vilken population har  " + countryName);
        int countryPopulation = intInput();
        System.out.print("Kontinent");
        String continent = stringInput();
        System.out.print("Region");
        String region = stringInput();
        System.out.print("Landskod");
        String countryCode = stringInput();
        System.out.print("Huvudstad");
        String capital = stringInput();
        System.out.print("I vilket dirstrikt ligger " + capital);
        String district = stringInput();
        System.out.print("Vilken population har  " + capital);
        int population = intInput();

        City capitalCity = new City();
        capitalCity.setName(capital);
        capitalCity.setDistrict(district);
        capitalCity.setPopulation((long) population);

        Country newCountry = new Country();
        newCountry.setName(countryName);
        newCountry.setContinent(continent);
        newCountry.setRegion(region);
        newCountry.setCode(countryCode);
        newCountry.setCapital(capitalCity);
        newCountry.setPopulation(countryPopulation);

        capitalCity.setCountry(newCountry);

        if (CountryDao.createCountry(newCountry)) {
            System.out.println("Country added");
        } else {
            System.out.println("Problem occred, country not added");
        }
    }

    public static void updateCountryMenu() {

        System.out.println("\nVilket land vill du uppdatera?");
        System.out.print("Ange Landskod");
        String code = stringInput();

        try {
            Country country = CountryDao.getCountryByCode(code);
            int updateIsMade = 0;
            boolean menuLoop = true;
            while (menuLoop) {
                updateIsMade = updateIsMade + 1;
                System.out.println("\nLANDSDATA");
                printCountryForEdit(country);
                int minIntInclusive;
                int maxIntInclusive;
                if (updateIsMade > 1) {
                    System.out.println("\n[5] Bekräfta uppdaterasing");
                }
                System.out.println("[0] Back");

                if (updateIsMade > 1) {
                    System.out.print("\nVälj mellan [1][2][3][4][5][0]");
                    minIntInclusive = 0;
                    maxIntInclusive = 5;
                } else {
                    System.out.print("\nVälj mellan [1][2][3][4][0]");
                    minIntInclusive = 0;
                    maxIntInclusive = 4;
                }

                int choice = tryCatchUserPositiveIntegerInputMenu(minIntInclusive, maxIntInclusive);
                switch (choice) {
                    case 1:
                        updateName(country);
                        break;
                    case 2:
                        updateContinent(country);
                        break;
                    case 3:
                        updateRegion(country);
                        break;
                    case 4:
                        updatePopulation(country);
                        break;
                    case 5:

                        if (CountryDao.updateCountry(country)) {
                            System.out.println("Land uppdaterat");
                        } else {
                            System.out.println("Problem inträffade, land är inte uppdateratnot uppdaterat");
                        }
                        menuLoop = false;
                        break;
                    case 0:
                        menuLoop = false;
                        break;
                }
            }
        } catch (NoResultException nre) {
            System.out.println("Hittade inget land med den landskoden att uppdatera");
        }
    }

    static void updateName(Country country) {
        System.out.print("Nytt namn: ");
        String newFirstName = stringInput();
        country.setName(newFirstName);
        System.out.println("Nytt namn angivet\n");
    }

    static void updateContinent(Country country) {
        System.out.print("Nytt kontinent: ");
        String newCintinent = stringInput();
        country.setContinent(newCintinent);
        System.out.println("Ny kontinent angiven\n");
    }

    static void updateRegion(Country country) {
        System.out.print("Nytt kontinent: ");
        String newRegion = stringInput();
        country.setRegion(newRegion);
        System.out.println("Ny region angiven\n");
    }

    static void updatePopulation(Country country) {
        System.out.print("Ny population: ");
        int newPopulation = intInput();
        country.setPopulation(newPopulation);
        System.out.println("Ny population angiven\n");
    }



//    static void addMemberMenu() {
//        System.out.print("\nFirst Name");
//        String name = stringInput();
//        System.out.print("Last Name");
//        String lastName = stringInput();
//        System.out.print("Birth year (YYYY)");
//        int birthYear = intInput();
//        System.out.print("City");
//        String city = stringInput();
//        if (MemberManager.addMember(name, lastName, birthYear, city)) {
//            System.out.println("Member added");
//        } else {
//            System.out.println("Problem occred, member not added");
//        }
//    }
//
//    static void deleteMemberMenu() {
//        showAllMembers();
//        System.out.println("\nWhich member do you want to delete?");
//        System.out.print("Enter Member ID");
//        int id = intInput();
//        if (MemberManager.deleteMember(id)) {
//            System.out.println("Member deleted");
//        } else {
//            System.out.println("No member with such member ID exist. Member NOT deleted.");
//        }
//    }
//
//    public static void updateMemberMenu() {
//        showAllMembers();
//        System.out.println("\nWhich member do you want to update?");
//        System.out.print("Enter Member ID");
//        int id = intInput();
//
//        if ((getbyId(id)) instanceof Member) {
//            Member member = getbyId(id);
//            int updateIsMade = 0;
//            boolean menuLoop = true;
//            while (menuLoop) {
//                updateIsMade = updateIsMade + 1;
//                System.out.println("\nMEMBER DATA");
//                System.out.println("[1]First name: " + member.getName());
//                System.out.println("[2]Last name: " + member.getLastName());
//                System.out.println("[3]Birth year: " + member.getBirthyear());
//                System.out.println("[4]City: " + member.getCity());
//
//                int minIntInclusive;
//                int maxIntInclusive;
//
//                if (updateIsMade > 1) {
//                    System.out.println("\n[5] Confirm update");
//                }
//                System.out.println("[0] Back");
//
//                if (updateIsMade > 1) {
//                    System.out.print("\nChoose between [1][2][3][4][5][0]");
//                    minIntInclusive = 0;
//                    maxIntInclusive = 5;
//                } else {
//                    System.out.print("\nChoose between [1][2][3][4][0]");
//                    minIntInclusive = 0;
//                    maxIntInclusive = 4;
//                }
//
//                int choice = tryCatchUserPositiveIntegerInputMenu(minIntInclusive, maxIntInclusive);
//                switch (choice) {
//                    case 1:
//                        updateFirstName(member);
//                        break;
//                    case 2:
//                        updateLastName(member);
//                        break;
//                    case 3:
//                        updateBirthYear(member);
//                        break;
//                    case 4:
//                        updateCity(member);
//                        break;
//                    case 5:
//
//                        if (loyaltydaocrud.MemberManager.updateMemberById(member.getId(), member.getName(), member.getLastName(), member.getBirthyear(), member.getCity())) {
//                            System.out.println("Member updated");
//                        } else {
//                            System.out.println("Problem occred, member not updated");
//                        }
//                        menuLoop = false;
//                        break;
//                    case 0:
//                        menuLoop = false;
//                        break;
//                }
//            }
//
//        } else {
//            System.out.println("No member with such member ID found.");
//        }
//    }
//
//    static void updateFirstName(Member member) {
//        System.out.print("New first name: ");
//        String newFirstName = stringInput();
//        member.setName(newFirstName);
//        System.out.println("New first name provided\n");
//    }
//
//    static void updateLastName(Member member) {
//        System.out.print("New last name: ");
//        String newLastName = stringInput();
//        member.setLastName(newLastName);
//        System.out.println("New last name provided\n");
//    }
//
//    static void updateBirthYear(Member member) {
//        System.out.print("New birth year (YYYY): ");
//        int newBirthYear = intInput();
//        member.setBirthyear(newBirthYear);
//        System.out.println("new birth year provided\n");
//    }
//
//    static void updateCity(Member member) {
//        System.out.print("New city: ");
//        String newCity = stringInput();
//        member.setCity(newCity);
//        System.out.println("New city provided\n");
//    }
//
//    static void findMemberMenu() {
//        System.out.println("\nWhich member do you want to update?");
//        System.out.print("Enter Member ID");
//        int id = intInput();
//        if ((getbyId(id)) instanceof Member) {
//            Member member = getbyId(id);
//            System.out.println("\nMEMBER DATA");
//            System.out.println("First name: " + member.getName());
//            System.out.println("Last name: " + member.getLastName());
//            System.out.println("Birth year: " + member.getBirthyear());
//            System.out.println("City: " + member.getCity());
//            System.out.println("Registration date: " + member.getMembershipStartDate());
//        } else {
//            System.out.println("No member with such member ID found.");
//        }
//    }
//
//    static void showAllMembers() {
//        MemberManager.getAllMembers().stream()
//                .forEach(System.out::println);
//    }
}
