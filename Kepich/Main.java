package Kepich;

public class Main {
    public static void main(String[] args) {
        String a = "Ketchup";
        String b = "Ketchup";
        String c = "Kepchuk";

        if (a.equals(b)) {
            System.out.println("Слово " + c + " неверно");
        }
        if (a.equals(c)) {
            System.out.println("Слово " + b + " неверно");
        }
        if (c.equals(b)) {
            System.out.println("Слово " + a + " неверно");
        }
    }
}
