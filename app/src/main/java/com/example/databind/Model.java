package com.example.databind;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Model extends BaseObservable {
    String firstNumber, secondNumber, result;



    public Model(String firstNumber, String secondNumber, String result) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.result = result;
    }

    public Model() {

    }

    @Bindable
    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
        notifyPropertyChanged(BR.firstNumber);

    }

    @Bindable
    public String getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber = secondNumber;
        notifyPropertyChanged(BR.secondNumber);
    }

    @Bindable
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }

    public void onSubtractClick() {
        try {
            double num1 = Double.parseDouble(firstNumber);
            double num2 =  Double.parseDouble(secondNumber);
            double difference = num1 - num2;
            setResult("Result: " + difference);
        } catch (NumberFormatException e) {
            setResult("Invalid input");
        }

    }

    public void onCalculateClick() {
        try {
            double num1 =  Double.parseDouble(firstNumber);
            double num2 =  Double.parseDouble(secondNumber);
            double difference = num1 + num2;
            setResult("Result: " + difference);
        } catch (NumberFormatException e) {
            setResult("Invalid input");
        }

    }
    public void onMutliClick() {
        try {
            double num1 =  Double.parseDouble(firstNumber);
            double num2 =  Double.parseDouble(secondNumber);
            double difference = num1 * num2;
            setResult("Result: " + difference);
        } catch (NumberFormatException e) {
            setResult("Invalid input");
        }

    }
    public void ondivisonClick() {
        try {
            double num1 =  Double.parseDouble(firstNumber);
            double num2 =  Double.parseDouble(secondNumber);
            double difference = num1 / num2;
            setResult("Result: " + difference);
        } catch (NumberFormatException e) {
            setResult("Invalid input");
        }

    }
}

