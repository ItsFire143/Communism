package Seasons;

public enum Seasons {
    winter("-20"),
    spring("20"),
    summer("25"),
    autumn("-10");
    private String temp;
    Seasons(String temp){
        this.temp = temp;
    }
    public String getTemp() {return temp;
    }
}
