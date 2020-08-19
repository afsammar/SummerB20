package Day41_Static;

import java.util.ArrayList;

public class CatObjects {
    public static void main(String[] args) {


        Cat cat1 = new Cat();
        cat1.setCatInfo("Cass",11,'F',"Black","Persian");
        cat1.setCatInfo("Cass",11,'F',"Black","Persian");
        cat1.setCatInfo("Cass",11,'F',"Black","Persian");
        cat1.setCatInfo("Cass",11,'F',"Black","Persian");

        System.out.println(cat1);
        System.out.println("=========================================================");

        Cat[] catPark = {cat1,new Cat(),new Cat(),new Cat(),new Cat(),new Cat()};
        catPark[1].setCatInfo("lord",11,'F',"Black","Persian");
        catPark[2].setCatInfo("yoyo",12,'M',"white","Persian");
        catPark[3].setCatInfo("alsan",13,'M',"Black","Persian");
        catPark[4].setCatInfo("king",14,'F',"orange","Persian");
        catPark[5].setCatInfo("masa",15,'M',"Black","Persian");
        for (Cat each:catPark) {
            System.out.println(each);
            System.out.println("===================================================");

            ArrayList<Cat>femaleCats=new ArrayList<>();
            ArrayList<Cat>maleCats=new ArrayList<>();
            for(int i =0; i<=catPark.length-1;i++){
                if(catPark[i].gender=='M'){
                    maleCats.add(catPark[i]);
                }else{
                    femaleCats.add(catPark[i]);
                }
            }
            System.out.println(femaleCats);
            System.out.println(maleCats);

        }
    }
}