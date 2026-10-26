public class newCircle extends circle{
    private float perimeter;
    newCircle(){
        super();
    }
    newCircle(float radius){
        super(radius);
    }
    void display(){
        super.display();
        System.out.println("Perimeter="+perimeter);
    }
    void calc_Perimeter(){
        perimeter=2*super.pi*super.radius;
    }
}
