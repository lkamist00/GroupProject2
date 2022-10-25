package project2;

public class ShapeTester {

    public static void main(String[] args) {

        Shape[] shape = {new Circle(), new Square()};
        for (Shape task : shape) {
            task.calculateArea();
            task.calcuclatePerimeter();
        }

    }
}