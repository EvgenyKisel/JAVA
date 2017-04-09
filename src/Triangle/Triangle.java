package Triangle;

public class Triangle {

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double first, double second, double third) {
        this.firstSide = first;
        this.secondSide = second;
        this.thirdSide = third;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void outSides() {
        System.out.println("Sides your entered:");
        System.out.println(getFirstSide() + " " + getSecondSide() + " " + getThirdSide());
    }

    public void nameOfTriangle() {
        while (true) {
            if (!(getFirstSide() + getSecondSide() > getThirdSide() &&
                    getSecondSide() + getThirdSide() > getFirstSide() &&
                    getFirstSide() + getThirdSide() > getSecondSide())) {
                System.out.println("Wrong sides. You can't make a triangle. Enter right sides.");
                break;
            }
            if (getFirstSide() == getSecondSide() && getSecondSide() == getThirdSide()) {
                System.out.println("Triangle is equilateral.");
            }
            if (getFirstSide() == getSecondSide() || getFirstSide() == getThirdSide() || getSecondSide() == getThirdSide()) {
                System.out.println("Triangle is isosceles.");
            }
            double max = getFirstSide();
            if (getSecondSide() > max) {
                max = getSecondSide();
            }
            if (getThirdSide() > max) {
                max = getThirdSide();
            }
            double min = getFirstSide();
            if (getSecondSide() < min) {
                min = getSecondSide();
            }
            if (getThirdSide() < min) {
                min = getThirdSide();
            }
            double mean = getFirstSide() + getSecondSide() + getThirdSide() - max - min;
            if (Math.pow(max, 2) == Math.pow(min, 2) + Math.pow(mean, 2)) {
                System.out.println("Triangle is rectangular");
            }
            if (Math.pow(max, 2) < Math.pow(min, 2) + Math.pow(mean, 2)) {
                System.out.println("Triangle is acute-angled");
            }
            if (Math.pow(max, 2) > Math.pow(min, 2) + Math.pow(mean, 2)) {
                System.out.println("Triangle is obtuse-angled");
            }
        }
    }

}
