package It_academy_workbook_task2;

import java.io.IOException;

public class NextDay {

    Initialization init = new Initialization();

    public void countDate() throws IOException {
        System.out.println("Введите день:");
        int day = init.input();
        System.out.println("Введите месяц:");
        int mounth = init.input();
        System.out.println("Введите год:");
        int year = init.input();
        System.out.println("Следующий день:");
        day = day + 1;
        if (day >= 31 && mounth % 2 == 0) {
            day = 1;
            mounth++;
        }
        if (day >= 30 && mounth % 2 != 0) {
            day = 1;
            mounth++;
        }
        if (mounth >= 12) {
            mounth = 1;
            year++;
        }
        if (year > 99){
            year = 1;
        }
        String d = String.valueOf(day);
        String m = String.valueOf(mounth);
        String y = String.valueOf(year);
        if (d.length()==1){
            d="0"+d;
        }
        if (m.length()==1){
            m="0"+m;
        }
        if (d.length()==1){
            y="0"+y;
        }
        System.out.println("Следующий день: " + d + "." + m + "." + y);


    }
}