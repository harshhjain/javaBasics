public class Main {

    public static void main(String[] args) {
        double[] leftValue = {10.0d, 25.0d, 90.0d, 120.0d};
        double[] rightValue = {20.0d, 40.0d, 160.0d, 180.0d};
        char[] codes = {'d', 'a', 's', 'm'};
        double[] results = new double[codes.length];

        for(int i=0; i<codes.length;i++){
            switch (codes[i]){
                case 'a':
                    results[i] = leftValue[i] + rightValue[i];
                    System.out.println("Result " + i + " = " + results[i]);
                    break;
                case 's':
                    results[i] = leftValue[i] - rightValue[i];
                    System.out.println("Result " + i + " = " + results[i]);
                    break;
                case 'm':
                    results[i] = leftValue[i] * rightValue[i];
                    System.out.println("Result " + i + " = " + results[i]);
                    break;
                case 'd':
                    results[i] = rightValue[i] != 0 ? leftValue[i] / rightValue[i] : 0.0d;
                    System.out.println("Result " + i + " = " + results[i]);
                    break;
                default:
                    System.out.println("Invalid Codes: " + codes[i]);
                    results[i] = 0.0d;
                    break;

            }
        }

        System.out.println("results");


    }
}
