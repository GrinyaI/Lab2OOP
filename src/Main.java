import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(validate(sc.nextLine()));
    }
    public static String validate(String ip)
    {
        String IPADDRESS_PATTERN = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        if (pattern.matcher(ip).matches())
            return ip + " is correct";
        else
            return ip + " isn`t correct";
    }
}