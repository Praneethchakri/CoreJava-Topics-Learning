package threads.concurrency;

import java.util.Arrays;

public class AlphabatReadingTask implements Runnable{
    private String alphaString;

    public AlphabatReadingTask(String alphaString) {
        this.alphaString = alphaString;
    }

    @Override
    public void run() {
        System.out.println("Reading Alphabets...");
        System.out.println(readString(alphaString));
    }
    public static char readString(String alphaString){
        char[] charArray = alphaString.toCharArray();
        char result = 0;
        for (char c:charArray) {
            result = c;
            System.out.println(result);
        }

        return result;
    }
}
