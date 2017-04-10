package It_academy_workbook_task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Initialization {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a;

    public int input() throws IOException {
        String temp;
        while (true){
            try {
                temp = reader.readLine();
                if (temp.length()>2){
                    System.out.println("Incorrect input.");
                    continue;
                }
                a = Integer.parseInt(temp);
            } catch (NumberFormatException e) {
                System.out.println("Not a number.");
                continue;
            }
            break;
        }
        return a;
    }
}
