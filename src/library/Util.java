package library;

public class Util {
    public static String removedup(String str) {
        String nondup = "";
        for (String each : str.split("")) {
            if (!nondup.contains(each)) {
                nondup += each;
            }
        }
        return nondup;
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }

    public static int maxNum(int[] arr) {

        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }

        }
        return max;
    }

    public static int minNum(int[] arr) {

        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }

    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (ch == each) {
                count++;
            }
        }
        return count;
    }

    public static String uniques(String str) {
        String uniques = "";
        for (char each : str.toCharArray()) {

            int count = frequency(str, each);
            if (count == 1) {
                uniques += each;
            }
        }
        return uniques;
    }

    public static String Frequencyofchars(String str) {
        String exResult = "";
        String nonDup = Util.removedup(str);
        System.out.println(nonDup);
        for (int i = 0; i <= nonDup.length() - 1; i++) {
            char ch = nonDup.charAt(i);
            int count = Util.frequency(str, ch);
            exResult += "" + ch + count;
        }
        return exResult;
    }

    public static String fullname(String first,String last){
        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();

        last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullName =first+" "+last;
        return fullName;
    }

    public static int []addelement(int []arr,int num){

        int[]arr2=new int[arr.length+1];

        int i=0;
        for (int each:arr) {
            arr2[i]=each;
            arr2[arr2.length-1]=num;

            i++;
        }
        return arr2;
    }

    public static String[] combine2Arrays(String[] arr1, String [] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        int i = 0;
        for (String each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (String each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }

    public static int[] combine2Arrays(int[] arr1, int [] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }

    public static double[] combine2Arrays(double[] arr1, double [] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        int i = 0;
        for (double each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (double each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }

    public static char[] combine2Arrays(char[] arr1, char [] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int i = 0;
        for (char each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (char each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }

    public static Integer[] combine2Arrays(Integer[] arr1, Integer [] arr2) {
        Integer[] arr3 = new Integer[arr1.length + arr2.length];
        int i = 0;
        for (Integer each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (Integer each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }

    public static Double[] combine2Arrays(Double[] arr1, Double [] arr2) {
        Double[] arr3 = new Double[arr1.length + arr2.length];
        int i = 0;
        for (Double each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (Double each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }

    public static double maxNum(double[] arr) {

        double max = arr[0];
        for (double each : arr) {
            if (each > max) {
                max = each;
            }

        }
        return max;
    }

    public static Double maxNum(Double[] arr) {

        Double max = arr[0];
        for (Double each : arr) {
            if (each > max) {
                max = each;
            }

        }
        return max;
    }

    public static Integer maxNum(Integer[] arr) {

        Integer max = arr[0];
        for (Integer each : arr) {
            if (each > max) {
                max = each;
            }

        }
        return max;
    }

    public static double minNum(double[] arr) {

        double min = arr[0];
        for (double each : arr) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }

    public static Double minNum(Double[] arr) {

        Double min = arr[0];
        for (Double each : arr) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }

    public static Integer minNum(Integer[] arr) {

        Integer min = arr[0];
        for (Integer each : arr) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }
}
