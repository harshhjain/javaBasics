import java.time.Instant;

public class Main {

    public static void main(String[] args) {

        //static void checkRelationship(Instant otherInstant){
            Instant nowInstant = Instant.now();

            if(otherInstant.compareTo(nowInstant) > 0)
                System.out.println("Instand is in the future");
            else if(otherInstand.compareTo(nowInstant) < 0)
                System.out.println("Instant is in the past");
            else
                System.out.println("Instat is now");
        }
    }
}
