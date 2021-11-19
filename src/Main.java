import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        if (CheckTime.checkTimeOnyear(year, month, dayOfMonth) != 0) {
            try {
                birthday(CheckTime.checkTimeOnyear(year, month, dayOfMonth),CheckTime.checkTimeOnDay(hourOfDay));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("哎呀，程序错误了，快检查一下哪里不对劲~~~");
            }
        }else {
            try {
                fontImage();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("笨蛋！输入的信息错误啦，快检查一下上面哪个地方写错了，再来一遍吼~");
            }
        }
    }
    public static void fontImage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hi，亲爱的纪老板\n\n" +
                "这个程序可以将指定的图片替换成”由文字构成的新图片“，我将这个软件称为【FontImage】，希望你喜欢^_^\n\n" +
                "----------------------------------------假装这里有一条分割线----------------------------------------\n\n" +
                "首先，你需要在输入一张图片的地址（例如，C:\\Users\\ZRJ0618\\Desktop\\纪雯滨.jpg）:");
        String photoAddress = scanner.next();
        System.out.println("\n然后，你需要输入一段文字（例如，我爱你）:");
        String fontValue = scanner.next();
        System.out.println("\n最后，你需要输入文字的尺寸（例如，12）:");
        int fontSize = scanner.nextInt();
        try {
            FontImage.createFongImg(photoAddress,fontValue,fontSize);
            System.out.println("\nOK，图片转换完成，请关闭窗口，爱你呦~");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("笨蛋！输入的信息错误啦，快检查一下上面哪个地方写错了，再来一遍吼~");
        }
        scanner.next();
    }
    public static void birthday(int year, String time){
        Scanner scanner = new Scanner(System.in);
        String s;
        if (year == 2021) {
            s = BirthdayText.year2021(time);
        }else if(year ==  2022){
            s = BirthdayText.year2022();
        }else if(year ==  2023){
            s = BirthdayText.year2023();
        }else if(year ==  2024){
            s = BirthdayText.year2024();
        }else if(year ==  2025){
            s = BirthdayText.year2025();
        }else if(year ==  2026){
            s = BirthdayText.year2026();
        }else if(year ==  2027){
            s = BirthdayText.year2027();
        }else if(year ==  2028){
            s = BirthdayText.year2028();
        }else if(year ==  2029){
            s = BirthdayText.year2029();
        }else if(year ==  2030){
            s = BirthdayText.year2030();
        }else {
            s = "";
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        scanner.next();
    }
}
