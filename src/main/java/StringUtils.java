import java.util.Arrays;

/**
 * Class responsible for methods which provide operations on Strings
 * @author Miłosz
 */
public final class StringUtils {

    private StringUtils() {}

    /**
     * Method checking whether two given Strings are anagrams.
     * Anagrams - words or phrases you spell by rearranging the letters of another word or phrase
     * @param s1 first String to compare
     * @param s2 second String to compare
     * @return if the Strings are anagrams returns true
     */
    public static boolean isAnagram(String s1, String s2) {

        if(s1.length() < 3 || s1.length() > 5000 || s1.length() != s2.length()) {
            // no point of checking if s2 length is in given range since it has to be equal to s1 length which is already checked
            throw new IllegalArgumentException("Strings containing wrong amount of characters");
        }

        char[] s1Chars = s1.toLowerCase().toCharArray();
        char[] s2Chars = s2.toLowerCase().toCharArray();

        // sorting into ascending order
        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);

        return Arrays.equals(s1Chars, s2Chars);
    }
}
