public class Main {

    public static void main(String[] args) {
        float[] var = new float[3];
        var[0] = 10.0f;
        var[1] = 20.0f;
        var[2] = 50.0f;

        // float[] var = {10.0f, 20.0f, 30.0f};

        float sum = 0.0f;

        for (int i=0;i < var.length;i++) sum += var[i];
        System.out.println("sum = " + sum);
        
    }
}
