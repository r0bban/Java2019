package Sorting;

import Models.ChiefOfPolice;
import Models.Cop;
import Models.CopManager;
import static Models.CopManager.cops;
import static Models.CopManager.keyboard;
import Models.Lieutenant;
import Models.Officer;
import Models.Sergeant;
import UI.UI;
import Utilities.GenderType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sorting {
//ArrayList<Cop> cops;

    public static void nameAscending() {
        UI.printHeader();
        cops.stream()
                .sorted((name1, name2) -> name1.getName().compareTo(name2.getName()))
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void nameDescending() {
        UI.printHeader();
        cops.stream()
                .sorted((name1, name2) -> name2.getName().compareTo(name1.getName()))
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void ageAscending() {
        UI.printHeader();
        cops.stream()
                .sorted((Cop cop1, Cop cop2) -> (int) (cop1.getAge() - cop2.getAge()))
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void ageDescending() {
        UI.printHeader();
        cops.stream()
                .sorted((Cop cop1, Cop cop2) -> (int) (cop2.getAge() - cop1.getAge()))
                .forEach(System.out::println);
        UI.printFinish();
    }
    
    public static void salaryAscending() {
        UI.printHeader();
        cops.stream()
                .sorted((Cop cop1, Cop cop2) -> (int) (cop1.getIndividualBaseSalary()- cop2.getIndividualBaseSalary()))
                .forEach(System.out::println);
        UI.printFinish();
    }
    public static void salaryDescending() {
        UI.printHeader();
        cops.stream()
                .sorted((Cop cop1, Cop cop2) -> (int) (cop2.getIndividualBaseSalary()- cop1.getIndividualBaseSalary()))
                .forEach(System.out::println);
        UI.printFinish();
    }
    public static void arrestAscending() {
        UI.printHeader();
        cops.stream()
                .sorted((Cop cop1, Cop cop2) -> (int) (cop1.getIndividualArrests()- cop2.getIndividualArrests()))
                .forEach(System.out::println);
        UI.printFinish();
    }
    public static void arrestDescending() {
        UI.printHeader();
        cops.stream()
                .sorted((Cop cop1, Cop cop2) -> (int) (cop2.getIndividualArrests()- cop1.getIndividualArrests()))
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void genderFemaleSort() {
        UI.printHeader();
        cops.stream()
                .filter(cop -> cop.getGenderType() == GenderType.FEMALE)
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void genderMaleSort() {
        UI.printHeader();
        cops.stream()
                .filter(cop -> cop.getGenderType() == GenderType.MALE)
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void genderUnknownSort() {
        UI.printHeader();
        cops.stream()
                .filter(cop -> cop.getGenderType() == GenderType.UNKNOWN)
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void newestCopSort() {
        UI.printHeader();
        cops.stream()
                .sorted((cop1, cop2) -> (int) (cop1.getEmplymentYears() - cop2.getEmplymentYears()))
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void oldestCopSort() {
        UI.printHeader();
        cops.stream()
                .sorted((cop1, cop2) -> (int) (cop2.getEmplymentYears() - cop1.getEmplymentYears()))
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void officerSort() {
        UI.printHeader();
        cops.stream()
                .filter(cop -> cop instanceof Officer)
                .map(cop -> cop.toString())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void sergeantSort() {
        UI.printHeader();
        cops.stream()
                .filter(cop -> cop instanceof Sergeant)
                .map(cop -> cop.toString())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void lieutenantSort() {
        UI.printHeader();
        cops.stream()
                .filter(cop -> cop instanceof Lieutenant)
                .map(cop -> cop.toString())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void chiefOfPoliceSort() {
        UI.printHeader();
        cops.stream()
                .filter(cop -> cop instanceof ChiefOfPolice)
                .map(cop -> cop.toString())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static List<Cop> findCop(Predicate<Cop> searchCriteria) {
        return cops.stream().filter(searchCriteria).collect(Collectors.toList());
    }

//    public static List searchCop() {
//        System.out.print("Input search word: ");
//        String searchWord = CopManager.keyboard.nextLine();
//        s = Sorting.findCop(cop -> cop.getName().toLowerCase().contains(searchWord)).forEach(System.out::println);
//        return s;
//    }

  

}
