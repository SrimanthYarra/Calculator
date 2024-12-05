package org.example.calculator.ModelDtos;

public class CalculationAttributes {

    private String emailId;
    private float firstParameter;
    private String operation;
    private float secondParameter;


    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public float getFirstParameter() {
        return firstParameter;
    }

    public void setFirstParameter(float firstParameter) {
        this.firstParameter = firstParameter;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public float getSecondParameter() {
        return secondParameter;
    }

    public void setSecondParameter(float secondParameter) {
        this.secondParameter = secondParameter;
    }



}
