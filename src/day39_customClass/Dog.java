package day39_customClass;

public class Dog {
    String name;
    String breed;
    String size;
    int age;
    String color;

    public void setDoginfo(String dogname,String dogbreed,String dogsize,int dogage,String dogcolor){
        name=dogname;
        breed=dogbreed;
        size=dogsize;
        age=dogage;
        color=dogcolor;

    }
    public void getDogInfo(){
        System.out.println("Name: "+name+", breed: "+breed+", Size: "+", Age: "+age+" years old, "+"Color: "+color);
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food );

    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
}
