public class circle {
    protected float radius;
    private float area;
    final float pi=3.14f;
    circle(){
        radius=0.0f;
    }
    circle(float radius){
        this.radius=radius;
    }
    circle(circle c){
        radius=c.radius;
    }
    void display(){
        System.out.println("radius="+radius);
        System.out.println("Area="+area);
    }
    void calc_Area(){
        area=pi*radius*radius;
    }
}
