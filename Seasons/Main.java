package Seasons;

public class Main {
    public static void main(String[] args) {
        enum Season {
            winter("-20"),
            spring("15"),
            summer("25"),
            autumn("10");
            private String temp;
            Season(String temp){
                this.temp = temp;
            }
            public String getTemp() {return temp;
            }
        }
    }
}
