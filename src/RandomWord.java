import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double probability;
        int totalWords = 0;
        String selectedWord = "";

        while (!StdIn.isEmpty()) {
            totalWords++;
            probability = 1.0/totalWords;

            String nextWord = StdIn.readString();

            if(StdRandom.bernoulli(probability)) {
                selectedWord = nextWord;
            }
        }

        StdOut.println(selectedWord);
    }
}
