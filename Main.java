/*Fibanocci Algorithm..Next number in sequence 
is gotten from the previous 2 numbers*/


public class Main {

    public static void main(String[] args) {
        /*int prev2 = 0;
        int prev1 = 1;

        for (int fibo = 0; fibo < 19; fibo++) {
            int newfibo = prev1 + prev2;
            System.out.println(newfibo);

            prev2 =prev1;
            prev1 =newfibo;
        }*/

        // DSA Arrays checking the smallest number in array

        int[] numbers = {5, 7, 8, 21, 13, 1};

        System.out.println(numbers[0]);

        int minVal = numbers[0];

for (int i : numbers) {
    if (i < minVal) {
       minVal = i;
       System.out.println("The Lowest number is: " + minVal);
    }
}
    }
}