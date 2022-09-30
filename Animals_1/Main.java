package Animals_1;
//Агрокомитет СССР
public class Main {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Собака", "Собачий корм", "Вольер #1");
        animals[1] = new Cat("Кот", "Кошачий корм", "Вольер #2");
        animals[2] = new Horse("Лошадь", "Лошадиный корм", "Конюшня");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
