package lesson03;

import java.util.Arrays;

public class Fibonacci {
   //nt n;


    public static int[] printFibonacciNumbers(int n){
        int first = 0, last=1, i=0;
        int[] numbers;

        numbers = new int[n];
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
                return numbers;


        }

    public static void main(String[] args) {
        int size=-1, top = 10;
        while(size <= top){
            if (size <= 0){
                System.out.printf("printFibonacciNumbers(%d) -> \"Please enter a positive number more than 0\"%n", size);
            }else {
                System.out.printf("printFibonacciNumbers(%d) -> %s%n",size, Arrays.toString(printFibonacciNumbers(size)));
            }
            size++;
        }
    }
}
