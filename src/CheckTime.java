import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CheckTime {
/*    public static void main(String args[]){
*//*        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(System.currentTimeMillis()));*//*
        //Time time = new Time();
*//*        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println(format.format(date));
        System.out.println(date.equals(new Date(2021, 11, 18)));*//*
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));

    }*/

    public static String checkTimeOnDay(int HH){
        if (HH>=0 && HH<5) {
            return "凌晨";
        }
        if (HH>=5 && HH<12) {
            return "上午";
        }
        if (HH>=12 && HH<17) {
            return "下午";
        }
        if (HH>=17 && HH<24) {
            return "晚上";
        }
        return null;
    }

    public static int checkTimeOnyear(int yyyy, int MM, int dd){
        /*
        * 22 1 4
        * 22 12 24
        * 24 1 12
        * 25 1 1
        * 26 1 20
        * 27 1 9
        * 27 12 29
        * 29 1 16
        * 30 1 5
        * 30 12 26
        * */
        if (yyyy==2022 && MM==1 && dd==4) {
            return 2021;
        }
        if (yyyy==2022 && MM==12 && dd==24) {
            return 2022;
        }
        if (yyyy==2024 && MM==1 && dd==12) {
            return 2023;
        }
        if (yyyy==2025 && MM==1 && dd==1) {
            return 2024;
        }
        if (yyyy==2026 && MM==1 && dd==20) {
            return 2025;
        }
        if (yyyy==2027 && MM==1 && dd==7) {
            return 2026;
        }
        if (yyyy==2027 && MM==12 && dd==29) {
            return 2027;
        }
        if (yyyy==2029 && MM==1 && dd==16) {
            return 2028;
        }
        if (yyyy==2030 && MM==1 && dd==5) {
            return 2029;
        }
        if (yyyy==2030 && MM==12 && dd==26) {
            return 2030;
        }
        return 0;
    }

}
