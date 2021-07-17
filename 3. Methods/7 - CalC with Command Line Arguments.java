public class Main {
    public static void main(String[] args) {

        double[] leftValue = {10.0d, 25.0d, 90.0d, 120.0d};
        double[] rightValue = {20.0d, 40.0d, 160.0d, 180.0d};
        char[] codes = {'d', 'a', 's', 'm'};
        double[] results = new double[codes.length];

        if (args.length == 0) {
            for (int i = 0; i < codes.length; i++) {
                results[i] = execute(codes[i], leftValue[i], rightValue[i]);
            }
            System.out.println("\r\nOutSide the method now");
            for (double currentResult : results) {
                System.out.println(currentResult);
            }
        } else if (args.length == 3)
            handlesCommandLine(args);
        else
            System.out.println("Please provide operation code and two numeric values");


    }

    private static void handlesCommandLine(String[] args) {
        char codes = args[0].charAt(0);
        double leftValue = Double.parseDouble(args[1]);
        double rightValue = Double.parseDouble(args[2]);
        double result = execute(codes, leftValue, rightValue);
        System.out.println(result);


    }

    static double execute(char codes, double leftValue, double rightValue) {
        double result;
        switch (codes) {
            case 'a':
                result = leftValue + rightValue;
                System.out.println("Result " + codes + " = " + result);
                break;
            case 's':
                result = leftValue - rightValue;
                System.out.println("Result " + codes + " = " + result);
                break;
            case 'm':
                result = leftValue * rightValue;
                System.out.println("Result " + codes + " = " + result);
                break;
            case 'd':
                result = rightValue != 0 ? leftValue / rightValue : 0.0d;
                System.out.println("Result " + codes + " = " + result);
                break;
            default:
                System.out.println("Invalid Codes: " + codes);
                result = 0.0d;
                break;
        }
        return result;
    }

}
/*
How to Run? 

Go to Command Line
Go to path <.....yourProject/out/ProjectName/> with cd command
Run
java com.prject.Main

Run 
java com.harsh.demo.Main a 20 30

Run 
java com.harsh.demo.Main a 20
//You will get error in this case: Please provide operation code and two numeric values

*/
