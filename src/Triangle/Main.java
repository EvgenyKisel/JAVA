package Triangle;

public class Main {

    public static void main(String[] args) {
        try {
            Initiation inputSide = new Initiation();
            double sideA = inputSide.getTheSideOfTriangle();
            double sideB = inputSide.getTheSideOfTriangle();
            double sideC = inputSide.getTheSideOfTriangle();
            Triangle triangle = new Triangle(sideA, sideB, sideC);
           // triangle.determineAndPrintTypeOfTriangle();
            while (triangle.isCheck() == true) {
                triangle.typeOfTriangleNotExist();
                if (triangle.isCheck() == false) {
                    System.out.println(triangle.getType());
                    break;
                }
                triangle.typeOfTriangleEquilateral();
                if (triangle.isCheck() == false) {
                    System.out.println(triangle.getType());
                }
                triangle.typeOfTriangleIsosceles();
                if (triangle.isCheck() == false) {
                    System.out.println(triangle.getType());
                }
                if (triangle.isCheck() == true) {
                    triangle.typeOfTriangleRectangular();
                    triangle.typeOfTriangleObtuseAngled();
                    triangle.typeOfTriangleAcuteAngled();
                    System.out.println(triangle.getType());
                }
                break;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
