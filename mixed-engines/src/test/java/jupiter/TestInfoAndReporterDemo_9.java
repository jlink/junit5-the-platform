package jupiter;


import java.time.*;

import org.junit.jupiter.api.*;


class TestInfoAndReporterDemo_9 {

    @Test
    @DisplayName("test with info")
    void aTest(TestInfo info) {
        System.out.println(info);
    }

    @Test
    @DisplayName("test with reporter")
    void anotherTest(TestReporter reporter) {
    	reporter.publishEntry("today", LocalDate.now().toString());
    }


}
