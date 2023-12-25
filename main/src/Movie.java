import java.util.Scanner;

class Movie {
    private String movieID;
    private String title;
    private String director;
    private String genre;
    private int releaseYear;

    public Movie(String movieID, String title, String director, String genre, int releaseYear) {
        this.movieID = movieID;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void displayMovieDetails() {
        System.out.println("Movie ID: " + movieID);
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
    }
}
