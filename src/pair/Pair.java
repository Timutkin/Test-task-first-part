package pair;

/**
 * The type Pair.
 */
public class Pair {
    private final Integer repeat;
    private final String word;

    /**
     * Instantiates a new Pair.
     *
     * @param repeat the repeat
     * @param word   the word
     */
    public Pair(Integer repeat, String word) {
        this.repeat = repeat;
        this.word = word;
    }

    /**
     * Gets repeat.
     *
     * @return the repeat
     */
    public Integer getRepeat() {
        return repeat;
    }

    /**
     * Gets word.
     *
     * @return the word
     */
    public String getWord() {
        return word;
    }

}
