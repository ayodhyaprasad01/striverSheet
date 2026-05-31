abstract class Shape {
    abstract void drawShape();
}

class Circle extends Shape {

    @Override
    void drawShape() {
        System.out.println("Drawing Circle");
    }
    

}

class Square extends Shape {
    @Override
    void drawShape() {
        System.out.println("Drawing Square");
    }
}

class Rectangle extends Shape {
    @Override
    void drawShape() {
        System.out.println("Drawing Rectangle");
    }
}

class Unsoported extends Shape {

    String shapeType;

    Unsoported(String shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    void drawShape() {
        System.out.println("Drawing " + shapeType + " is not supported");
    }
}

class Factory {

    static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                return new Unsoported(shapeType);
        }

    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Shape cirShape = factory.getShape("circle");
        cirShape.drawShape();
        Shape sqShape = factory.getShape("square");
        sqShape.drawShape();
        Shape rShape = factory.getShape("rectangle");
        rShape.drawShape();

        System.out.println();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter number of shapes to draw:");

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String shapeType = sc.nextLine();
            Shape shape = factory.getShape(shapeType);
            shape.drawShape();
        }

    }

}
