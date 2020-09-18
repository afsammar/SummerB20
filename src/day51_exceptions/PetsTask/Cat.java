package day51_exceptions.PetsTask;

public class Cat extends Pet {


    public Cat(String name, String breed, int age, char gender, String color) {
        super(name, breed, age, gender, color);

    }
    public String toString() {
        return "Cat{" + "name=' " + name + '\'' + ", breed='" + breed + '\'' + ", gender=" + gender + ", age=" + age + ", color='" + color + '}';
    }
}
