package com.example.task8;
import com.example.task8.shapes.abstr.Shape;
import com.example.task8.realization.ShapePrinter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Task8Application {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ShapePrinter printer = new ShapePrinter();
            Shape shape = printer.getShapeFromInput(scanner);
            printer.printShapeName(shape);
        }
    }
}
