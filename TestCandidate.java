import java.util.Scanner;

class Candidate {

    static int[][] centers = new int[5][2]; //all centre
    private int id;
    private String name;
    private char gender;
    private int centre;

    // set candidate profile
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCentre(int centre) {
        this.centre = centre;
    }

    // get candidate profile detail

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getCentre() {
        return centre;
    }
}




// Test candidate class
public class TestCandidate {

    static Candidate[] c = new Candidate[100];

    static int counter = 0;
    static Scanner in = new Scanner(System.in);

    public static void setCandidateData() {
        int[] ch = new int[3];
        boolean flag = false;
        System.out.print("Enter Name :");
        String name = in.nextLine();
        System.out.print("Enter Gender (M/F) :");
        char gender = in.next().charAt(0);
        System.out.println("enter three centre : c1 :1 , c2 : 2 , c3 : 3 , c4 : 4 , c5 : 5");
        ch[0] = in.nextInt();
        ch[1] = in.nextInt();
        ch[2] = in.nextInt();
        for (int i = 0; i < ch.length; i++) {
            int cen = ch[i] - 1;
            if (Candidate.centers[cen][0] - Candidate.centers[cen][1] > 0) {
                c[counter] = new Candidate();
                c[counter].setCentre(ch[i]);
                Candidate.centers[cen][1] += 1;
                flag = true;
                break;
            }
        }
        if (flag) {
            c[counter].setId(counter + 1);
            c[counter].setName(name);
            c[counter].setGender(gender);
            System.out.println("Registration Successfully\nID is  :"+ (counter+1));
            counter++;
        } else
            System.out.println("seat not available try again...");

    }

    public static void getDataAllCentre() {
        System.out.println("    Free | Allocated | Total");
        System.out.println();
        for (int i = 0; i < Candidate.centers.length; i++) {
            System.out.print("C" + (i + 1) + "   ");
            for (int j = Candidate.centers[i].length - 1; j >= 0; j--) {
                if (j == Candidate.centers[i].length - 1)
                    System.out.print(Candidate.centers[i][j - 1] - Candidate.centers[i][j] + "        ");
                System.out.print(Candidate.centers[i][j] + "        ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void getDetailOfCand() {
        System.out.print("enter candidate id :");
        int id = in.nextInt();
        id--;
        if (c[id] != null) {
            System.out.println("ID :" + c[id].getId());
            System.out.println("Name :" + c[id].getName());
            System.out.println("Gender :" + c[id].getGender());
            System.out.println("Centre : c" + c[id].getCentre());
        } else
            System.out.println("ID not present..");
    }

    public static void getDetailOfCentre() {
        System.out.println("Select centre : c1 : 1 , c2 : 2 , c3 : 3 , c4 : 4 , c5 : 5\n");
        int cen = in.nextInt();
        if (cen >= 1 && cen <= 5) {
            System.out.println("Detail of Centre : c" + cen);
            System.out.println("Free seats      : "+(Candidate.centers[cen-1][0]-Candidate.centers[cen-1][1]));
            System.out.println("Allocated seats : "+Candidate.centers[cen-1][1]);
            System.out.println("Total seats     : "+Candidate.centers[cen-1][0]);

        } else
            System.out.println("Invalid choice...");
    }

    public static void main(String[] arr) {

        Candidate.centers[0][0] = 1;
        Candidate.centers[1][0] = 20;
        Candidate.centers[2][0] = 15;
        Candidate.centers[3][0] = 30;
        Candidate.centers[4][0] = 25;

        int choice;
        while (true) {
            System.out.print("\n\n\n");
            System.out.println("1 : Candidate registration");
            System.out.println("2 : Status of all centre");
            System.out.println("3 : Specific candidate detail");
            System.out.println("4 : Specific center detail");
            System.out.println("5 : Exit");
            System.out.println();
            System.out.print("Enter your choice :");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    setCandidateData();
                    in.nextLine();
                    break;
                case 2:
                    getDataAllCentre();
                    in.nextLine();
                    break;
                case 3:
                    getDetailOfCand();
                    in.nextLine();
                    break;
                case 4:
                    getDetailOfCentre();
                    in.nextLine();
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("Enter a valid choice");

            }

        }

    }

}