import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSide {

    public double a;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public double input() throws IOException {
        while (true) {
            try {
                System.out.print("Enter side of triangle:");
                String temp = reader.readLine();
                a = Double.parseDouble(temp);
                if (a <= 0) {
                    System.out.println("Stupid. It's triangle! Only positive numbers, Karl!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("It's not a number, man.");
                continue;
            }
            break;
        }
        return a;
    }

}
