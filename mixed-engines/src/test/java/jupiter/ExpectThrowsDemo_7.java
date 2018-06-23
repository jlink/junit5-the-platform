package jupiter;

import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ExpectThrowsDemo_7 {

    @Test
    void simpleExceptionTesting() {

        assertThrows(FileNotFoundException.class, () -> {
            throw new FileNotFoundException("no file :( ");
        });
    }

    @Test
    void exceptionTesting() {

        Throwable exception = assertThrows(FileNotFoundException.class, () -> {
            throw new FileNotFoundException("no file :( ");
        });
        assertEquals("no file :( ", exception.getMessage());

    }



}
