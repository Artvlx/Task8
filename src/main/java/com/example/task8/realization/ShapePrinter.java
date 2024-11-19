package com.example.task8.realization;
import com.example.task8.shapes.abstr.Shape;
import com.example.task8.shapes.*;

import java.util.Scanner;

public class ShapePrinter {
    public Shape getShapeFromInput(Scanner scanner) {
        System.out.println("Enter the shape name: ");
        String input = scanner.nextLine().trim().toLowerCase();

        return switch (input) {
            case "circle" -> new Circle();
            case "quad" -> new Quad();
            case "triangle" -> new Triangle();
            case "rectangle" -> new Rectangle();
            case "trapezoid" -> new Trapezoid();
            default -> {
                System.out.println("Invalid shape name. Please try again.");
                yield getShapeFromInput(scanner);
            }
        };
    }
    public void printShapeName(Shape shape) {
        System.out.println("The shape is: " + shape.getName());
    }
}