package Java;

public class CopilotDemo {

    // Write me a code to find the smallest number in an array
    // This function finds the smallest number in the array numbers.
    // It does this by iterating through the array, comparing each
    // number to the current smallest number, and updating the
    // current smallest number if the current number is smaller.
  

public static int findSmallest(int[] numbers) {
        int smallest = numbers[0]; //Declare the smallest number as the first number in the array
        for (int i = 1; i < numbers.length; i++) { //Loop through the array
            if (numbers[i] < smallest) //If the current number is smaller than the smallest number
                smallest = numbers[i]; //Set the current number as the smallest number
        }
        return smallest; //Return the smallest number
    }

    // Call the above method in the main method
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 }; //Declare an array of numbers
        System.out.println("The Smallest number is :" + findSmallest(numbers)); //Call the findSmallest method
    }
    
}
