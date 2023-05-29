package gr.aueb.cf.ch2;

public class IntPrintApp {
    public static void main(String[] args) {
        int i = 12;
// Ctrl + / Makes comment the selected code
        System.out.print(i);
        System.out.println(i);
        System.out.printf("%d", i);

        System.out.print("Result = " + i);
        System.out.println("Result = " + i);
        System.out.printf("Result = %d\n" , i); // It is better to use %n as new line because in cases we actually write to file it will not mess up OS default command for it
        // We can add numbers before d in %d like this: %02d will display 0012 -> Investigate
        System.out.printf("%,02d", i);
    }
}
