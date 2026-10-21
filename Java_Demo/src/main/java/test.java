import java.util.Scanner;

class Math{
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a,int b){
        return a*b;
    }
}

public class test {
    public static void main(String arg[]){
        int a,b,c;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the first no:");
        a=scan.nextInt();

        System.out.print("Enter the second no:");
        b=scan.nextInt();

        Math ob = new Math();

        System.out.println("Sum:"+ob.add(a,b));
    }

}
