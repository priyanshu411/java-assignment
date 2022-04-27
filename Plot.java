import java.util.Scanner;

public class Plot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l, b, totalArea = 0, remainingArea = 0, allPlotArea = 0;
        char choice;
        System.out.print("Enter length & breadth of total ground :");
        l = in.nextInt();
        b = in.nextInt();
        totalArea += l * b;
        remainingArea = totalArea;
        do {
            System.out.print("Enter length & breadth of a Plot:");
            l = in.nextInt();
            b = in.nextInt();
            if (l * b <= remainingArea) {
                allPlotArea += l * b;
                remainingArea =totalArea- allPlotArea;
                System.out.print("Do you want to enter more plot (Y/N) :");
                choice = in.next().charAt(0);
            } else {
                System.out.println("No more size available");
                break;
            }
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Total area is :" + totalArea);
        System.out.println("Remaining area is :" + (remainingArea));
    }
}
