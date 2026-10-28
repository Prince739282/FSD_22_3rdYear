class Bank{
    float balance;
    void withdraw(float amount){
        if(balance>amount){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
class MyThread implements Runnable{
    Bank b;
    float amount;
    MyThread(Bank b,float amount){
        this.b=b;
        this.amount=amount;
    }
    public void run(){
        b.withdraw(amount);
    }
}


public class bankThreadEx {
    public static void main(String[] args) {


    }
}
