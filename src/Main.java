public class Main {

    public static void main(String[] args) {
        // Calling the getEvenDigitSum method with different numbers and printing the results.
        System.out.println(getEvenDigitSum(12345678)); // Should print 20
        System.out.println(getEvenDigitSum(47689150)); // Should print 20
        System.out.println(getEvenDigitSum(2468));     // Should print 20
    }

    // A method to calculate the sum of even digits in a given number.
    public static int getEvenDigitSum(int number) {
        // Check if the input number is negative. If it is, return -1.
        if (number < 0) {
            return -1;
        }

        int sum = 0; // Initialize a variable to store the sum of even digits.
        for (int i = number; i > 0; i /= 10) {
            // Extract the last digit of the number.
            int lastDigit = i % 10;
            // Check if the last digit is even (divisible by 2).
            if (lastDigit % 2 == 0) {
                // If it's even, add it to the sum.
                sum += lastDigit;
            }
        }
        // Return the sum of even digits in the number.
        return sum;
    }
}
