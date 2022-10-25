package project2;

public interface Shape {

        /*
    1. Create an Interface 'Shape' with undefined
methods as calculateArea and calculatePerimiter.
Create 2 classes Circle & Square that implements functionality defined in
the Shape Interface. Test your code.
     */
    void calculateArea();
    void calcuclatePerimeter();

}

class Circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("Circle area formula is radius*radius*PI");
    }

    @Override
    public void calcuclatePerimeter() {
        System.out.println("Perimeter of circle formula is 2*PI*radius ");
    }
}

class Square implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("Square area formula is length*length");
    }

    @Override
    public void calcuclatePerimeter() {
        System.out.println("Perimeter of square formula is 4*length");
    }
}



