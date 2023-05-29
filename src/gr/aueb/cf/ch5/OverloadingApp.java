package gr.aueb.cf.ch5;

/**
 * Method Overloading!
 */
public class OverloadingApp {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1D, 2D));
    }
    public static int add(int a, int b){
        return a + b;
    }
    //This is called signature add(int a, int b) it has to be unique
//    public static double add(int a, int b){
//        return a + b;
//    }
    //This is called method overloading (same name, different parameters,
    //so different signature)
    public static double add(int a, int b, int c){
        return a + b + c;
    }
    public static double add(double a, double b){
        return a + b;
    }
}
