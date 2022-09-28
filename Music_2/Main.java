package Music_2;
//Министерство культуры СССР
public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[5];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(20);
        instruments[2] = new Trumpet(4);
        instruments[3] = new Guitar(4);
        instruments[4] = new Guitar(7);
        instruments[5] = new Drum(15);
    }
}
