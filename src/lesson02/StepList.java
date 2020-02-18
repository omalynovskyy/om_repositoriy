package lesson02;


public class StepList {
    static String  str;
    static int step;

    public StepList(String str, int step) {
        this.str = str;
        this.step = step;
    }
    public void eachNth(){
        int i=step;
        int len = str.length();
        String test = String.valueOf(str.charAt(0));
        while (i < len)
        {
            test = test.concat(String.valueOf(str.charAt(i)));
            i+=step;
        }
        System.out.println(test);
    }
    public static void main(String[] args) {
        StepList result = new StepList("avbfckdoeof",2);
        result.eachNth();
    }

}
