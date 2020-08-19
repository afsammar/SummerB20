package Day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferInfo(100000,"VA",true,true,true,"Tester",true);
        offer2.setOfferInfo(140000,"VA",false,true,false,"Tester",true);
        offer3.setOfferInfo(170000,"GA",true,false,true,"Tester",true);
        offer4.setOfferInfo(90000,"PA",false,true,false,"Tester",true);
        offer5.setOfferInfo(120000,"TX",true,false,false,"Tester",true);
        offer6.setOfferInfo(110000,"MA",false,true,false,"Tester",true);
        offer7.setOfferInfo(110000,"MA",false,true,false,"Tester",true);

        ArrayList<Offer>jobOffers = new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));
        for (Offer each:jobOffers) {
            each.getOfferInfo();
        }
        System.out.println("==========================================");
       // jobOffers.removeIf(p->p.salary<120000);

        jobOffers.removeIf(p->p.salary<120000||p.equals("VA"));
        System.out.println("Number of offers: "+jobOffers.size());



    }
}
