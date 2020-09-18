package day51_exceptions.PetsTask;

public class Pet {
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String color;

    public Pet(String name, String breed, int age, char gender, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }

    protected void eat(){
        System.out.println(name+" is eating chocolate");
    }
    protected void drink(){
        System.out.println(name+" is drinking milk");
    }
    protected void sleep(){
        System.out.println(name+" is sleeping on the floor");
    }

public String toString(){
    return "Pet{"+"name=' "+name+'\''+", breed='"+breed+'\''+", gender="+gender + ", age="+age+", color='"+color+'}';
}
}