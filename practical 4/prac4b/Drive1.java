package prac4b;
import java.util.Scanner;

public class Drive1 {

    public static void main(String[] args) {
        String[] logs = {"10:05 alice Hello there",
                "10:10 bob Good morning",
                "InvalidLine",
                "10:20 charlie See you later"
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();
        ChatFilter cf = new ChatFilter();
        System.out.println();

        System.out.println(cf.filterLogs(logs, keyword));
        sc.close();
    }
}