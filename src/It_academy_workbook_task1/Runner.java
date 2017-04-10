package It_academy_workbook_task1;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Initialization init = new Initialization();
        int num = init.input();
        switch (num%10){
            case 0:
                System.out.println(num+" рублей");
                break;
            case 1:
                System.out.println(num+" рубль");
                break;
            case 2:
                System.out.println(num+" рубля");
                break;
            case 3:
                System.out.println(num+" рубля");
                break;
            case 4:
                System.out.println(num+" рубля");
                break;
            case 5:
                System.out.println(num+" рублей");
                break;
            case 6:
                System.out.println(num+" рублей");
                break;
            case 7:
                System.out.println(num+" рублей");
                break;
            case 8:
                System.out.println(num+" рублей");
                break;
            case 9:
                System.out.println(num+" рублей");
                break;
            default:
                System.out.println("-");
        }
    }
}
