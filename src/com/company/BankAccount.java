package com.company;

public class BankAccount {
    private double amout;

    public double getAmout() {
        return amout;
    }

    public void setAmout(double amout) {
        this.amout = amout;
    }
    public void deposit(int som){
        amout += som;
        System.out.println("Вы пополнили счет " + (int) getAmout() + " som");
    }
    public void withDraw(int som) throws LimitException{
        if (som > amout){
            throw new LimitException("Не хватает денег ", amout);
        }
        else {
            amout -= som;
            System.out.println("Вы сняли " + som + " Остаток суммы " + amout);
        }
    }

}
