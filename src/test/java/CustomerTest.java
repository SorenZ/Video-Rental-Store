import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerTest {

    private List<Movie> movies = new ArrayList<Movie>();
    
    public CustomerTest()
    {
         movies.add(new Movie("Godfather",MovieType.regular, 1));
         movies.add(new Movie("Lord of the Rings",MovieType.kids, 1));
    }
    
    @Test
    public void addMovieForCustomer()
    {
        var customer = new Customer();
        customer.addMovie(movies.get(0), 4);
        
        customer.printInvoice();
    }
}
