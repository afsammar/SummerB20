package day51_exceptions.PetsTask;

public class Tiger extends Pet {

    public Tiger(String name, String breed, int age, char gender, String color) {
        super(name, breed, age, gender, color);
    }
    public String toString() {
        return "Tiger{" + "name=' " + name + '\'' + ", breed='" + breed + '\'' + ", gender=" + gender + ", age=" + age + ", color='" + color + '}';
    }
}
