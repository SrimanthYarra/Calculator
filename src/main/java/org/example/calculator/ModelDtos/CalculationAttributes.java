package org.example.calculator.ModelDtos;

public class CalculationAttributes {

    private float firstParameter;
    private char operation;
    private float secondParameter;
    private float result;

    public float getFirstParameter() {
        return firstParameter;
    }

    public void setFirstParameter(float firstParameter) {
        this.firstParameter = firstParameter;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public float getSecondParameter() {
        return secondParameter;
    }

    public void setSecondParameter(float secondParameter) {
        this.secondParameter = secondParameter;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

}
