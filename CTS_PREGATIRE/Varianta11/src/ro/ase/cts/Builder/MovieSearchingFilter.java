package ro.ase.cts.Builder;

public class MovieSearchingFilter implements AbstractSearchingFilter{
    private final String Title;
    private final String Genre;
    private final Integer ReleaseYear;
    private final String Actors;
    private final Double Rating;
    private final String Director;

    public MovieSearchingFilter(String title, String genre, Integer releaseYear, String actors, Double rating, String director) {
        this.Title = title;
        this.Genre = genre;
        this.ReleaseYear = releaseYear;
        this.Actors = actors;
        this.Rating = rating;
        this.Director = director;
    }

    @Override
    public String getTitle() {
        return Title;
    }

    @Override
    public String getGenre() {
        return Genre;
    }

    @Override
    public Integer getReleaseYear() {
        return ReleaseYear;
    }

    @Override
    public String getActors() {
        return Actors;
    }

    @Override
    public Double getRating() {
        return Rating;
    }

    @Override
    public String getDirector() {
        return Director;
    }

    @Override
    public String toString() {
        return "MovieSearchingFilter{" +
                "title='" + Title + '\'' +
                ", genre='" + Genre + '\'' +
                ", releaseYear=" + ReleaseYear +
                ", actors='" + Actors + '\'' +
                ", rating=" + Rating +
                ", director='" + Director + '\'' +
                '}';
    }
}
