package com.francis;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
public class OptionMenu extends Account{
    public OptionMenu(int login) {
        super(login);
    }
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat();
    HashMap <Integer,Integer> data = new HashMap<>();
    public int getLogin() {
        int x = 1;
        do {
           try{
               data.put(12345,5555);
               data.put(23456,6666);
               System.out.println("Welcome to First Bank!");
               System.out.println("Enter your Customer Number:");
               setCustomerNumber(menuInput.nextInt());

               System.out.println("Enter your Pin Number:");
               setPinNNumber(menuInput.nextInt());
           } catch (Exception e) {
               System.out.println("\n" + "Invalid Number" + "\n");
           }
           int cN = getCustomerNumber();
           int pN = getPinNumber();
           if (data.containsKey(cN) && data.get(cN) == pN) {
               getAccountType();
           }else
               System.out.println("\n"+ "Wrong Customer Number or Pin Number" + "\n");
       }while (x == 1);
        return x;
    }
    private void setPinNNumber(int i) {
    }
    public String getAccountType(){
        System.out.println("Select the Type of Account");
        System.out.println("Type 1 - Current Account");
        System.out.println("Type 2 - Savings Account");
        System.out.println("Type 3 - Exit");

        int selection = menuInput.nextInt();
        switch (selection){
            case 1 :
                getCurrentAccount();
                break;
            case 2 :
                getSavingsAccount();
                break;
            case 3 :
                System.out.println("Thank you for choosing First bank" + "\n");
            default :
                System.out.println("\n"+ "Invalid option" + "\n");
        }
        return accountType;
    }
    @Override
    public void getCurrentAccount() {
        super.getCurrentAccount();
        System.out.println("Current Account: ");
        System.out.println("Type 1 - Account Balance");
        System.out.println("Type 2 - Deposit");
        System.out.println("Type 3 - Withdraw");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1 :
                System.out.println("Current Account Balance " +
                        moneyFormat.format(getCurrentAccountBalance()));
                getAccountType();
                break;
            case 2 :
                getCurrentWithdrawalInput();
                getAccountType();
                break;
            case 3 :
                getCurrentDepositInput();
                getAccountType();
                break;
            case 4 :
                System.out.println("Thank You For Choosing First Bank " +"\n");
            default:
                System.out.println("\n" + "Invalid selection "+ "\n");
                getCurrentAccount();
        }
    }
    public void getSavingsAccount (){
        System.out.println("Savings Account: ");
        System.out.println("Type 1 - Account Balance");
        System.out.println("Type 2 - Deposit");
        System.out.println("Type 3 - Withdraw");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();
        switch (selection){
            case 1 :
                System.out.println("Savings Account Balance " +
                        moneyFormat.format(getSavingsAccountBalance()));
                getAccountType();
                break;
            case 2 :
                getSavingsAccountWithdrawalInput();
                getAccountType();
                break;
            case 3 :
                getSavingsAccountDepositInput();
                getAccountType();
                break;
            case 4 :
                System.out.println("Thank You For Choosing First Bank " +"\n");
            default:
                System.out.println("\n" + "Invalid selection "+ "\n");
                getSavingsAccount();

        }
    }
}

