package lesson02;


public class StepList {

    public static String  eachNth(String  str, int step){
        int len = str.length();
        int i = step;
        String test = String.valueOf(str.charAt(0));
        while (i <= len)
        {
            test = test.concat(String.valueOf(str.charAt(i)));
            i+=step;
        }
        return test;
    }
    public static void main(String[] args) {
        System.out.println(eachNth("anbrcjdpe",2));
        System.out.println(eachNth("anfbgrctjdoper",3));
        System.out.println(eachNth("Miracle", 2));
        System.out.println(eachNth("abcdefg", 2));
        System.out.println(eachNth("abcdefg", 3));
    }

}
