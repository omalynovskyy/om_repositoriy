package lesson02;


public class StepList {

    public static String  eachNth(String  str, int step){
        int len = str.length();
        String test = String.valueOf(str.charAt(0));
        while (step < len)
        {
            test = test.concat(String.valueOf(str.charAt(step)));
            step+=step;
        }
        return test;
    }
    public static void main(String[] args) {
        System.out.println(eachNth("anbrcjdpe",2));
        System.out.println(eachNth("anfbgrctjdoper",3));
    }

}
