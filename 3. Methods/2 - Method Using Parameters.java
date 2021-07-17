public class Main {

    public static void main(String[] args) {
        showSum(1.1f, 2.2f, 3);
    }

    static void showSum(float a, float b, int count){
        float sum= a+b;
        for(int i = 0; i < count; i++)
            System.out.println(sum);
    }
}
