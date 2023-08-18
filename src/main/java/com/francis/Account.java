package com.francis;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int login;
    private int customerNumber;
    private int pinNumber;
    private double currentAccountBalance = 0;
    private double savingsAccountBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat();


    String accountType;

    public Account(int login, int customerNumber, int pinNumber, String accountType) {
        this.login = login;
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
        this.accountType = accountType;
    }

    public Account(int login) {
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public void getCurrentAccount(){

    }
    public void getSavingsAccount(){

    }

    public double getSavingsAccountBalance() {
        return savingsAccountBalance;
    }

    public double getCurrentAccountBalance() {
        return currentAccountBalance;
    }
    public double calcCurrentWithdrawal (double amount){
        currentAccountBalance  = (currentAccountBalance - amount);
        return currentAccountBalance;
    }
    public double calcSavingsWithdrawal (double amount){
        savingsAccountBalance = (savingsAccountBalance-amount);
        return savingsAccountBalance;
    }public double calcCurrentDeposit (double amount){
        currentAccountBalance  = (currentAccountBalance + amount);
        return currentAccountBalance;
    }
    public double calcSavingsDeposit (double amount){
        savingsAccountBalance = (savingsAccountBalance + amount);
        return savingsAccountBalance;
    }
    public void getCurrentWithdrawalInput(){
        System.out.println("Current Account Balance "+ moneyFormat.format(currentAccountBalance));
        System.out.println("Amount You want to Withdraw from Current Account: ");
        double amount = input.nextDouble();

        if ((currentAccountBalance - amount) >= 0) {
            calcCurrentWithdrawal(amount);
            System.out.println("New Current Account Balance: "+
                    moneyFormat.format(currentAccountBalance));
        }else {
            System.out.println("Balance Cant be Negative " + "\n");
        }
    }
    public void getSavingsAccountWithdrawalInput() {
        System.out.println("Savings Account Balance "+
                moneyFormat.format(savingsAccountBalance));
        System.out.println("Amount You want to Withdraw from Savings Account: ");
        double amount = input.nextDouble();

        if ((savingsAccountBalance - amount) >= 0 ){
            calcSavingsWithdrawal(amount);
            System.out.println("New Savings Account Balance: "+
                    moneyFormat.format(savingsAccountBalance));
        }else {
            System.out.println("Balance cant be Negative "+ "\n");
        }
    }public void getCurrentDepositInput(){
        System.out.println("Current Account Balance "+ moneyFormat.format(currentAccountBalance));
        System.out.println("Amount You want to Deposit from Current Account: ");
        double amount = input.nextDouble();

        if ((currentAccountBalance + amount) >= 0) {
            calcCurrentWithdrawal(amount);
            System.out.println("New Current Account Balance: "+
                    moneyFormat.format(currentAccountBalance));
        }else {
            System.out.println("Balance Cant be Negative " + "\n");
        }

    }
    public void getSavingsAccountDepositInput() {
        System.out.println("Savings Account Balance "+
                moneyFormat.format(savingsAccountBalance));
        System.out.println("Amount You want to Deposit from Savings Account: ");
        double amount = input.nextDouble();

        if ((savingsAccountBalance + amount) >= 0 ){
            calcSavingsWithdrawal(amount);
            System.out.println("New Savings Account Balance: "+
                    moneyFormat.format(savingsAccountBalance));
        }else {
            System.out.println("Balance cant be Negative "+ "\n");
        }
    }
}
