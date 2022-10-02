package RegularTime_5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main (String[] args){
        String message = "Завтрак в 23:47 Обед в 00:00 Ужин завтра";
        Pattern pattern = Pattern.compile("(2[0-3]|[0-1]\\d):[0-5]\\d");
        Matcher matcher = pattern.matcher(message);
        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}
