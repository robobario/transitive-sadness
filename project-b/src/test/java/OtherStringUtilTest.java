import com.google.common.base.Strings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OtherStringUtilTest {

    @Test
    void isEmpty() {
        assertTrue(OtherStringUtil.isNullOrEmpty(""));
    }

    @Test
    void isNull() {
        assertTrue(OtherStringUtil.isNullOrEmpty(null));
    }

    @Test
    void isNonEmpty() {
        assertFalse(OtherStringUtil.isNullOrEmpty("full"));
    }

    @Test
    void artbitraryGuavaUsage() {
        assertFalse(OtherStringUtil.isNullOrEmpty(
                Strings.padEnd("abc", 10, 'd')));
    }
}
