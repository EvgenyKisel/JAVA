package It_academy_workbook_task3;

import java.io.IOException;

public class Main3 {

    public static void main(String[] args) throws IOException {
        Initialization init = new Initialization();
        double num = init.input();
        Operations operations = new Operations(num);
        operations.amount();
    }

}
