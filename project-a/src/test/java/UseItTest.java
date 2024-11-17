import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UseItTest {
    @Test
    void isEmpty() {
        assertTrue(OtherStringUtil.isNullOrEmpty(""));
    }
}
