import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryCommandline {
    public void showAllWords(ArrayList<Word> words) {
        System.out.println("=====================");
        int i = 1;
        for (Word showUpWord : words) {
            System.out.println(i + ")  " + showUpWord.getFull_word());
            i++;
        }
        System.out.println("=====================");
    }

    public void dictionaryBasic(ArrayList<Word> words) {
        DictionaryManagement manager = new DictionaryManagement();
        showAllWords(words);
    }
    public void dictionaryAdvance(ArrayList<Word> dictionary){
        DictionaryManagement manager = new DictionaryManagement();
        DictionaryCommandline commander = new DictionaryCommandline();
        manager.insertFromCommandline(dictionary);
        commander.showAllWords(dictionary);
        manager.dictionaryLookUp(dictionary);
    }
    public void dictionarySearcher(ArrayList<Word> dictionary){

    }

    public static void main(String[] args) throws IOException {
        ArrayList<Word> myDictionary = new ArrayList<Word>();
        DictionaryManagement manage = new DictionaryManagement();
        //String engWord = "";
        //String vieExplain = "";

        Scanner sc = new Scanner(System.in);
        DictionaryCommandline command = new DictionaryCommandline();
        boolean cont = true;
        int opt = -1;
        int j = 0;
        while (j == 0) {
            System.out.println("============ TỪ ĐIỂN ANH VIỆT ============");
            System.out.println(" 1. Add new word");
            System.out.println(" 2. Print out full dictionary");
            System.out.println(" 3. Add new word from a file");
            System.out.println(" 4. Lookup word");
            System.out.println(" 5. Delete word");
            System.out.println(" 0. Escape commandline");
            do {
                try {
                    System.out.println("Choose your option");
                    opt = Integer.parseInt(sc.nextLine());
                    cont = false;
                    if (opt < 0 || opt > 5) {
                        System.out.println("ALERT: Out of choice, please re-enter your option!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    cont = true;
                }
            }
            while (cont);
            switch (opt) {
                case 1: {
                    manage.insertFromCommandline(myDictionary);
                    break;
                }
                case 2: {
                    command.showAllWords(myDictionary);
                    System.out.println("\n\n\n");
                    break;
                }
                case 3: {
                    manage.insertFromFile(myDictionary);
                    break;
                }
                case 4: {
                    manage.dictionaryLookUp(myDictionary);
                    break;
                }
                case 5: {
                    manage.deleteWord(myDictionary);
                    break;
                }
                case 0: {
                    j = 1;
                    break;
                }
                default:
                    break;
            }
        }
    }
}