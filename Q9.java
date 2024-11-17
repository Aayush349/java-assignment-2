import java.util.Scanner;

abstract class ThreeDObject {
    public abstract double wholeSurfaceArea();
    public abstract double volume();
}

class Box extends ThreeDObject {
    double l, w, h;

    
    Box(double length, double width, double height) {
        this.l = length;
        this.w = width;
        this.h = height;
    }
    @Override
    public double wholeSurfaceArea() {
        return 2 * (l * w + w * h + h * l);
    }
    @Override
    public double volume() {
        return l * w * h;
    }
}


class Cube extends Box {

    Cube(double side) {
        super(side, side, side);
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * l * l;  
    }

    @Override
    public double volume() {
        return l * l * l;  
    }
}

class Cylinder extends ThreeDObject {
    double r, h;
    
    Cylinder(double radius, double height) {
        this.r = radius;
        this.h = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * 3.14 * r * (r + h);
    }

    @Override
    public double volume() {
        return 3.14 * r * r * h;
    }
}

class Cone extends ThreeDObject {
    double r, h;

    Cone(double radius, double height) {
        this.r = radius;
        this.h = height;
    }
    @Override
    public double wholeSurfaceArea() {
        double L = Math.sqrt(r * r + h * h);
        return 3.14 * r * (r + L);
    }

    @Override
    public double volume() {
        return (1 / 3) * 3.14 * r * r * h;
    }
}


public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Box
        System.out.println("Enter length, width, and height for Box:");
        double boxLength = sc.nextDouble();
        double boxWidth = sc.nextDouble();
        double boxHeight = sc.nextDouble();
        ThreeDObject box = new Box(boxLength, boxWidth, boxHeight);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Cube
        System.out.println("Enter side length for Cube:");
        double cubeSide = sc.nextDouble();
        ThreeDObject cube = new Cube(cubeSide);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Cylinder
        System.out.println("Enter radius and height for Cylinder:");
        double cylinderRadius = sc.nextDouble();
        double cylinderHeight = sc.nextDouble();
        ThreeDObject cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Cone
        System.out.println("Enter radius and height for Cone:");
        double coneRadius = sc.nextDouble();
        double coneHeight = sc.nextDouble();
        ThreeDObject cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume()); 
    }
}


