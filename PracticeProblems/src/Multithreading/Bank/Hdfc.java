package Multithreading.Bank;

public class Hdfc {
    int Accountbalance;
    public Hdfc(int Accountbalance) {
        this.Accountbalance = Accountbalance;
//        System.out.println("Account balance is Baswaraj " + Accountbalance);
//        System.out.println("Account balance is shivanad " + Accountbalance);
    }
    public synchronized void withdraw(int withdrawAmount) {
        Accountbalance =Accountbalance- withdrawAmount;
        System.out.println("Baswaraj withdrawing amount: "+Accountbalance);
        System.out.println("--------------------------------------------------------");

    }
    public synchronized void deposit(int depositAmount) {
        Accountbalance =Accountbalance+ depositAmount;
        System.out.println("shivanad Deposit amount total account balance : " +Accountbalance);
        System.out.println("---------------------------------------------------");
    }
    public synchronized void balanceCheck() {
        System.out.println( "Baswaraj Account Balance : "+Accountbalance);
        System.out.println("----------------------------------------------------");
    }
    public void updateProfile(){
        System.out.println("Update Profile");
    }

}
class Phonepay extends Thread{
    Hdfc account;
    public Phonepay(Hdfc account) {
        this.account=account;
    }
    @Override
    public void run() {
        account.balanceCheck();
    }
}


class ATMThread extends Thread {
    private Hdfc account;
    public  ATMThread(Hdfc account) {
        this.account = account;
    }
     public void run() {
        account.withdraw(4000);
         System.out.println();

     }
}

class Googlepay extends Thread {
    private Hdfc account;
    public  Googlepay(Hdfc account) {
        this.account = account;
    }
    public void run() {
        account.deposit(5000);
    }
}

class Main{
    public static void main(String[] args) {
        Hdfc baswarajAccnt =new Hdfc(7000);
        System.out.println("Baswaraj Account Balance is "+baswarajAccnt.Accountbalance);

        Hdfc shivaAccnt= new Hdfc(8000);
        System.out.println("Shiva Account Balance is "+shivaAccnt.Accountbalance);
        ATMThread atmThread = new ATMThread(baswarajAccnt);
        Googlepay googlepay = new Googlepay(shivaAccnt);
        Phonepay phonepay = new Phonepay(baswarajAccnt);
        shivaAccnt.updateProfile();
        atmThread.start();
        googlepay.start();
        phonepay.start();
        System.out.println(atmThread.isAlive());
    }
}
