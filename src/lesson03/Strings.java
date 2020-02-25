package lesson03;

import org.w3c.dom.ls.LSOutput;

public class Strings {
    static String str = new String(" test string ");

    public static void main(String[] args) {
        String str2 = new String(" test string ");
        String str3 = new String(" TEST STRING ");
        String split1 = new String(" ");

        System.out.println("check charAt 2 -> "+str.charAt(2));
        System.out.println("ends with ing? ->"+str.endsWith("ing"));
        System.out.println("ends with eng? ->  "+str.endsWith("eng"));
        System.out.println("same as \"test\"? -> "+str.equals(new String("test")));
        System.out.println("same as str2? -> "+str.equals(str2));
        System.out.println("same as str3? -> "+str.equals(str3));
        System.out.println("same as str3 ignore case? -> "+str.equalsIgnoreCase(str3));
        System.out.println("string str length is -> "+str.length());
        System.out.println("replace i to o -> "+str.replace("i","o"));
        System.out.println("split str -> "+str.split(split1));
        System.out.println("starts with te? -> "+str.startsWith("te"));
        System.out.println("second word is -> "+str.substring(5));
        System.out.println("test variable name is -> "+str.substring(5,8));
        System.out.println("str3 to lower case-> "+str3.toLowerCase());
        System.out.println("str to upper case-> "+str.toUpperCase());
        System.out.println("str3 trimmed -> \""+str3.trim()+"\"");

        System.out.println(str.concat("> this is added"));
        System.out.println("s appears at place "+str.indexOf("s"));
        System.out.println(" st appears at place "+str.indexOf(" st"));
        System.out.println("s last time appears at place "+str.lastIndexOf("s"));
        System.out.println("tr last time appears at place "+str.lastIndexOf("tr"));

        char[] strArray = str.toCharArray();
        for(char ch:strArray){
            System.out.println(ch);
        }
    }
}
