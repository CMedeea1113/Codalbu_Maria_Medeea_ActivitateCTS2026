package ro.ase.cts.Program;
import ro.ase.cts.Builder.*;
import ro.ase.cts.Abonament.*;
public class Program {
    public static void main(String[] args){
        MonthlyMembership m1 = MonthlyMembership.getInstance();
        MonthlyMembership m2 = MonthlyMembership.getInstance();

        final MonthlyMembership[] m3 = new MonthlyMembership[1];
        Thread t = new Thread(()->{
            m3[0] = MonthlyMembership.getInstance();});
        t.start();
        try {
            t.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(m1 == m2);
        System.out.println(m1 == m3[0]);
        System.out.println(m2 == m3[0]);

        System.out.println(System.identityHashCode(m1));
        System.out.println(System.identityHashCode(m2));
        System.out.println(System.identityHashCode(m3[0]));

        System.out.println("Plan: " + m1.getPlanName());
        System.out.println("Pret: " + m1.getPrice());


        MovieSearchingFilter filter1 =
                new MovieSearchingFilterBuilder()
                        .setTitle("Inception")
                        .setGenre("Sci-Fi")
                        .build();

        MovieSearchingFilter filter2 =
                new MovieSearchingFilterBuilder()
                        .setGenre("Drama")
                        .setRating(8.5)
                        .setDirector("Christopher Nolan")
                        .build();

        MovieSearchingFilter filter3 =
                new MovieSearchingFilterBuilder()
                        .setTitle("Interstellar")
                        .setReleaseYear(2014)
                        .setActors("Matthew McConaughey")
                        .setRating(8.7)
                        .build();

        System.out.println(filter1);
        System.out.println(filter2);
        System.out.println(filter3);


    }
}
