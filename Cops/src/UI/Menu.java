package UI;

import Models.Cop;
import Models.CopManager;
import static Models.CopManager.cops;
import Sorting.Sorting;
import static Models.CopManager.printAll;
import static Models.CopManager.printShortList;
import static Models.CopManager.setCopGender;
import static Models.CopManager.setDate;
import static Models.CopManager.stringInput;
import static Models.CopManager.tryCatchUserInputMenu;
import Statistisc.Statistics;
import Utilities.GenderType;
import java.time.LocalDate;

public class Menu {

    public static void menu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU ");
            System.out.println("[1] Management");
            System.out.println("[2] Police Force");
            System.out.println("[3] Statistics");
            System.out.println("[0] Close program");
            UI.uiLine();
            System.out.print("Choose between [1][2][3][0]");
            int menuNumbers = 3;
            int choice = CopManager.tryCatchUserInputMenu(menuNumbers);
            switch (choice) {
                case 1:
                    managamentMenu();
                    break;
                case 2:
                    printCopMenu();
                    break;
                case 3:
                    statisticsMenu();
                    break;
                case 0:
                    System.out.println("Exit program");
                    menuLoop = false;
                    break;

            }
        }
    }

    public static void managamentMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Management");
            System.out.println("[1] Add/ Hire a new cop");
            System.out.println("[2] Update information");
            System.out.println("[3] Fire a cop");
            System.out.println("[0] Back to 'Main Menu'");
            UI.uiLine();
            System.out.print("Choose between [1][2][3][0]");
            int menuNumbers2 = 3;
            int case1choice = CopManager.tryCatchUserInputMenu(menuNumbers2);
            switch (case1choice) {
                case 1:
                    addHire();
                    break;
                case 2:
                    upDateMenu();
                    break;
                case 3:
                    CopManager.removeCopById();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void addHire() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Management | Add/ Hire a new cop");
            System.out.println("[1] Register an existing cop");
            System.out.println("[2] Hire a new Cop");
            System.out.println("[0] Back to 'Management'");
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int choice = tryCatchUserInputMenu(2);
            switch (choice) {
                case 1:
                    addNewCop();
                    break;
                case 2:
                    hireANewCop();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void addNewCop() {

        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Management | Add/ Hire a new cop | Register an existing cop");
            System.out.println("[1] Officer");
            System.out.println("[2] Sergeant");
            System.out.println("[3] Lieutenant");
            System.out.println("[4] Chief of Police");
            System.out.println("[0] Back to 'Add/ Hire a new employee'");
            UI.uiLine();
            System.out.print("Choose between [1][2][3][4][0]");
            int choice = tryCatchUserInputMenu(4);
            switch (choice) {
                case 1:
                    CopManager.addOfficer();
                    break;
                case 2:
                    CopManager.addSergeant();
                    break;
                case 3:
                    CopManager.addLieutenant();
                    break;
                case 4:
                    CopManager.addChiefOfPolice();
                    break;
                case 0:
                    System.out.println("\nBack to");
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void hireANewCop() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Management | Add/ Hire a new employee | Hire a new ");
            System.out.println("[1] Officer");
            System.out.println("[2] Sergeant");
            System.out.println("[3] Lieutenant");
            System.out.println("[4] Chief of Police");
            System.out.println("[0] Back");
            UI.uiLine();
            System.out.print("Choose between [1][2][3][4][0]");
            int choice = tryCatchUserInputMenu(4);
            switch (choice) {
                case 1:
                    CopManager.hireOfficer();
                    break;
                case 2:
                    CopManager.hireSergeant();
                    break;
                case 3:
                    CopManager.hireLieutenant();
                    break;
                case 4:
                    CopManager.hireChiefOfPolice();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void searchCopMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Search after Cop by:");
            System.out.println("[1] Name");
            System.out.println("[2] Cop ID badge");
            System.out.println("[0] Back to 'Police Force'");
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int menuNumbers = 2;
            int menuChoice = CopManager.tryCatchUserInputMenu(menuNumbers);
            switch (menuChoice) {
                case 1:
                    CopManager.printOneByName();
                    break;
                case 2:
                    CopManager.printOneById();
                    break;
                case 0:
                    menuLoop = false;
                    break;

            }
        }
    }

    public static void printCopMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force");
            System.out.println("[1] Show all");
            System.out.println("[2] Sort Cop");
            System.out.println("[3] Search after Cop");
            System.out.println("[0] Back to 'MAIN MENU'");
            UI.uiLine();
            System.out.print("Choose between [1][2][3][0]");
            int menuNumbers = 3;
            int menuChoice = CopManager.tryCatchUserInputMenu(menuNumbers);
            switch (menuChoice) {
                case 1:
                    printAll();
                    break;
                case 2:
                    sortMenu();
                    break;
                case 3:
                    searchCopMenu();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void sortMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop ");
            System.out.println("[1] by Age");
            System.out.println("[2] by Name");
            System.out.println("[3] by Salary");
            System.out.println("[4] by Arrests");
            System.out.println("[5] by Gender");
            System.out.println("[6] by Employee years");
            System.out.println("[7] by Department");
            System.out.println("[0] Back to 'Police Force'");
            UI.uiLine();
            System.out.print("Choose between [1][2][3][4][5][6][7][0]");
            int menuNumbers = 7;
            int menuChoice = CopManager.tryCatchUserInputMenu(menuNumbers);
            switch (menuChoice) {
                case 1:
                    sortByAgeMenu();
                    break;
                case 2:
                    sortByNameMenu();
                    break;
                case 3:
                    sortBySalaryMenu();
                    break;
                case 4:
                    sortByArrestMenu();
                    break;
                case 5:
                    sortByGenderMenu();
                    break;
                case 6:
                    sortByEmployeeMenu();
                    break;
                case 7:
                    sortByDepartment();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }

        }
    }

    public static void sortByAgeMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Age ");
            System.out.println("[1] Ascending");
            System.out.println("[2] Descending");
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int menuNumbers = 2;
            int menuChoice = CopManager.tryCatchUserInputMenu(menuNumbers);
            switch (menuChoice) {
                case 1:
                    UI.printHeader();
                    Sorting.ageAscending();
                    UI.printFinish();
                    menuLoop = false;
                    break;
                case 2:
                    UI.printHeader();
                    Sorting.ageDescending();
                    UI.printFinish();
                    menuLoop = false;
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }

        }
    }

    public static void sortBySalaryMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Salary ");
            System.out.println("[1] Ascending");
            System.out.println("[2] Descending");
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int menuNumbers = 2;
            int menuChoice = CopManager.tryCatchUserInputMenu(menuNumbers);
            switch (menuChoice) {
                case 1:
                    UI.printHeader();
                    Sorting.salaryAscending();
                    UI.printFinish();
                    menuLoop = false;
                    break;
                case 2:
                    UI.printHeader();
                    Sorting.salaryDescending();
                    UI.printFinish();
                    menuLoop = false;
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }

        }
    }

    public static void sortByNameMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Name ");
            System.out.println("[1] Ascending");
            System.out.println("[2] Descending");
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int menuNumbers = 2;
            int menuChoice = CopManager.tryCatchUserInputMenu(menuNumbers);
            switch (menuChoice) {
                case 1:
                    UI.printHeader();
                    Sorting.nameAscending();
                    UI.printFinish();
                    menuLoop = false;
                    break;
                case 2:
                    UI.printHeader();
                    Sorting.nameDescending();
                    UI.printFinish();
                    menuLoop = false;
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }

        }
    }

    public static void sortByArrestMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Arrest ");
            System.out.println("[1] Ascending");
            System.out.println("[2] Descending");
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int menuNumbers = 2;
            int menuChoice = CopManager.tryCatchUserInputMenu(menuNumbers);
            switch (menuChoice) {
                case 1:
                    UI.printHeader();
                    Sorting.arrestAscending();
                    UI.printFinish();
                    menuLoop = false;
                    break;
                case 2:
                    UI.printHeader();
                    Sorting.arrestDescending();
                    UI.printFinish();
                    menuLoop = false;
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }

        }
    }

    public static void upDateMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Management | Update information");
            System.out.println("[1] Personal information");
            System.out.println("[2] Perfomance data");
            System.out.println("[0] Back to 'Management'");
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int menuNumberMaxValue = 2;
            int choice = tryCatchUserInputMenu(menuNumberMaxValue);
            switch (choice) {
                case 1:
                    upDatePersonalInformation();
                    break;
                case 2:
                    upDatePerfomanceData();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void upDatePersonalInformation() {
        System.out.println("MAIN MENU | Management | Update information | Personal information");
        UI.uiLine();
        printShortList();
        System.out.print("Enter Cop ID badge to edit");
        int id = tryCatchUserInputMenu(cops.size());
        for (Cop cop : cops) {
            if (cop.getBadgeId() == id) {
                System.out.println("\nEdit " + cop.getName() + " with badge ID number [" + cop.getBadgeId() + "] personal information");
                boolean menuLoop = true;
                while (menuLoop) {
                    System.out.println("[1] Name");
                    System.out.println("[2] Gender");
                    System.out.println("[3] Adress");
                    System.out.println("[4] Birthdate");
                    System.out.println("[0] Back");
                    System.out.print("\nChoose between [1][2][3][4][0]");
                    int menuChoice = tryCatchUserInputMenu(4);
                    switch (menuChoice) {
                        case 1:
                            upDateCopName(cop);
                            break;
                        case 2:
                            upDateCopGender(cop);
                            break;
                        case 3:
                            upDateCopAdress(cop);
                            break;
                        case 4:
                            upDateBirthDate(cop);
                            break;
                        case 0:
                            menuLoop = false;
                            break;
                    }
                }
            }
        }
    }

    public static void upDatePerfomanceData() {
        System.out.println("MAIN MENU | Management | Update information | Perfomance data");
        UI.uiLine();
        printShortList();
        System.out.print("Enter Cop ID badge");
        int id = tryCatchUserInputMenu(cops.size() - 1);
        for (Cop cop : cops) {
            if (cop.getBadgeId() == id) {
                System.out.println("\nHandle " + cop.getName() + " with badge ID number [" + cop.getBadgeId() + "] perfomance");
                System.out.println("Number of arrest: " + cop.getIndividualArrests() + " | Duties: " + cop.getDuties());
                boolean menuLoop = true;
                while (menuLoop) {
                    System.out.println("[1] Add arrest");
                    System.out.println("[2] Set arrest");
                    System.out.println("[0] Back");
                    System.out.print("\nChoose between [1][2][0]");
                    int menuChoice = tryCatchUserInputMenu(2);
                    switch (menuChoice) {
                        case 1:
                            cop.addArrest();
                            System.out.println(cop.getName() + " has now a total of arrest: " + cop.getIndividualArrests());
                            break;
                        case 2:
                            System.out.print("Set arrest");
                            int setArrest = CopManager.intInput();
                            cop.setIndividualArrests(setArrest);
                            System.out.println(cop.getName() + " has now a total of arrest: " + cop.getIndividualArrests());
                            break;
                        case 0:
                            menuLoop = false;
                            break;

                    }
                }
            }
        }
    }

    public static void upDateBirthDate(Cop cop) {
        System.out.println("Update " + cop.getName() + " birth date");
        LocalDate newBirthday = setDate();
        cop.setBirthday(newBirthday);
        System.out.println(cop.getName() + "s birth date updated\n");
        System.out.println(cop.toString());
    }

    public static void upDateCopAdress(Cop cop) {
        System.out.print("Update " + cop.getName() + " adress");
        String newAdress = stringInput();
        cop.setAdress(newAdress);
        System.out.println(cop.getName() + "s adress updated\n");
        UI.printHeader();
        System.out.println(cop.toString());
    }

    public static void upDateCopGender(Cop cop) {
        System.out.println("Enter " + cop.getName() + " new gender");
        GenderType gender = setCopGender();
        cop.setGender(gender);
        System.out.println(cop.getName() + " has now the gender " + cop.getGenderType());
    }

    public static void upDateCopName(Cop cop) {
        System.out.print("Update cops name");
        String newName = stringInput();
        cop.setName(newName);
        System.out.println(newName + "s name updated\n");
        UI.printHeader();
        System.out.println(cop.toString());
    }

    public static void statisticsMenu() {

        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Statistics");
            System.out.println("[1] Statistics per Department");
            System.out.println("[2] Statistics per Rang");
            System.out.println("[3] Pay-check statistics");
            System.out.println("[0] Back to 'MAIN MENU'");
            UI.uiLine();
            System.out.print("Choose between [1][2][3][0]");
            int menuNumberMaxValue = 3;
            int choice = tryCatchUserInputMenu(menuNumberMaxValue);
            switch (choice) {
                case 1:
                    Statistics.printStatsPerDepartment();
                    break;
                case 2:
                    Statistics.printStatsPerRang();
                    break;
                case 3:
                    Statistics.printPayCheckStatistics();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void sortByGenderMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Gender");
            System.out.println("[1] Female");
            System.out.println("[2] Male");
            System.out.println("[3] Unknown");
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][3][0]");
            int menuNumberMaxValue = 3;
            int choice = tryCatchUserInputMenu(menuNumberMaxValue);
            switch (choice) {
                case 1:
                    Sorting.genderFemaleSort();
                    break;
                case 2:
                    Sorting.genderMaleSort();
                    break;
                case 3:
                    Sorting.genderUnknownSort();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void sortByEmployeeMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Employee years");
            System.out.println("[1] Newest");
            System.out.println("[2] Oldest");
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int menuNumberMaxValue = 2;
            int choice = tryCatchUserInputMenu(menuNumberMaxValue);
            switch (choice) {
                case 1:
                    Sorting.newestCopSort();
                    break;
                case 2:
                    Sorting.oldestCopSort();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void sortByDepartment() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Deparment");
            System.out.println("[1] Officer");
            System.out.println("[2] Sergeant");
            System.out.println("[3] Lieutenant");
            System.out.println("[4] Chief of Police");
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][3][4][0]");
            int menuNumberMaxValue = 4;
            int choice = tryCatchUserInputMenu(menuNumberMaxValue);
            switch (choice) {
                case 1:
                    Sorting.officerSort();
                    break;
                case 2:
                    Sorting.sergeantSort();
                    break;
                case 3:
                    Sorting.lieutenantSort();
                    break;
                case 4:
                    Sorting.chiefOfPoliceSort();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }
}
