public class Main {

    public static void main(String[] args) {
        int val = 26;
        do {
            System.out.print(val);
            System.out.print(" * 2 = ");
            val *= 2;
            System.out.print(val + " ");
        } while (val < 25);
        // 26 is greater than 25 still code will run once.

    }
}
