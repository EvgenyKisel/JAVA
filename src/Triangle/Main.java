package Triangle;

public class Main {

    public static void main(String[] args)  {
        try {
            Initiation inputSide = new Initiation();
            double sideA = inputSide.correctInput();
            double sideB = inputSide.correctInput();
            double sideC = inputSide.correctInput();
            Triangle triangle = new Triangle(sideA, sideB, sideC);
            triangle.determineTypeOfTriangle();
            System.out.println(triangle.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
