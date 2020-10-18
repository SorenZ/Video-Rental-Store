

public class Movie
{
    public Movie(String name, MovieType movieType, int bonus, double price)
    {
        this.name = name;
        this.movieType = movieType;
        this.bonus = bonus;
        this.price = price;
    }

    private String name;
    private MovieType movieType;
    private int bonus;
    private double price;

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }
}

