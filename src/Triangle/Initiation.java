package Triangle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Initiation {

    private double side;
    private String sideString;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public double getSide() {
        return side;
    }

    public String getSideString() {
        return sideString;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setSideString(String sideString) {
        this.sideString = sideString;
    }

    /**
     * this method enter the string
     *
     * @return string your entered
     */
    public String input() {
        try {
            System.out.print("Enter side of triangle:");
            setSideString(reader.readLine());
        } catch (Exception e) {
            System.out.println("Error");
        }
        return getSideString();
    }

    /**
     * this method translate string into double
     *
     * @param exchange - argument for translation into double type
     * @return translated into double side
     */
    public double parser(String exchange) {
        try {
            setSide(Double.parseDouble(exchange));
        } catch (Exception e) {
            System.out.println("It's not a number. Try again");
            correctInput();
        }
        return getSide();
    }

    /**
     * This method check for positivity your entered value.
     * If the entered value is negative, the re-entry and validation method is started
     *
     * @param verifiable - argument that you want to check
     */
    public void checker(double verifiable) {
        if (verifiable <= 0) {
            System.out.println("Only positive numbers. Try again");
            correctInput();
        }
    }

    /**
     * this method causes other three methods: input the value, translate it into double and check for negativity
     *
     * @return entered, translated and verified side of the triangle
     */
    public double correctInput() {
        input();
        parser(getSideString());
        checker(getSide());
        return getSide();
    }

}
