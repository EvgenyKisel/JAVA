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

    public String input()  {
            try {
                System.out.print("Enter side of triangle:");
                setSideString(reader.readLine());
            } catch (Exception e) {
                System.out.println("Error");
            }
        return getSideString();
    }

    public double parser(String exchange){
        try {
            setSide(Double.parseDouble(exchange));
        } catch (Exception e){
            System.out.println("It's not a number. Try again");
            correctInput();
        }
        return getSide();
    }

    public void checker(double verifiable){
        if (verifiable<=0) {
            System.out.println("Only positive numbers. Try again");
            correctInput();
        }
    }

    public double correctInput(){
        input();
        parser(getSideString());
        checker(getSide());
        return getSide();
    }

}
