import java.util.ArrayList;
import java.util.List;

public class DemoMovie {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("M001", "Inception", "Christopher Nolan", "Sci-Fi", 2010));

        for (Movie movie : movies) {
            movie.displayMovieDetails();
        }
    }
}
