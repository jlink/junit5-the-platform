package jupiter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("HTTP tests for REST product service")
class DisplayNameDemo__1 {

    @Test
    @DisplayName("GET 'http://localhost:8080/products/4711' user: Bob")
    void getProduct() {
        // fetch a product resource via GET for user bob
    }

    @Test
    @DisplayName("POST 'http://localhost:8080/products/' user: Alice")
    void addProduct() {
        // add a product resource via POST for user Alice
    }




}
