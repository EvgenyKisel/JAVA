package It_academy_workbook_task3;

public class Operations {

    private double a;

    public Operations(double a) {
        this.a = a;
    }

    public void amount() {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a = a / 10;
        }
        System.out.print("Amount of digits: " + sum);
    }
}
