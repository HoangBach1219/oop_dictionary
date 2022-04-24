public class Word {
    private String word_target;
    private String word_explain;

    Word (String inpTarget, String inpExplain){
        word_target = inpTarget;
        word_explain = inpExplain;
    }
    Word(Word word) {
        word_target = word.word_target;
        word_explain = word.word_explain;
    }

    public Word() {

    }

    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String wordTarget) {
        this.word_target = wordTarget;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String wordExplain) {
        this.word_explain = wordExplain;
    }

    public String getFull_word() {
        return word_target + " ------ " + word_explain;
    }

}