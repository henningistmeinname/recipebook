package name.henningistmein.repositories;

import name.henningistmein.data.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {

    Category findByName(String name);

   // List<Category> findByLastName(String lastName);

}