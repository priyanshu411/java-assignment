public class AscOrder {
    public static void main(String[] st) {
        int n = st.length, temp;
        char choice = st[n - 1].charAt(0);
        int[] arr = new int[n - 1];
        boolean flag = false;
        // convert string array to integer array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st[i]);
        }

        if (choice == 'a' || choice == 'A') {
            System.out.println("values in  ascending order are...");
            flag = true;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        if (choice == 'd' || choice == 'D') {
            System.out.println("values in  descending order are...");
            flag = true;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        if (flag) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "  ");
            }
        } else
            System.out.println("Invalid choice");
    }
}
