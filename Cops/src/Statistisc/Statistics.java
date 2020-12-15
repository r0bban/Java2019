package Statistisc;

import Models.CopManager;
import Models.Cop;
import Models.ChiefOfPolice;
import Utilities.GenderType;
import Models.Lieutenant;
import Models.Officer;
import Models.Sergeant;
import UI.UI;

public class Statistics {

    private static double getPercentFromInt(int a, int b) {
        double percent = (Math.round(((double) a / (double) b) * 1000)) / 10.0;
        return percent;
    }

    //Department general
    public static int getDepartmentArrests() {
        int sumDepartmentArrests = 0;
        for (Cop cop : CopManager.cops) {
            sumDepartmentArrests = sumDepartmentArrests + cop.getIndividualArrests();
        }
        return sumDepartmentArrests;
    }

    public static double getAverageBaseSalary() {
        double sumSalary = 0;
        for (Cop cop : CopManager.cops) {
            sumSalary = sumSalary + cop.getIndividualBaseSalary();
        }
        double averageSalary = (int) sumSalary / Cop.getNumberOfCops();
        return averageSalary;
    }

    public static double getAverageBonus() {
        double sumBonus = 0;
        for (Cop cop : CopManager.cops) {
            sumBonus = sumBonus + cop.getBonus();
        }
        double averageBonus = (int) sumBonus / Cop.getNumberOfCops();
        return averageBonus;
    }

    public static double getAverageCompensation() {
        double sumCompensation = 0;
        for (Cop cop : CopManager.cops) {
            sumCompensation = sumCompensation + cop.getCompensation();
        }
        double averageCompensation = (int) sumCompensation / Cop.getNumberOfCops();
        return averageCompensation;
    }

    public static long getAverageAge() {
        long sumAge = 0;
        for (Cop cop : CopManager.cops) {
            sumAge = sumAge + cop.getAge();
        }
        long averageAge = sumAge / Cop.getNumberOfCops();
        return averageAge;
    }

    public static long getAverageEmploymentYears() {
        long sumEmploymentYears = 0;
        for (Cop cop : CopManager.cops) {
            sumEmploymentYears = sumEmploymentYears + cop.getEmplymentYears();
        }
        long averageEmploymentYears = sumEmploymentYears / Cop.getNumberOfCops();
        return averageEmploymentYears;
    }

    public static long getAverageYearsInPosition() {
        long sumYearsInPosition = 0;
        for (Cop cop : CopManager.cops) {
            sumYearsInPosition = sumYearsInPosition + cop.getYearsInPosition();
        }
        long averageYearsInPosition = sumYearsInPosition / Cop.getNumberOfCops();
        return averageYearsInPosition;
    }

