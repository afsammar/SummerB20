package Day03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Variables {
    public static void main(String[] args) {


        // length: 2, width: 4, area : 8
        byte length = 11;
        byte width = 12;
        System.out.println(length*width);

        //140
        //byte num1 = 140; it doesnt work because 140 is out of range
        //DataType variableName = Data;
        // if you are worried about memory usage chose the one that has less consume


        short num2 = 140;
        int salary = 40000;
        //int largenumber = 9999999999;
        long largernumber = 9999999999l;
        int score = 100 ;
        System.out.println(score);
        // PI = 3.14
        //byte PI = 3.14;
        double PI = 3.14;
        System.out.println(PI);
        double decimal1 = 3.5;
        System.out.println(decimal1);
        float decimal2 = 3.5f;
        System.out.println(decimal2);

    }
}
