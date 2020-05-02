package khankazanraees.company;

public class Main {

    public static void main(String[] args) {

//        Juggler Sequence starting with number 3:
//        Answer: 3, 5, 11, 36, 6, 2, 1

        int startNumber = 3;
        int numberOfTerms = 7;

        int[] arr = new int[numberOfTerms];
        arr[0] = startNumber;

        for (int i = 1; i < numberOfTerms; i++) {
            arr[i] = getNextValue(startNumber);
            startNumber = arr[i];
        }

        for (int i = 0; i < numberOfTerms; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int getNextValue(int currentValue) {
        double returnValue;

        if (isEven(currentValue)) {
            returnValue = Math.pow(currentValue, 0.5);
        } else {
            returnValue = Math.pow(currentValue, 1.5);
        }

        return (int) Math.floor(returnValue);
        //Math.floor rounds to the bottom so 8.9 will round to 8
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
        // return true => number is even
        // return false => number is odd
    }

}
