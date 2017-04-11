package It_academy_workbook_task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Initialization {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    double a;

    public double input() throws IOException {
        String temp;
        while (true) {
            System.out.println("Enter the number: ");
            try {
                temp = reader.readLine();
                a = Double.parseDouble(temp);
            } catch (NumberFormatException e) {
                System.out.println("Not a number. Try again");
                continue;
            }
            break;
        }
        return a;
    }
}
