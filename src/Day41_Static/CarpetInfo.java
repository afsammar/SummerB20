package Day41_Static;

import java.util.ArrayList;

public class CarpetInfo {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(20.5, 35, 3, true);
        carpets[1].customOrder(23.2, 25, 4, false);
        carpets[2].customOrder(15.5, 17, 5, true);
        carpets[3].customOrder(21, 24.5, 2, true);
        carpets[4].customOrder(31, 35, 1.2, true);

        for (Carpet each : carpets) {
            each.getCarpetInfo();
        }

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpets = new ArrayList<>();

        for (int i = 0; i<=carpets.length-1; i++){
            if(carpets[i].IsPersian){
                persianCarpets.add(carpets[i]);
            }else{
                regularCarpets.add(carpets[i]);
            }

        }
        System.out.println("number of persian carpets: "+persianCarpets.size());
        System.out.println("number of regular carpets: "+regularCarpets.size());
    }

}
