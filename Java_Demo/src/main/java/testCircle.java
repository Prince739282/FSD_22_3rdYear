public class testCircle {
    public static void main(String[] args) {
//        circle c1,c2,c3,c4;
//        c1= new circle(2.0f);
//        c2= new circle(3.0f);
//        c3= new circle(4.0f);
//        c4= new circle(c1);
        newCircle c1,c2,c3,c4;
        c1= new newCircle(2.0f);
        c2= new newCircle(3.0f);
        c3= new newCircle(4.0f);
        c4= new newCircle(c1);
        System.out.println("Address="+c1);
        c1.calc_Area();
        c1.display();
        c2.calc_Area();
        c2.display();
        c3.calc_Area();
        c3.display();
    }
}
