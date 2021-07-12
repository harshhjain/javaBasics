public class Main {

    public static void main(String[] args) {

        float[] varr = {10.0f, 25.0f, 90.0f, 120.0f};
        float summ = 0.0f;

        for (float currentVal : varr)
            summ += currentVal;
        System.out.println(summ);

    }
}
