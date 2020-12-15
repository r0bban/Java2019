package Models;

import Utilities.GenderType;
import Statistisc.Statistics;
import UI.UI;
import java.time.LocalDate;

public class ChiefOfPolice extends Cop {

    private String duties;
    private int handledCrisis;

    // ADDS A NEW FRESH CHIEF OF POLICE
    public ChiefOfPolice(String name, GenderType gender, LocalDate birthday, String adress) {
        super(name, gender, birthday, adress);
        this.duties = "Plan Budgets, Hold Meetings & Press Conferences, Analyze Crime Data & Plan Department work, Stay Current on Relevant Laws, Lead Investigations";
    }

    // PROMOTED CHIEF OF POLICE, FIX LOCALDATE
    public ChiefOfPolice(String name, GenderType gender, LocalDate birthday, String adress, LocalDate dateHired, LocalDate startDatePosition, int handledCrisis) {
        super(name, gender, birthday, adress, dateHired, startDatePosition);
        this.duties = "Plan Budgets, Hold Meetings & Press Conferences, Analyze Crime Data & Plan Department work, Stay Current on Relevant Laws, Lead Investigations";
        this.handledCrisis = handledCrisis;
    }

    @Override
    public String toString() {
        return UI.fixLength(getTitle(), 11) + "|" + super.toString() + " " + getIndividualBaseSalary();
    }

    public String displayCheifName() {
        return UI.fixLength(getTitle(), 11) + "|" + super.toString() + " " + getIndividualBaseSalary();
    }

    @Override
    public double getBonus() {
        double bonus = ((getEmplymentYears() * 0.005) * baseSalary) + ((getYearsInPosition() * 0.01) * baseSalary) + ((Statistics.getDepartmentArrests() * 0.005) * baseSalary) + ((handledCrisis * 0.05) * baseSalary);
        return bonus;
    }

    @Override
    public String getDuties() {
        return duties;
    }

    @Override
    public double getIndividualBaseSalary() {
        return getBaseSalary() + 25000;
    }

    public int getHandledCrisis() {
        return handledCrisis;
    }

    public void setHandledCrisis(int handledCrisis) {
        this.handledCrisis = handledCrisis;
    }

    private String getTitle() {
        return "Chief";
    }
}
