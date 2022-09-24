package University;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov",
                "PKS", 4.5 );
        Aspirant aspirant = new Aspirant("Petr", "Petrov",
                "PKS", 3.4, "Work");

        Student[] students = { student, aspirant,};

        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}
