package Triangle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Initiation {

    private double side;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public double getSide() {
        return side;
    }

    public void setSide(String side) {
        try {
            this.side = Double.parseDouble(side);
        } catch (Exception e) {
            System.out.println("It's not a number. Try again");
            getTheSideOfTriangle();
        }
    }

    /**
     * this method enter the string
     *
     * @return string your entered
     */
    public String input() {
        String sideStr;
        while (true) {
            try {
                System.out.print("Enter side of triangle: ");
                sideStr = reader.readLine();
            } catch (Exception e) {
                System.out.println("Error");
                continue;
            }
            break;
        }
        return sideStr;
    }

    /**
     * This method check for positivity your entered value.
     * If the entered value is negative, the re-entry and validation method is started
     *
     * @param verifiable - argument that you want to check
     */
    public void checkPositivity(double verifiable) {
        if (verifiable <= 0) {
            System.out.println("Only positive numbers. Try again");
            getTheSideOfTriangle();
        }
    }

    /**
     * this method causes other three methods: input the value, translate it into double and check for positivity
     *
     * @return entered, translated and verified side of the triangle
     */
    public double getTheSideOfTriangle() {
        setSide(input());
        checkPositivity(getSide());
        return getSide();
    }

}
