package Music;
//Маршевые барабаны
public class Drum implements Instrument {
    public int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.printf("Играет барабан с размером: " + size);
    }
}
