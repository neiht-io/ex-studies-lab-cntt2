package Lab4;

public class Main {
    public static void main(String[] args) {
        Cylinder C1 = new Cylinder(2.5, 2, "red");
        System.out.println("Radius = " + C1.getRadius() + 
                            " Height = " + C1.getHeight() + 
                            " Color = " + C1.getColor() + 
                            " Area = " + C1.getArea() + 
                            " Volume = " + C1.getVolume());
    }
}