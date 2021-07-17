public class Main {

    public static void main(String[] args) {

        double result = calculateInterest (100d, 5d, 10);
        System.out.println("Interest = " + result);
    }
    static double calculateInterest(double p, double r, double t){
        double interest = p * r * t;
        return interest;
    }

}
