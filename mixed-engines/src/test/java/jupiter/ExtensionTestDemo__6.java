package jupiter;

import jupiter.mockito.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class ExtensionTestDemo__6 {


    @BeforeEach
    void setup(@Mock List<String> list) {
        Mockito.when(list.get(0)).thenReturn("Hallo Mock!");
    }


    @Test
    void aTest(@Mock List<String> list) {
        String first = list.get(0);
        System.out.println("first = " + first);

        assertEquals(first, "Hallo Mock!");
    }

}
