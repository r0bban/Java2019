package Models;

import Models.Cop;
import UI.UI;
import Utilities.GenderType;
import java.time.LocalDate;

public class Officer extends Cop {

    private String duties;

    // ADDS A NEW FRESH OFFICER
    public Officer(String name, GenderType gender, LocalDate birthday, String adress) {
        super(name, gender, birthday, adress);
        this.duties = "Patrol, Make Arrests & Court testimony, Emergency calls";
    }

    // ADD A EXISTING OFFICER?, FIX LOCALDATE
    public Officer(String name, GenderType gender, LocalDate birthday, String adress, LocalDate dateHired, LocalDate startDatePosition) {
        super(name, gender, birthday, adress, dateHired, startDatePosition);
        this.duties = "Patrol, Make Arrests & Court testimony, Emergency calls";
    }

   
    @Override
    public String toString() {
        return UI.fixLength(getTitle(),11)+"|" + super.toString() + " " + getIndividualBaseSalary();
    }

    public String dispalyOfficerName() {
        return UI.fixLength(getTitle(),11)+"|" + super.toString() + " " + getIndividualBaseSalary();
    }


    // PROBLEM!
    @Override
    public double getBonus() {
        return ((int) ((getYearsInPosition() * 0.05 + getEmplymentYears() * 0.005 + getIndividualArrests() * 0.005) * getIndividualBaseSalary()));
    }

    @Override
    public String getDuties() {
        return duties;
    }

    @Override
    public double getIndividualBaseSalary() {
        return baseSalary;
    }

    private String getTitle() {
        return "Officer";
    }
}
