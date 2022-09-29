package edu.vit.corejava.inheritance;
abstract class Transaction1
{
    private Integer accountNumber;
    private Double balance;
    public Transaction1(){}
    public Transaction1(Integer accountNumber,Double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public Integer getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    @Override
    public String toString()
    {
        return String.format("account number: %d  Balance: %f",this.accountNumber,this.balance );
    }
    // all of the above methods are regular can be and cannot be implemented in the coming sub-class
    // these below methods are abstract methods and should be implemented in the sub-class
    abstract public Boolean deposit(Double amount);
    abstract public Boolean transfer(SavingsAccount1 sb,Double amount);
}
class SavingsAccount1 extends Transaction1
{
    public SavingsAccount1(Integer accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public Boolean deposit(Double amount)
    {
        super.setBalance(super.getBalance()+amount);// all these methods are declared in the above class so we use super
        return true;
    }
    @Override
    public Boolean transfer(SavingsAccount1 sb,Double amount)
    {
        if(super.getBalance()>amount)
        {
            sb.setBalance(sb.getBalance()+amount);
            super.setBalance(super.getBalance()-amount);
            return  true;
        }
        else
            return false;
    }
}
public class InterfaceToAbstract {
    public static void main(String[] args)
    {
        SavingsAccount1 kumar =  new SavingsAccount1(875385, 1000.0);
        SavingsAccount1 raja =  new SavingsAccount1(875390, 3000.0);
        kumar.deposit(3500.0);
        System.out.println(kumar.toString());
        System.out.println(raja.toString());
        System.out.println("*************************");
        boolean flag = kumar.transfer(raja, 500.0);
        if(flag){
            System.out.println("Transaction Success!");
            System.out.println(kumar.toString());
            System.out.println(raja.toString());
        }else{
            System.out.println("Insufficient Balance!");
        }
    }
}
