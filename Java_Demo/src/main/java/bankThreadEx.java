//class Bank{
//    float balance=10000.0f;
//    void withdraw(float amount){
//        if(balance>amount){
//            balance-=amount;
//            System.out.println("current Balance="+balance);
//        }
//        else{
//            System.out.println("Insufficient balance");
//        }
//    }
//}
//class MyThread implements Runnable{
//    Bank b;
//    float amount;
//    MyThread(Bank b,float amount){
//        this.b=b;
//        this.amount=amount;
//    }
//    @Override
//    public void run(){
//        b.withdraw(amount);
//    }
//}
//
//
//public class bankThreadEx {
//    public static void main(String[] args) {
//        Bank b= new Bank();
//        MyThread t1 = new MyThread(b,7000);
//        MyThread t2 = new MyThread(b,7000);
//        Thread ob =new Thread(t1);
//        Thread ob1 =new Thread(t2);
//        ob.start();
//        ob1.start();
//    }
//}
class Bank{
    float balance=10000.0f;
    synchronized void withdraw(float amount){
        System.out.println(Thread.currentThread().getName()+"money withdrwal");
        if(balance>amount){
            balance-=amount;
            System.out.println("current Balance="+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
class MyThread extends Thread{
    Bank b;
    float amount;
    MyThread(Bank b,float amount,String name){
        super(name);
        this.b=b;
        this.amount=amount;
    }
    @Override
    public void run(){
        b.withdraw(amount);
    }
}


public class bankThreadEx {
    public static void main(String[] args) {
        Bank b= new Bank();
        MyThread t1 = new MyThread(b,7000,"Thread-1");
        MyThread t2 = new MyThread(b,7000,"Thread-2");
        t1.start();
        t2.start();
    }
}
