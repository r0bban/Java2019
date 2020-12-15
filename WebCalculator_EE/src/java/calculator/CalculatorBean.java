/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.text.DecimalFormat;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author rober
 */
@Named(value = "calculatorBean")
@RequestScoped
public class CalculatorBean {

    private Double parameter1;
    private Double parameter2;
    private String result;

    /**
     * Creates a new instance of StudentBean
     */
    public CalculatorBean() {
    }

    public Double getParameter1() {
        return parameter1;
    }

    public void setParameter1(Double parameter1) {
        this.parameter1 = parameter1;
    }

    public Double getParameter2() {
        return parameter2;
    }

    public void setParameter2(Double parameter2) {
        this.parameter2 = parameter2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String addParameter1ToParameter2() {
        this.result = (new DecimalFormat("##.##").format(parameter1 + parameter2));
        return "index";
    }

    public String subtractParameter2FromParameter1() {
        this.result = (new DecimalFormat("##.##").format(parameter1 - parameter2));
        return "index";

    }

    public String devideParameter1WithParameter2() {
        this.result = (new DecimalFormat("##.##").format(parameter1 / parameter2));
        return "index";
    }

    public String multiplyParameter1WithParameter2() {
        this.result = (new DecimalFormat("##.##").format(parameter1 * parameter2));
        return "index";
    }

}
