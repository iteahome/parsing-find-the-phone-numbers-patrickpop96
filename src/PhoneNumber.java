import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\(|){1}?(07[0-9]{2}){1}?(\\s|\\.|\\-|\\)|){2}?([0-9]{3}(\\s|\\.|\\-|)){2}");
        Matcher phoneNumber = pattern.matcher("0832 973213 ada 074o-123 312 0721 912 123 123 321 212 0732-222111(7480)-732213 0932-213-231(0732)-1321220749 223-102a0792-010-110 ");
        while (phoneNumber.find()) {
            System.out.println(phoneNumber.group() + '\n' );
        }
    }
}
