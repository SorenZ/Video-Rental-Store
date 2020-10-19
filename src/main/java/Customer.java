import java.util.ArrayList;
import java.util.List;

public class Customer
{
    public String name;
    public List<MovieInRent> movies = new ArrayList<>();
    
    public void addMovie(Movie movie,int daysOfRent)
    {
        movies.add(new MovieInRent(movie, daysOfRent));
    }
    
    public void printInvoice()
    {
        for (MovieInRent movieInRent : this.movies) {
            System.out.println("movie name : " + movieInRent.getMovie().getName() + " :: " 
                    + "Days of rent: " + movieInRent.getDays() + " :: "
                    + "Price : " + movieInRent.calculateMoviePrice() 
            );
            
        }
        
    }
}

