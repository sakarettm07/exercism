public class PangramChecker {
    public boolean isPangram(String sentence) {
        StringBuilder alphabet = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

        if (tooShort(sentence))
            return false;

        char[] chars = sentence.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length && alphabet.length() > 0; i++) {
            removeCharacterIfUnique(alphabet, chars[i]);
        }

        return everyCharacterUsed(alphabet) ? true : false;
    }

    private boolean everyCharacterUsed(StringBuilder alphabet) {
        return alphabet.length() == 0;
    }

    private void removeCharacterIfUnique(StringBuilder alphabet, char aChar) {
        char currentChar = aChar;
        int indexOfCurrentChar = alphabet.indexOf(String.valueOf(currentChar));

        if (indexOfCurrentChar >= 0)
            alphabet.deleteCharAt(indexOfCurrentChar);
    }

    private Boolean tooShort(String s) {
        return s.length() < 26;
    }
}
