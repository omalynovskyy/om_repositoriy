package lesson03;

import java.util.Arrays;

public class Fibonacci {

    public static void printFibonacciNumbers(int n){

        if(n<=0){
            System.out.printf("printFibonacciNumbers(%d) -> \"Please enter a positive number more than 0\"%n",n);
        } else {
        int first = 0, last=1, i=0;
        int[] numbers =new int[n];
        switch (n){
            case 1:
                numbers[i] = 0;

                break;
            case  2:
                numbers[i] = 0;
                numbers[i+1] = 1;

            break;
            default:
                numbers[i] = 0;
                i++;
                numbers[i] = 1;
                i++;
                while (i<n){
                    numbers[i] = first+last;
                    first=last;
                    last=numbers[i];
                            i++;
                }
                }
       System.out.printf("printFibonacciNumbers(%d) -> %s%n",n, Arrays.toString(numbers));
        
        }


        }

    public static void main(String[] args) {
        int size=-1, top = 10;
        while(size <= top){
            printFibonacciNumbers(size);
            size++;
        }
        }

}
