package Triangle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inputer {

    private double side;
    private String sideString;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String input()  {
            try {
                System.out.print("Enter side of triangle:");
                sideString = reader.readLine();
            } catch (Exception e) {
                System.out.println("Error");
            }
        return sideString;
    }

    public double parser(){
        try {
            side = Double.parseDouble(sideString);
        } catch (Exception e){
            System.out.println("It's not a number. Try again");
            correctInput();
        }
        return side;
    }

    public void checker(){
        if (side<=0) {
            System.out.println("Only positive numbers. Try again");
            correctInput();
        }
    }

    public double correctInput(){
        input();
        parser();
        checker();
        return side;
    }

}
