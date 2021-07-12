public class Main {

    public static void main(String[] args) {

        System.out.println("Before Calling Method");
        dummyMethod();
        //using a simple method
        System.out.println("After Calling Method");
    }
        static void dummyMethod(){
            System.out.println("Inside Method");
            System.out.println("Still - Inside Method");
        }
}
