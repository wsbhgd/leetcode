package leetcode.array;

/**
 * leetcode 1160
 * @author mncool
 */
public class CountCharacters {

    public static void main(String[] args) {
        String[] words = {"hello", "world", "leetcode"};
        String chars = "welldonehoneyr";
        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        if (words.length == 0 || chars.length() == 0) {
            return 0;
        }
        int[] charArray = revertToArray(chars);
        for (String word : words) {
            int[] wordArray = revertToArray(word);
            boolean canSpell = true;
            for (int i = 0; i < wordArray.length; i++) {
                if (wordArray[i] > charArray[i]) {
                    canSpell = false;
                    break;
                }
            }
            if (canSpell) {
                count += word.length();
            }
        }
        return count;
    }

    public static int[] revertToArray(String chars) {
        char[] charArray = chars.toCharArray();
        int[] charIntegerArray = new int[26];
        for (int i = 0; i < charArray.length; i++) {
            int index = charArray[i] - 'a';
            charIntegerArray[index]++;
        }
        return charIntegerArray;
    }
}
