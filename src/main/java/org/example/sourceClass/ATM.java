package org.example.sourceClass;

public class ATM {
    private String bankName;

    public Money giveOutMoney(int summ, String owner) {
        return  callMoneyFromBank(summ, owner);
    }

    public Money callPassword(int summ, String owner) {
        double password = Math.random()*9999;
        return giveOutMoney(summ, owner);
    }
    public Money callMoneyFromBank(int summ, String owner){
            return new Bank().giveMoneyToATM(summ, owner);
    }
}
