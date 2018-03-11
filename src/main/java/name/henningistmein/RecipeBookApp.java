package name.henningistmein;

import name.henningistmein.data.Category;
import name.henningistmein.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipeBookApp implements CommandLineRunner {

    @Autowired
    private CategoryRepository repository;

    @Override
    public void run(String... args) throws Exception {
        this.repository.deleteAll();

        // save a couple of customers
        this.repository.save(new Category("Alice", 1));
        this.repository.save(new Category("Bob", 2));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Category customer : this.repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(this.repository.findByName("Alice"));
    }

    public static void main(String[] args) {
        SpringApplication.run(RecipeBookApp.class, args);
    }

}