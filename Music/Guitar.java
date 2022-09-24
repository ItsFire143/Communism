package Music;
//Егор Летов Запрещён
public class Guitar implements Instrument{

    public int stringCount;

    public Guitar(int stringCount) {
        this.stringCount = stringCount;
    }
    @Override
    public void play() {
        System.out.printf("Играет гитара с %i струнами", stringCount);
    }
}
