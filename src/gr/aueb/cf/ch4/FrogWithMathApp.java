package gr.aueb.cf.ch4;

public class FrogWithMathApp {
    public static void main(String[] args) {
        int jumps = 0;
        int x = 10;
        int y = 85;
        int jmp = 30;

        jumps = (int) Math.ceil((y - x) / (float) jmp);
    }
}
