package University_1;
//Советские аспиранты
public class Aspirant extends Student{
    String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }
    public int getScholarship() {
        return averageMark == 5 ? 20000 : 18000;
    }
}
