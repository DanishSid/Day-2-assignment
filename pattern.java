
public class pattern{
        // Method to print a pattern with a given size 'n'
        public static void printPattern(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Print "\" at diagonal from top-left to bottom-right
                    if (j == i) {
                        System.out.print("\\");
                    }
                    // Print "/" at diagonal from top-right to bottom-left
                    else if (j == n - 1 - i) {
                        System.out.print("/");
                    }
                    // Print "*" for all the other positions
                    else {
                        System.out.print("*");
                    }
                }
                System.out.println(); // Move to the next line
            }
        }

        public static void main(String[] args) {
            printPattern(7); // Call the printPattern method with size 7
        }


}
//Time Complexity:O(n^2)
//Space Complexity:0(1)

//Algorithm
//First we declare method printpattern with paramenter n
//then we declare two variables i and j
//then we use for loop to iterate i from 0 to n-1
//then we use for loop to iterate j from 0 to n-1
// then we use if condition to check if j is equal to i or j is equal to n-1-i
//if condition is true then we print \
// else if condition is true then we print /
// else we print *
// then we print new line
