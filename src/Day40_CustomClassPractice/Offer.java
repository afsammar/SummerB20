package Day40_CustomClassPractice;

public class Offer {

    double salary;
    String state;
    boolean hasPTO;
    boolean isfulltime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefits;
    public void setOfferInfo(double salary, String state, boolean hasPTO,boolean isfulltime, boolean isWFH,String jobTitle,boolean hasBenefits){
    this.salary=salary;
    this.state=state;
    this.hasPTO=hasPTO;
    this.isfulltime=isfulltime;
    this.isWFH=isWFH;
    this.jobTitle=jobTitle;
    this.hasBenefits=hasBenefits;
    }
    public void getOfferInfo(){
        System.out.println("=================================");
        System.out.println("Salary: "+salary);
        System.out.println("Location: "+state);
        System.out.println("Job Title: "+jobTitle);




        System.out.println("=================================");


    }
}
