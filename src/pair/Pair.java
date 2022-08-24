package pair;

public class Pair {
    private final Integer repeat;
    private final String word;

    public Pair(Integer repeat, String word) {
        this.repeat = repeat;
        this.word = word;
    }

    public Integer getRepeat() {
        return repeat;
    }

    public String getWord() {
        return word;
    }

}
