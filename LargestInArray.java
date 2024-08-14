package oops;

public class LargestInArray {

	public static void main(String[] args) {
		int[] numbers = {34, 12, 56, 78, 23, 67, 89};

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number in the array is: " + largest);
	}

}
