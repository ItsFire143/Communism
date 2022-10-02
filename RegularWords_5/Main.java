package RegularWords_5;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String firstMessage = "Kepchuk";
        String secondMessage = "Ketchup";
        String thirdMessage = "Ketchup";

        if (Pattern.matches("Ketchup", firstMessage)) {
            System.out.println("В слове ошибка: " + firstMessage);
        } else if (Pattern.matches("Ketchup", secondMessage)) {
            System.out.println("В слове ошибка: " + secondMessage);
        } else if (Pattern.matches("Ketchup", thirdMessage)) {
            System.out.println("В слове ошибка: " + thirdMessage);
        }
    }
}