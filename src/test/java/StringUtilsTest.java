import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void two_Strings_are_anagrams() {
        String s1 = "brag";
        String s2 = "grab";

        Assertions.assertTrue(StringUtils.isAnagram(s1, s2));
    }

    @Test
    void two_Strings_are_not_anagrams() {
        String s1 = "fish";
        String s2 = "tige";

        Assertions.assertFalse(StringUtils.isAnagram(s1, s2));
    }

    @Test
    void given_String_argument_too_short() {
        String s1 = "ca";
        String s2 = "ac";

        Assertions.assertThrows(IllegalArgumentException.class, () -> StringUtils.isAnagram(s1, s2));
    }

    @Test
    void given_String_argument_too_long() {
        String s1 = "a".repeat(5001);
        String s2 = "a".repeat(5001);

        Assertions.assertThrows(IllegalArgumentException.class, () -> StringUtils.isAnagram(s1, s2));
    }

    @Test
    void given_Strings_not_equal_length() {
        String s1 = "abcd";
        String s2 = "abcdef";

        Assertions.assertThrows(IllegalArgumentException.class, () -> StringUtils.isAnagram(s1, s2));
    }

}
