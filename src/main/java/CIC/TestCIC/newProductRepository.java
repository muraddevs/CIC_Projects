package CIC.TestCIC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface newProductRepository extends JpaRepository<newProduct, Long> {
    // Spring Data JPA provides basic CRUD operations by default

    // You can define custom query methods here if needed
    // For example, findByFirstName, findByLastName, etc.
}
