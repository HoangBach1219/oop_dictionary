import java.util.ArrayList;

public class Dictionary {
    Word word =new Word();
    public ArrayList<Word> words =  new ArrayList<Word>();

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }




    private int wordsCount = 0;

}