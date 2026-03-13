package ro.ase.cts.Builder;

public class MovieSearchingFilterBuilder {
    private String title;
    private String genre;
    private Integer releaseYear;
    private String actors;
    private Double rating;
    private String director;

    public MovieSearchingFilterBuilder setTitle (String title) {
        this.title = title;
        return this;
    }

    public MovieSearchingFilterBuilder setGenre (String genre) {
        this.genre = genre;
        return this;
    }

    public MovieSearchingFilterBuilder setReleaseYear (Integer releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    public MovieSearchingFilterBuilder setActors (String actors) {
        this.actors = actors;
        return this;
    }

    public MovieSearchingFilterBuilder setRating (Double rating) {
        this.rating = rating;
        return this;
    }


    public MovieSearchingFilterBuilder setDirector (String director) {
        this.director = director;
        return this;
    }
    
    public MovieSearchingFilter build(){
        return new MovieSearchingFilter(title,genre,releaseYear,actors,rating,director);
    }
    
}
