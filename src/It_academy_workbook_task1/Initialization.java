package It_academy_workbook_task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Initialization {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a;

    public int input() throws IOException {
        String temp;
        while (true) {
            try {
                System.out.println("Введите количество денег:");
                temp = reader.readLine();
                a = Integer.parseInt(temp);
                if (a < 0) {
                    System.out.println("Is it about money?");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Not a number.");
                continue;
            }
            break;
        }
        return a;
    }
}
