import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        InputSide inputSide = new InputSide();
        double firstSide = inputSide.input();
        double secondSide = inputSide.input();
        double thirdSide = inputSide.input();
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        triangle.outSides();
        triangle.nameOfTriangle();
    }

}