    public static int getMalesForDepartment() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop.getGenderType().equals(GenderType.MALE)) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int getFemalesForDepartment() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop.getGenderType().equals(GenderType.FEMALE)) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    //Gender per rang
    public static int getMalesForOfficer() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Officer && cop.getGenderType().equals(GenderType.MALE)) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int getFemalesForOfficer() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Officer && cop.getGenderType().equals(GenderType.FEMALE)) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int getMalesForSergant() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Sergeant && cop.getGenderType().equals(GenderType.MALE)) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int getFemalesForSergant() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Sergeant && cop.getGenderType().equals(GenderType.FEMALE)) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int getMalesForLieutenant() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Lieutenant && cop.getGenderType().equals(GenderType.MALE)) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int getFemalesForLieutenant() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Lieutenant && cop.getGenderType().equals(GenderType.FEMALE)) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int getMalesForChiefOfPolice() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof ChiefOfPolice && cop.getGenderType().equals(GenderType.MALE)) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int getFemalesForChiefOfPolice() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof ChiefOfPolice && cop.getGenderType().equals(GenderType.FEMALE)) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    //Cops employed per rang
    public static int getNumberOfOfficers() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Officer) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int getNumberOfSergants() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Sergeant) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int getNumberOfLieutenant() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Lieutenant) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static int getNumberOfChiefOfPolice() {
        int sum = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof ChiefOfPolice) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    //Average age per rang
    public static long getAverageAgeOfficers() {
        long sumAge = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Officer) {
                sumAge = sumAge + cop.getAge();
            }
        }
        long averageAge = sumAge / getNumberOfOfficers();
        return averageAge;
    }

    public static long getAverageAgeSergants() {
        long sumAge = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Sergeant) {
                sumAge = sumAge + cop.getAge();
            }
        }
        long averageAge = sumAge / getNumberOfSergants();
        return averageAge;
    }

    public static long getAverageAgeLieutenants() {
        long sumAge = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Lieutenant) {
                sumAge = sumAge + cop.getAge();
            }
        }
        long averageAge = sumAge / getNumberOfLieutenant();
        return averageAge;
    }

    public static long getAverageAgeChiefOfPolice() {
        long sumAge = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof ChiefOfPolice) {
                sumAge = sumAge + cop.getAge();
            }
        }
        long averageAge = sumAge / getNumberOfChiefOfPolice();
        return averageAge;
    }

    //Average employment years per rang
    public static long getAverageEmploymentYearsOfficers() {
        long sumEmploymentYears = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Officer) {
                sumEmploymentYears = sumEmploymentYears + cop.getEmplymentYears();
            }
        }
        long averageEmploymentYears = sumEmploymentYears / getNumberOfOfficers();
        return averageEmploymentYears;
    }

    public static long getAverageEmploymentYearsSergants() {
        long sumEmploymentYears = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Sergeant) {
                sumEmploymentYears = sumEmploymentYears + cop.getEmplymentYears();
            }
        }
        long averageEmploymentYears = sumEmploymentYears / getNumberOfSergants();
        return averageEmploymentYears;
    }

    public static long getAverageEmploymentYearsLieutenants() {
        long sumEmploymentYears = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Lieutenant) {
                sumEmploymentYears = sumEmploymentYears + cop.getEmplymentYears();
            }
        }
        long averageEmploymentYears = sumEmploymentYears / getNumberOfLieutenant();
        return averageEmploymentYears;
    }

    public static long getAverageEmploymentYearsChiefOfPolice() {
        long sumEmploymentYears = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof ChiefOfPolice) {
                sumEmploymentYears = sumEmploymentYears + cop.getEmplymentYears();
            }
        }
        long averageEmploymentYears = sumEmploymentYears / getNumberOfChiefOfPolice();
        return averageEmploymentYears;
    }

    //Average years in position  per rang
    public static long getAverageYearsInPositionOfficers() {
        long sumYearsInPosition = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Officer) {
                sumYearsInPosition = sumYearsInPosition + cop.getYearsInPosition();
            }
        }
        long averageYearsInPosition = sumYearsInPosition / getNumberOfOfficers();
        return averageYearsInPosition;
    }

    public static long getAverageYearsInPositionSergants() {
        long sumYearsInPosition = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Sergeant) {
                sumYearsInPosition = sumYearsInPosition + cop.getYearsInPosition();
            }
        }
        long averageYearsInPosition = sumYearsInPosition / getNumberOfSergants();
        return averageYearsInPosition;
    }

    public static long getAverageYearsInPositionLieutenants() {
        long sumYearsInPosition = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Lieutenant) {
                sumYearsInPosition = sumYearsInPosition + cop.getYearsInPosition();
            }
        }
        long averageYearsInPosition = sumYearsInPosition / getNumberOfLieutenant();
        return averageYearsInPosition;
    }

    public static long getAverageYearsInPositionChiefOfPolice() {
        long sumYearsInPosition = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof ChiefOfPolice) {
                sumYearsInPosition = sumYearsInPosition + cop.getYearsInPosition();
            }
        }
        long averageYearsInPosition = sumYearsInPosition / getNumberOfChiefOfPolice();
        return averageYearsInPosition;
    }

    //Avg salary per rang
    public static double getAverageBaseSalaryOfficers() {
        double sumSalary = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Officer) {
                sumSalary = sumSalary + cop.getIndividualBaseSalary();
            }
        }
        double averageSalary = (int) sumSalary / getNumberOfOfficers();
        return averageSalary;
    }

    public static double getAverageBaseSalarySergants() {
        double sumSalary = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Sergeant) {
                sumSalary = sumSalary + cop.getIndividualBaseSalary();
            }
        }
        double averageSalary = (int) sumSalary / getNumberOfSergants();
        return averageSalary;
    }

    public static double getAverageBaseSalaryLieutenants() {
        double sumSalary = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Lieutenant) {
                sumSalary = sumSalary + cop.getIndividualBaseSalary();
            }
        }
        double averageSalary = (int) sumSalary / getNumberOfLieutenant();
        return averageSalary;
    }

    public static double getAverageBaseSalaryChiefOfPolice() {
        double sumSalary = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof ChiefOfPolice) {
                sumSalary = sumSalary + cop.getIndividualBaseSalary();
            }
        }
        double averageSalary = (int) sumSalary / getNumberOfChiefOfPolice();
        return averageSalary;
    }

    //Avg Bonus per rang
    public static double getAverageBonusOfficers() {
        double sumBonus = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Officer) {
                sumBonus = sumBonus + cop.getBonus();
            }
        }
        double averageBonus = (int) sumBonus / getNumberOfOfficers();
        return averageBonus;
    }

    public static double getAverageBonusSergants() {
        double sumBonus = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Sergeant) {
                sumBonus = sumBonus + cop.getBonus();
            }
        }
        double averageBonus = (int) sumBonus / getNumberOfSergants();
        return averageBonus;
    }

    public static double getAverageBonusLieutenants() {
        double sumBonus = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Lieutenant) {
                sumBonus = sumBonus + cop.getBonus();
            }
        }
        double averageBonus = (int) sumBonus / getNumberOfLieutenant();
        return averageBonus;
    }

    public static double getAverageBonusChiefOfPolice() {
        double sumBonus = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof ChiefOfPolice) {
                sumBonus = sumBonus + cop.getBonus();
            }
        }
        double averageBonus = (int) sumBonus / getNumberOfChiefOfPolice();
        return averageBonus;
    }

    //Avg Compensation per rang
    public static double getAverageCompensationOfficers() {
        double sumCompensation = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Officer) {
                sumCompensation = sumCompensation + cop.getBonus();
            }
        }
        double averageCompensation = (int) sumCompensation / getNumberOfOfficers();
        return averageCompensation;
    }

    public static double getAverageCompensationSergants() {
        double sumCompensation = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Sergeant) {
                sumCompensation = sumCompensation + cop.getBonus();
            }
        }
        double averageCompensation = (int) sumCompensation / getNumberOfSergants();
        return averageCompensation;
    }

    public static double getAverageCompensationLieutenants() {
        double sumCompensation = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof Lieutenant) {
                sumCompensation = sumCompensation + cop.getBonus();
            }
        }
        double averageCompensation = (int) sumCompensation / getNumberOfLieutenant();
        return averageCompensation;
    }

    public static double getAverageCompensationChiefOfPolice() {
        double sumCompensation = 0;
        for (Cop cop : CopManager.cops) {
            if (cop instanceof ChiefOfPolice) {
                sumCompensation = sumCompensation + cop.getBonus();
            }
        }
        double averageCompensation = (int) sumCompensation / getNumberOfChiefOfPolice();
        return averageCompensation;
    }

    public static void printStatsPerDepartment() {
        int range = 33;
        int range2 = 2;
        UI.menuHeaderTop();
        boolean menuLoop = true;
        while (menuLoop) {
            UI.printFinish();
            System.out.println(UI.fixLength("TOTAL HIRED COPS:", range) + Cop.getNumberOfCops());
            UI.uiLine();
            System.out.println(UI.fixLength("Chief of Police:", range) + getNumberOfChiefOfPolice() + UI.fixLength(" (", range2) + getPercentFromInt(getNumberOfChiefOfPolice(), Cop.getNumberOfCops()) + "% )");
            System.out.println(UI.fixLength("Lieutenants:", range) + getNumberOfLieutenant() + UI.fixLength(" (", range2) + getPercentFromInt(getNumberOfLieutenant(), Cop.getNumberOfCops()) + "% )");
            System.out.println(UI.fixLength("Sergants:", range) + getNumberOfSergants() + UI.fixLength(" (", range2) + getPercentFromInt(getNumberOfSergants(), Cop.getNumberOfCops()) + "% )");
            System.out.println(UI.fixLength("Officers:", range) + getNumberOfOfficers() + UI.fixLength(" (", range2) + getPercentFromInt(getNumberOfOfficers(), Cop.getNumberOfCops()) + "% )");
            UI.uiLine();
            System.out.println("\n" + UI.fixLength("Females:", range) + getFemalesForDepartment() + UI.fixLength(" (", range2) + getPercentFromInt(getFemalesForDepartment(), Cop.getNumberOfCops()) + "% )");
            System.out.println(UI.fixLength("Males:", range) + getMalesForDepartment() + UI.fixLength(" (", range2) + getPercentFromInt(getMalesForDepartment(), Cop.getNumberOfCops()) + "% )");
            UI.uiLine();
            System.out.println("\n" + UI.fixLength("Average age:", range) + getAverageAge() + " years");
            System.out.println(UI.fixLength("Average years in duty:", range) + getAverageEmploymentYears() + " years");
            System.out.println(UI.fixLength("Average years in current Rang:", range) + getAverageYearsInPosition() + " years");
            UI.uiLine();
            System.out.println("\n" + UI.fixLength("TOTAL number of arrests:", range) + getDepartmentArrests());
            UI.printFinish();
            UI.uiLine();
            System.out.print("[0] Back");
            int choice = CopManager.intInput();
            if (choice == 0) {
                menuLoop = false;
            }

        }
    }

    public static void printStatsPerRang() {
        int range = 28;
        int rangeSmallNumbers = 3;
        int rangeSmall = 2;
        int rangeBig = 32;
        String miscFirst = "(";
        String miscSecond = ") %";

        boolean menuLoop = true;
        while (menuLoop) {
            UI.printFinish();
            System.out.println("Statistics per Rang");
            UI.uiLine();
            System.out.println("Rang: OFFICER");
            System.out.println(UI.fixLength("Number of Officers:", range) + UI.fixLength(getNumberOfOfficers(), rangeSmallNumbers));
            System.out.println(UI.fixLength("Females:", range) + UI.fixLength(getFemalesForOfficer(), rangeSmallNumbers) + UI.fixLength(miscFirst, rangeSmall) + getPercentFromInt(getFemalesForOfficer(), getNumberOfOfficers()) + miscSecond);
            System.out.println(UI.fixLength("Males:", range) + UI.fixLength(getMalesForOfficer(), rangeSmallNumbers) + UI.fixLength(miscFirst, rangeSmall) + getPercentFromInt(getMalesForOfficer(), getNumberOfOfficers()) + miscSecond);
            System.out.println("\n" + UI.fixLength("Average age:", rangeBig) + UI.fixLength(getAverageAgeOfficers(), rangeSmallNumbers) + UI.fixLength("years", 6));
            System.out.println(UI.fixLength("Average years in duty:", rangeBig) + UI.fixLength(getAverageEmploymentYearsOfficers(), rangeSmallNumbers) + UI.fixLength("years", 6));
            System.out.println(UI.fixLength("Average years in current Rang:", rangeBig) + UI.fixLength(getAverageYearsInPositionOfficers(), rangeSmallNumbers) + UI.fixLength("years", 6));
            UI.uiLine();

            System.out.println("\nRang: SERGANT");
            System.out.println(UI.fixLength("Number of Sergants:", range) + UI.fixLength(getNumberOfSergants(), rangeSmallNumbers));
            System.out.println(UI.fixLength("Females:", range) + UI.fixLength(getFemalesForSergant(), rangeSmallNumbers) + UI.fixLength(miscFirst, rangeSmall) + getPercentFromInt(getFemalesForSergant(), getNumberOfSergants()) + miscSecond);
            System.out.println(UI.fixLength("Males:", range) + UI.fixLength(getMalesForSergant(), rangeSmallNumbers) + UI.fixLength(miscFirst, rangeSmall) + getPercentFromInt(getMalesForSergant(), getNumberOfSergants()) + miscSecond);
            System.out.println("\n" + UI.fixLength("Average age:", rangeBig) + UI.fixLength(getAverageAgeSergants(), rangeSmallNumbers) + UI.fixLength("years", 6));
            System.out.println(UI.fixLength("Average years in duty:", rangeBig) + UI.fixLength(getAverageEmploymentYearsSergants(), rangeSmallNumbers) + UI.fixLength("years", 6));
            System.out.println(UI.fixLength("Average years in current Rang:", rangeBig) + UI.fixLength(getAverageYearsInPositionSergants(), rangeSmallNumbers) + UI.fixLength("years", 6));
            UI.uiLine();

            System.out.println("\nRang: LIEUTENANT");
            System.out.println(UI.fixLength("Number of Lieutenants:", range) + UI.fixLength(getNumberOfLieutenant(), rangeSmallNumbers));
            System.out.println(UI.fixLength("Females:", range) + UI.fixLength(getFemalesForLieutenant(), rangeSmallNumbers) + UI.fixLength(miscFirst, rangeSmall) + getPercentFromInt(getFemalesForLieutenant(), getNumberOfLieutenant()) + miscSecond);
            System.out.println(UI.fixLength("Males:", range) + UI.fixLength(getMalesForLieutenant(), rangeSmallNumbers) + UI.fixLength(miscFirst, rangeSmall) + getPercentFromInt(getMalesForLieutenant(), getNumberOfLieutenant()) + miscSecond);
            System.out.println("\n" + UI.fixLength("Average age:", rangeBig) + UI.fixLength(getAverageAgeLieutenants(), rangeSmallNumbers) + UI.fixLength("years", 6));
            System.out.println(UI.fixLength("Average years in duty:", rangeBig) + UI.fixLength(getAverageEmploymentYearsLieutenants(), rangeSmallNumbers) + UI.fixLength("years", 6));
            System.out.println(UI.fixLength("Average years in current Rang:", rangeBig) + UI.fixLength(getAverageYearsInPositionLieutenants(), rangeSmallNumbers) + UI.fixLength("years", 6));
            UI.uiLine();

            System.out.println("\nRang: CHIEF OF POLICE");
            System.out.println(UI.fixLength("Number of Chief of Police:", range) + UI.fixLength(getNumberOfChiefOfPolice(), rangeSmallNumbers));
            System.out.println(UI.fixLength("Females:", range) + UI.fixLength(getFemalesForChiefOfPolice(), rangeSmallNumbers) + UI.fixLength(miscFirst, rangeSmall) + getPercentFromInt(getFemalesForChiefOfPolice(), getNumberOfChiefOfPolice()) + miscSecond);
            System.out.println(UI.fixLength("Males:", range) + UI.fixLength(getMalesForChiefOfPolice(), rangeSmallNumbers) + UI.fixLength(miscFirst, rangeSmall) + getPercentFromInt(getMalesForChiefOfPolice(), getNumberOfChiefOfPolice()) + miscSecond);
            System.out.println("\n" + UI.fixLength("Average age:", rangeBig) + UI.fixLength(getAverageAgeChiefOfPolice(), rangeSmallNumbers) + UI.fixLength("years", 6));
            System.out.println(UI.fixLength("Average years in duty:", rangeBig) + UI.fixLength(getAverageEmploymentYearsChiefOfPolice(), rangeSmallNumbers) + UI.fixLength("years", 6));
            System.out.println(UI.fixLength("Average years in current Rang:", rangeBig) + UI.fixLength(getAverageYearsInPositionChiefOfPolice(), rangeSmallNumbers) + UI.fixLength("years", 6));
            UI.printFinish();
            int choice = CopManager.intInput();
            if (choice == 0) {
                menuLoop = false;
            }

        }
    }

    public static void printPayCheckStatistics() {
        int range = 27;
        boolean menuLoop = true;
        while (menuLoop) {
            UI.printFinish();
            System.out.println("Pay-check statistics");
            System.out.println("\nMonthly average for: DEPARTMENT");
            System.out.println(UI.fixLength("Base salary:", range) + getAverageBaseSalary());
            System.out.println(UI.fixLength("Bonus:", range) + getAverageBonus());
            System.out.println(UI.fixLength("Total compensation:", range) + getAverageBonus());
            UI.uiLine();
            System.out.println("\nMonthly average for: OFFICER");
            System.out.println(UI.fixLength("Base salary:", range) + getAverageBaseSalaryOfficers());
            System.out.println(UI.fixLength("Bonus:", range) + getAverageBonusOfficers());
            System.out.println(UI.fixLength("Total compensation:", range) + getAverageCompensationOfficers());
            UI.uiLine();
            System.out.println("\nMonthly average for: SERGANT");
            System.out.println(UI.fixLength("Base salary:", range) + getAverageBaseSalarySergants());
            System.out.println(UI.fixLength("Bonus:", range) + getAverageBonusSergants());
            System.out.println(UI.fixLength("Total compensation:", range) + getAverageCompensationSergants());
            UI.uiLine();
            System.out.println("\nMonthly average for: LIEUTENANT");
            System.out.println(UI.fixLength("Base salary:", range) + getAverageBaseSalaryLieutenants());
            System.out.println(UI.fixLength("Bonus:", range) + getAverageBonusLieutenants());
            System.out.println(UI.fixLength("Total compensation:", range) + getAverageCompensationLieutenants());
            UI.uiLine();
            System.out.println("\nMonthly average for: CHIEF OF POLICE");
            System.out.println(UI.fixLength("Base salary:", range) + getAverageBaseSalaryChiefOfPolice());
            System.out.println(UI.fixLength("Bonus:", range) + getAverageBonusChiefOfPolice());
            System.out.println(UI.fixLength("Total compensation:", range) + getAverageCompensationChiefOfPolice());
            System.out.println("Pay-check statistics");
            UI.printFinish();
            int choice = CopManager.intInput();
            if (choice == 0) {
                menuLoop = false;
            }

        }
    }

}
