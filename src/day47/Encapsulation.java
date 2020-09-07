package day47;

public class Encapsulation {
    private long ssn = 1234567;

    public long getSsn(){ //to read only
        return this.ssn;
    }
    public void setSsn(long ssn){
        this.ssn=ssn;
    }

}
