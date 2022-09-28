package Seasons_2;
public class Main {
    static Seasons season = Seasons.spring;
    public static void main(String[] args) {
        int temp;
        if (season.equals(Seasons.spring)) {
            System.out.println("My fav season is a spring");
        }
        switch (season) {
            case summer:
                temp = Integer.parseInt(Seasons.summer.getTemp());
                System.out.println("I love Summer! Average temperature: " + temp);
                System.out.println(temp);
                break;
            case spring:
                temp = Integer.parseInt(Seasons.spring.getTemp());
                System.out.println("I love Spring! Average temperature: " + temp);
                seas.getDiscription();
                break;
            case autumn:
                temp = Integer.parseInt(Seasons.autumn.getTemp());
                System.out.println("I love Autumn! Average temperature: " + temp);
                break;
            case winter:
                temp = Integer.parseInt(Seasons.winter.getTemp());
                System.out.println("I love Winter! Average temperature: " + temp);
                break;
        }
    }
    public class seas{
       public static void getDiscription(){
           if (season.equals(Seasons.summer)){
               System.out.println("Тёплое время года");
           }
           else{
               System.out.println("Холодное время года");
           }
       }
    }
}

