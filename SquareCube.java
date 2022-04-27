public class SquareCube {
    public static void main(String[] st) {
        int []arr=new int [st.length];
        int temp;
         // convert string array to integer array
         for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st[i]);
        }

        // sort in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        // print square and cube
        System.out.println("No   square  cube\n");
        for(int a:arr){
            System.out.println(a+"     "+(a*a)+"     "+(a*a*a));
        }
    }
}
