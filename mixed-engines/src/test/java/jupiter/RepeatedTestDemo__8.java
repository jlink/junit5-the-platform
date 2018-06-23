package jupiter;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;
import static org.junit.jupiter.api.Assertions.assertFalse;


class RepeatedTestDemo__8 {

    @RepeatedTest(value = 5, name = " Execution {currentRepetition}/{totalRepetitions}")
    void customDisplayName(TestInfo testInfo) {
        assertFalse(testInfo.getDisplayName().contains("3"));

    }


}
