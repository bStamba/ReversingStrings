import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Reverse {

    public String reverseVowels(String s) {

        Set<String> vowelList = new HashSet<>();
        char[] charArr = s.toCharArray();
        int beginIndex = 0;
        int endIndex = s.length() - 1;

        //Add our vowels to our set.
        vowelList.addAll(Arrays.asList(new String[] {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"}));


        while (beginIndex < endIndex) {
            //Loop from the begin index towards the end until we find that our vowel string
            //contains our current character at our begin index.
            while (beginIndex < endIndex && !vowelList.contains(String.valueOf(charArr[beginIndex]))){
                beginIndex++;
            }

            //Loop from the end index towards the beginning until we find that our vowel string
            //contains our current character at end index.
            while (beginIndex < endIndex && !vowelList.contains(String.valueOf(charArr[endIndex]))) {
                endIndex--;
            }

            //Swap our vowels at our beginIndex and endIndex.
            char temp = charArr[beginIndex];
            charArr[beginIndex] = charArr[endIndex];
            charArr[endIndex] = temp;

            beginIndex++;
            endIndex--;
        }

        String result = new String(charArr);
        return result;
    }
}
