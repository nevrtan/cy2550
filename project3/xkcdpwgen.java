import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class xkcdpwgen {

  public static void main(String[] args) throws FileNotFoundException {
 

    File words = new File("/home/nev/cy25502/cy2550/project3/words.txt");

    int caps = -1;
    int symbols = -1 ;
    int wordCount = 4;
    int numbersInWords = -1;


    String output = "";

    if (args.length == 0) {
      output = createPassword(words);
    }

    if (Arrays.asList(args).contains("-h")) {
      System.out.print("   -h, --help            show this help message and exit\n" +
              "    -w WORDS, --words WORDS\n" +
              "                          include WORDS words in the password (default=4)\n" +
              "    -c CAPS, --caps CAPS  capitalize the first letter of CAPS random words\n" +
              "                          (default=0)\n" +
              "    -n NUMBERS, --numbers NUMBERS\n" +
              "                          insert NUMBERS random numbers in the password\n" +
              "                          (default=0)\n" +
              "    -s SYMBOLS, --symbols SYMBOLS\n" +
              "                          insert SYMBOLS random symbols in the password\n" +
              "                          (default=0)");
      return;
    }

    if (Arrays.asList(args).contains("-c")) {
      int position = (Arrays.asList(args).indexOf("-c"));
      String capsAsString = Arrays.asList(args).get(position + 1);
      caps = Integer.parseInt(capsAsString);
    } else {
      caps = -1;
    }

    if (Arrays.asList(args).contains("-s")) {
      int position = (Arrays.asList(args).indexOf("-s"));
      String symbolAsString = Arrays.asList(args).get(position + 1);
      symbols = Integer.parseInt(symbolAsString);
    } else {
      symbols = -1;
    }

    if (Arrays.asList(args).contains("-n")) {
      int position = (Arrays.asList(args).indexOf("-n"));
      String numberAsString = Arrays.asList(args).get(position + 1);
      numbersInWords = Integer.parseInt(numberAsString);
    } else {
      numbersInWords = -1;
    }

    if (Arrays.asList(args).contains("-w")) {
      int position = (Arrays.asList(args).indexOf("-w"));
      String wordsAsString = Arrays.asList(args).get(position + 1);
      wordCount = Integer.parseInt(wordsAsString);
    } else {
      wordCount = 4;
    }
    output = createCustomPassword(words, caps, numbersInWords, symbols, wordCount);
    System.out.print(output);
    return;



  }



  // create a password with no requirements
  // Takes an input of which words file used to make pswd
  // randomly selects 4 words and sends the out put to the main
  public static String createPassword(File words) throws FileNotFoundException {

    Scanner scanFile = new Scanner(words);

    String output = "";

    for (int i = 0; i < 4; i++) {
      int min = 1;
      int max = 90000;
      int scanMove = (int) ((Math.random() * (max - min)) + min);
      int count = 0;

      while (count < scanMove) {
        scanFile.next();
        count++;
        continue;
      }

      String nextWord = scanFile.next();
      output = output + "\n" + nextWord;


    }

    return output;

  }


  public static String createCustomPassword(File words, int caps, int numberInWords, int symbols, int wordcount) throws FileNotFoundException {
    String output = "";
    Scanner scanFile = new Scanner(words);

    for (int i= 0; i < wordcount; i++) {
      int min = 1000;
      int max = 100000;
      int scanMove = (int) ((Math.random() * (max - min)) + min);

      int count = 0;

      while (count < scanMove) {
        scanFile.next();
        count++;
        continue;
      }
      String nextWord = scanFile.next();

      if (caps > 0) {
        nextWord = nextWord.substring(0,1).toUpperCase() + nextWord.substring(1);
        caps--;
      }

      if (numberInWords > 0) {
        nextWord = Integer.toString(numberInWords) + nextWord;
        numberInWords--;
      }

      if (symbols > 0) {
        nextWord = "@" + nextWord;
        symbols--;
      }



      output = output+nextWord;
    }

    return output;

  }

}
