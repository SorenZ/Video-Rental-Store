

public class Movie
{
    public Movie(String name, MovieType movieType, int bonus)
    {
        this.name = name;
        this.movieType = movieType;
        this.bonus = bonus;
    }

    private String name;
    private MovieType movieType;
    private int bonus;

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public MovieType getMovieType() {
        return movieType;
    }
}

