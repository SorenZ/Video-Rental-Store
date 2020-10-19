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

    public double calculateMoviePrice()
    {
        switch (this.movie.getMovieType()) {
            case regular:
                if(days > 2) {
                    return (days - 2) * 1.5 + 2;
                }
                else {
                    return 2;
                }
            case newRelease:
                return 3 * days;
            case kids:
                if(days > 3) {
                    return (days - 3) * 1.5 + 1.5;
                }
                else {
                    return 1.5;
                }
            default:
                throw new IllegalStateException("Unexpected value: " + this.movie.getMovieType());
        }
    }
}
