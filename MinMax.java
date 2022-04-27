import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n, min, max, i = 1, temp;
        System.out.print("Enter how many values ypu want to enter :");
        n = in.nextInt();

        System.out.print("Enter " + i + " number :");
        temp = in.nextInt();
        min = max = temp;
        i++;

        for (; i <=n; i++) {
            System.out.print("Enter " + i + " number :");
            temp = in.nextInt();
            if (temp < min)
                min = temp;
            if (temp > max)
                max = temp;
        }
        System.out.println("Maximum number is :" + max);
        System.out.println("Minimum number is :" + min);
    }
}
