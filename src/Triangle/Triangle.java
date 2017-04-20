package Triangle;


public class Triangle {

    private static final double EPSILON = Double.MIN_VALUE;

    public static final String CONST_NOT_EXIST = "Triangle doesn't exist.";
    public static final String CONST_EQUILATERAL = "Triangle is equilateral.";
    public static final String CONST_ISOSCELES = "Triangle is isosceles.";
    public static final String CONST_RECTANGULAR = "Triangle is rectangular.";
    public static final String CONST_ACUTE_ANGLED = "Triangle is acute-angled.";
    public static final String CONST_OBTUSE_ANGLED = "Triangle is obtuse-angled.";

    private double sideA;
    private double sideB;
    private double sideC;
    private TriangleType triangleType;

    enum TriangleType {
        NOT_EXIST,
        EQUILATERAL,
        ISOSCELES,
        RECTANGULAR,
        ACUTE_ANGLED,
        OBTUSE_ANGLED
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void determineTypeOfTriangle() {
        while (true) {
            double maxSide = Math.max(Math.max(getSideA(), getSideB()), getSideC());
            double minSide = Math.min(Math.min(getSideA(), getSideB()), getSideC());
            double meanSide = getSideA() + getSideB() + getSideC() - maxSide - minSide;
            if (minSide + meanSide <= maxSide) {
                triangleType = TriangleType.NOT_EXIST;
                break;
            }
            if (Math.abs(getSideA() - getSideB()) < EPSILON && Math.abs(getSideB() - getSideC()) < EPSILON) {
                triangleType = TriangleType.EQUILATERAL;
                break;
            }
            if (Math.abs(getSideA() - getSideB()) < EPSILON ||
                    Math.abs(getSideA() - getSideC()) < EPSILON ||
                    Math.abs(getSideB() - getSideC()) < EPSILON) {
                triangleType = TriangleType.ISOSCELES;
                break;
            }
            if (Math.pow(maxSide, 2) <= Math.pow(minSide, 2) + Math.pow(meanSide, 2)) {
                triangleType = TriangleType.RECTANGULAR;
            }
            if (Math.pow(maxSide, 2) < Math.pow(minSide, 2) + Math.pow(meanSide, 2)) {
                triangleType = TriangleType.ACUTE_ANGLED;
            }
            if (Math.pow(maxSide, 2) > Math.pow(minSide, 2) + Math.pow(meanSide, 2)) {
                triangleType = TriangleType.OBTUSE_ANGLED;
            }
            break;
        }
    }

    public String getType() {
        switch (triangleType) {
            case NOT_EXIST:
                return CONST_NOT_EXIST;
            case EQUILATERAL:
                return CONST_EQUILATERAL;
            case ISOSCELES:
                return CONST_ISOSCELES;
            case RECTANGULAR:
                return CONST_RECTANGULAR;
            case ACUTE_ANGLED:
                return CONST_ACUTE_ANGLED;
            case OBTUSE_ANGLED:
                return CONST_OBTUSE_ANGLED;
        }
        return triangleType.name();
    }

}
