package org.example.sourceClass;

public class Bank {
    private String bank_name;
    public Money giveMoneyToATM(int summ, String owner){
        return new Money(summ,owner);
    }

}
