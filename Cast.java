public class Cast {
    public static void main(String[] args) {
        //Wide
//        int myInt = 9;
//        double myDouble = myInt; // Automatic casting: int to double
//        double d = 5.2236;
//
//        System.out.println(myInt);      // Outputs 9
//        System.out.println(myDouble);   // Outputs 9.0


        // Narrow
        double myDouble = 130.78d;
        int myInt = (byte) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9

    }
}
