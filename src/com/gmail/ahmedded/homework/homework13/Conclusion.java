package com.gmail.ahmedded.homework.homework13;

public class Conclusion {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Triangle(3, 4),
                new Square(2),
                new Circle(2.5),
                new Square(4)
        };

        double totalArea = getTotalArea(shapes);
        System.out.println("Сумарна площа всіх фігур:" + totalArea);
    }

    public static double getTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }
}
