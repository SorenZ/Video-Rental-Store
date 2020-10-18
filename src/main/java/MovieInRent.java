public class MovieInRent
{
    private Movie movie;
    private int days;

    public MovieInRent(Movie movie, int days) {
        this.movie = movie;
        this.days = days;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDays() {
        return days;
    }
}
