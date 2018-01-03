package P22IntersectionOfCircles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle firstCircle = new Circle(new Point(scanner.nextDouble(),scanner.nextDouble()),scanner.nextDouble());
        Circle secondCircle = new Circle(new Point(scanner.nextDouble(),scanner.nextDouble()),scanner.nextDouble());

        System.out.println(firstCircle.Intersect(secondCircle) ? "Yes" : "No");
    }
}