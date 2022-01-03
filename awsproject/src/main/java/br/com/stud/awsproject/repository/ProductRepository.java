public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findByCode(String code);

}