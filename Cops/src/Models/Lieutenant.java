package Models;

import Statistisc.Statistics;
import Models.Cop;
import UI.UI;
import Utilities.GenderType;
import java.time.LocalDate;

public class Lieutenant extends Cop {

    private String duties;
    private int nCrisis;

    // ADDS A NEW FRESH LIEUTENANT
    public Lieutenant(String name, GenderType gender, LocalDate birthday, String adress) {
        super(name, gender, birthday, adress);
        this.duties = "Supervise work, Evaluate work performance, Pass orders from management to officers and Sergeants, Responds to serious crimes, Administrative work";
    }

    // ADDS A EXISTING COP, PROMOTED LIEUTENANT, FIX LOCALDATE
    public Lieutenant(String name, GenderType gender, LocalDate birthday, String adress, LocalDate dateHired, LocalDate startDatePosition) {
        super(name, gender, birthday, adress, dateHired, startDatePosition);
        this.duties = "Supervise work, Evaluate work performance, Pass orders from management to officers and Sergeants, Responds to serious crimes, Administrative work";
    }

    @Override
    public String toString() {
        return UI.fixLength(getTitle(),11)+"|" + super.toString() + " " + getIndividualBaseSalary();
    }
    
    public String displayLieutenantName() {
        return UI.fixLength(getTitle(),11)+"|" + super.toString() + " " + getIndividualBaseSalary();
    }


    @Override
    public double getBonus() {
        return ((int) ((getYearsInPosition() * 0.05 + getEmplymentYears() * 0.005 + Statistics.getDepartmentArrests() * 0.05) * getIndividualBaseSalary()));
    }

    @Override
    public String getDuties() {
        return duties;
    }

    //OKLART
    @Override
    public double getIndividualBaseSalary() {
        return getBaseSalary() + 15000;
    }

    private String getTitle() {
        return "Lieutenant";
    }
}
