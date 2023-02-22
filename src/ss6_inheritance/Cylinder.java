package ss6_inheritance;

public class Cylinder extends Circle {
    //Cylinder kế thừa Circlce
    private double height;

    public Cylinder() {
    }
// 2 constructor cùng tên là Cylinder : overloading
    public Cylinder(double radius, String color, double height) {
        //radius và color được kế thừa
        super(radius, color);
        //height không được kế thừa
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
//phần override là ghi đè.
    @Override
    public String toString() {
        return "A Cylinder with height is "
                + this.height
                + ", which is a subclass of "
                + super.toString();
    }
}
