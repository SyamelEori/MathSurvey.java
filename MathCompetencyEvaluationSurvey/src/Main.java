import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static final String YELLOW = "\u001B[33m";                    //declaring string for coloured text
    public static final String GREEN = "\u001B[42m";
    public static final String BLUE = "\u001B[44m";
    public static final String RED = "\u001B[41m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        System.out.println(BLUE + " WELCOME TO NATIONAL MATHEMATICS COMPETENCY EVALUATION SURVEY " + RESET + "\n" );

            System.out.println(YELLOW + "Number of school participated in this survey : " + RESET);
            Scanner howManySch = new Scanner(System.in);
            int schoolCount = howManySch.nextInt();

            String[] schoolList = new String[schoolCount];
            Scanner inputList = new Scanner(System.in);

            float[] avgList = new float[schoolCount];
            float[] stdDevList = new float[schoolCount];

            for (int i = 0; i < schoolCount; i++) {

                System.out.println("\n"+GREEN + " --- SCHOOL " + (i+1) + " DATA --- " + RESET );

                School SMK1 = new School();

                System.out.println("\n" + YELLOW + "School name : " + RESET);
                schoolList[i] = inputList.nextLine();

                SMK1.setName(schoolList[i]);
                //---------------------------------------------------------------------------------------------------
                System.out.println("\n" +YELLOW + "School address : " + RESET);

                Scanner inputStreet = new Scanner(System.in);
                System.out.println(YELLOW + "Street   : " + RESET);
                String street = inputStreet.nextLine();

                Scanner inputDistrict = new Scanner(System.in);
                System.out.println(YELLOW + "District : " + RESET);
                String district = inputDistrict.nextLine();

                Scanner inputPostcode = new Scanner(System.in);
                System.out.println(YELLOW + "Postcode : " + RESET);
                String postcode = inputPostcode.nextLine();

                Scanner inputState = new Scanner(System.in);
                System.out.println(YELLOW + "State    : " + RESET);
                String state = inputState.nextLine();

                //---------------------------------------------------------------------------------------------------
                System.out.println("\n" + YELLOW + "Principal name :" + RESET);

                Scanner inputFir = new Scanner(System.in);
                System.out.println(YELLOW + "First name   : " + RESET);
                String firstName = inputFir.nextLine();
                Scanner inputLast = new Scanner(System.in);
                System.out.println(YELLOW + "Last name    : " + RESET);
                String lastName = inputLast.nextLine();


                // OUT DISPLAY

                Address schoolAddr = new Address(street, district, postcode, state);
                schoolAddr.setStreet(street);
                schoolAddr.setDistrict(district);
                schoolAddr.setPostcode(postcode);
                schoolAddr.setState(state);

                Principal schoolPri = new Principal(firstName, lastName);
                schoolPri.setFirstname(firstName);
                schoolPri.setLastname(lastName);

                //---------------------------------------------------------------------------------------------------

                Scanner inputStudentCount = new Scanner(System.in);
                System.out.println("\n"+YELLOW + "Number of student participated (must be at least 8 students) : " + RESET);
                int studentCount = inputStudentCount.nextInt();


                Marks studentData = new Marks(studentCount);


                System.out.println("\n" + BLUE + " SCHOOL DATA " + RESET);

                studentData.calcAvg();
                studentData.calcStdDev();

                System.out.println(YELLOW + "\n" + "School name : " + RESET + schoolList[i]);
                System.out.println(YELLOW + "Address : " + RESET + schoolAddr.getStreet() + ", " + schoolAddr.getDistrict() + ", " + schoolAddr.getPostcode() + ", " + schoolAddr.getState() + ". ");
                System.out.println(YELLOW + "Principal : " + RESET + schoolPri.getFirstname() + " " + schoolPri.getLastname());
                System.out.println(YELLOW + "Average marks : " + RESET + studentData.getAverage());
                System.out.println(YELLOW + "Standard deviation : " + RESET + studentData.getStandardDev());

                avgList[i] = studentData.getAverage();
                stdDevList[i] = studentData.getStandardDev();

            }

            System.out.println("\n" + BLUE + " SCHOOL LIST " + RESET +"\n");

            for (int i = 0; i < schoolCount; i++) {
                System.out.println((i+1) + "." + schoolList[i] + " | Average Marks : " + avgList[i] + " |  Standard Deviation : " + stdDevList[i]);
            }




    }
}