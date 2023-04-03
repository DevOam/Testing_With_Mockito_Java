package com.example.testing_with_mockito;

public class CalculatorApplication {
    private CalculatorService calcService;
    public void setCalculatorService(CalculatorService calcService){
        this.calcService = calcService;
    }
    public double add(double input1, double input2){
        return calcService.add(input1, input2);
    }
    public double sous(double input1, double input2){
        return calcService.sous(input1, input2);
    }
    public double multi(double input1, double input2){
        return calcService.multi(input1, input2);
    }
    public double div(double input1, double input2){
        return calcService.div(input1, input2);
    }
}
