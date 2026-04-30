import java.util.Scanner;

public class FriendsDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height
        for (int i = 0; i < 3; i++) {

            System.out.println("Enter details for " + names[i]);

            System.out.print("Enter Age: ");
            ages[i] = sc.nextInt();

            System.out.print("Enter Height: ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest
        int youngestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest Friend: " + names[youngestIndex]);
        System.out.println("Age: " + ages[youngestIndex]);

        System.out.println("\nTallest Friend: " + names[tallestIndex]);
        System.out.println("Height: " + heights[tallestIndex]);

        sc.close();
    }
}
