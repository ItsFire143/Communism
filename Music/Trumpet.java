package Music;
//Пионерский горн
public class Trumpet implements Instrument{
    public int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.printf("Играет труба с диаметром: %i", diameter);
    }
}
