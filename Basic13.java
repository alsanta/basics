import java.util.ArrayList;

public class Basic13{
    public static void main(String[] args){
        // printNumsBetween(1,255);
        // printOddBetween(1,255);
        // System.out.println(sigmaOf(255));
        // int[] arr1 = {1,2,3,27,7,9,13};
        // iterateThroughArray(arr1);
        // findMAx(arr1);
        // System.out.println(OddArray(1,255));
    }

    public static void printNumsBetween(int start, int end){
        for(int x = start; x <= end; x++){
            System.out.println(x);
        }
    }

    public static void printOddBetween(int start,int end){
        for (int x = start; x <= end; x++){
            if (x %2 == 1){
                System.out.println(x);
            }
        }
    }

    public static int sigmaOf(int num){
        int sum = 0;
        for(int x = 1; x <= num; x++){
            sum += x;
        }
        return sum;
    }

    public static void iterateThroughArray(int [] input){
        for(int x = 0; x < input.length; x++){
            System.out.println(input[x]);
        }
    }

    public static void findMAx(int [] input){
        int max = input[1];
        for(int x = 1; x < input.length; x++){
            if (input[x] > max){
                max = input[x];
            }
        }
        System.out.println(max);
    }

    public static ArrayList<Integer> OddArray(int start, int stop){
        ArrayList<Integer> myArr = new ArrayList<Integer>();
        for(int x = start; x <= stop; x++){
            if(x %2 ==1){
                myArr.add(x);
            }
        }
        return myArr;
    }

}