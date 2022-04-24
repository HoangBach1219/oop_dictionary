import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {
    public void insertFromCommandline(ArrayList<Word> dictionary) {
        Word newWord = new Word();
        Scanner sc = new Scanner(System.in);

        newWord.setWord_target(sc.nextLine());
        newWord.setWord_explain(sc.nextLine());
        dictionary.add(newWord);
    }

    public void shortInsert(ArrayList<Word> dictionary, Word newWord) {
        dictionary.add(newWord);
    }

    public void insertFromFile(ArrayList<Word> dictionary) throws IOException {
        Scanner sc = new Scanner(Paths.get("D:\\UETLearningDocs\\Dictionary\\TestDictionary\\src\\Dictionary.txt"));
        while (sc.hasNextLine()) {
            Word newWord = new Word();
            String full = sc.nextLine();
            String[] fullWord = full.split("\t");
            newWord.setWord_target(fullWord[0]);
            newWord.setWord_explain(fullWord[1]);
            shortInsert(dictionary, newWord);
        }
    }

    public void dictionaryLookUp(ArrayList<Word> dictionary) {
        String word = new String();
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        for (Word looker : dictionary) {
            if (looker.getWord_target().equals(word)) {
                System.out.println(looker.getFull_word());
            }
        }
    }

    public void deleteWord(final ArrayList<Word> dictionary) {
        String word = new String();
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        for (Word looker : dictionary) {
            if (looker.getWord_target().equals(word)){
                dictionary.remove(looker);
                break;
            }
            break;
        }
    }
}