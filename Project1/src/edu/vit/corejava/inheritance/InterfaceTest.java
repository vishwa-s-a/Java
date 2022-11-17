package edu.vit.corejava.inheritance;

/**
 * types of interface:
 *   1.Normal interface
 *   2.Sealed interface
 *   3.functional interface
 */
// here we have to give the name as interface Transaction without using class;
// and we can only use some keywords such as: public, static, final while declaring properties of the interface
interface Transaction
{
    /*
     * various methods of declaring properties in interface only is
     * public static int count=12;
     * publlic final int name=13;
     * // if we dont initialise these variables then we get error
     * // example public static int count;//this would throw error and ask you to initialize its value
     * while accessing count we cannot use this.count instead only use count or Class_name.count
     */
    public final Integer minCredit=16;
    public Boolean deposit(Double amount);
    public Boolean transfer(SavingsAccount toAccount,Double amount);
    // the following is a default line, now its a regular method and no compulsion to use it in children class
    public default String display()
    {
        return "Balance is>>>>....";
    }
}
// for interface we should use the key word implements instead of extends
class SavingsAccount implements Transaction
{
    private Integer accountNumber;
    private Double balance;
    public SavingsAccount(){}
    public SavingsAccount(Integer accountNumber,Double balance)
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
        return String.format("Account_Number: %d   Balance=%f",this.accountNumber,this.balance);
    }
    @Override
    public Boolean deposit(Double amount)
    {
        this.balance+=amount;
        return true;
    }
    @Override
    public Boolean transfer(SavingsAccount sb,Double amount)
    {
        if(this.balance>amount)
        {
            sb.balance+=amount;
            this.balance-=amount;
            return true;
        }
        else
            return false;
    }
}
// even though we have not used display in this class implemented using Transaction, we dont get any error as it is
// a default method
public class InterfaceTest {
    public static void main(String[] args)
    {
        Boolean temp;
        SavingsAccount ravi=new SavingsAccount(12345,12344.05);
        SavingsAccount kumar=new SavingsAccount(12346,1000.0);
        temp=ravi.deposit(1000.0);
        temp=ravi.transfer(kumar,1344.0);
        System.out.println(ravi.toString());
        System.out.println(kumar.toString());

    }
}
