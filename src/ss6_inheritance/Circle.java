package ss6_inheritance;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }
    // 2 constructor cùng tên là Circle : overloading
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
    //phần override là ghi đè. Ghi đè phương thức thể hiện trong các class có mối quan hệ kế thừa
    @Override
    public String toString() {
        return "CirCle with radius ="
                + this.radius
                + " And color is " + this.color;
    }
}
