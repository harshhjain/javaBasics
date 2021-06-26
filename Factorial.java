public class Main {

    public static void main(String[] args) {
        int value = 4;
        int factorial = 1;
        while (value > 1){
            factorial *= value;
            value--;
        }
        System.out.println("Factorial is " + factorial);
    }
}
