
import java.util.Scanner;
import java.util.Random;

/* creates the conversation */

class Conversation {

  /* defines the words to be changed and the canned responses */

  static String[] intial = new String[] {"I", "I'm", "me", "am", "you", "your", "yours", "you're", "yourself", "my", "mine", "myself"};
  static String[] replace = new String[] {"you", "you're", "you", "are", "I", "my", "mine", "myself", "I'm", "your", "yours", "yourself"};
  static String[] responses = new String[] {"That's interesting.", "Oh really?", "I see", "Mmm-hm.", "Tell me more."};

  public static void main(String[] arguments) {
    int rounds = 0;
    String sentence = "";
    String response = "";
    String[] transcript;
    
    /* gets the input from the user */

    Scanner input = new Scanner(System.in);

    /* runs through the conversation based on how many rounds the user wants, then prints the transcript */

    System.out.println("Let's have a conversation! How many rounds would you like?");
    rounds = input.nextInt();
    transcript = new String[2*rounds+1];
    transcript[0] = new String("What would you like to talk about?");
    System.out.println("What would you like to talk about?");
    sentence = input.nextLine();

    /* runs through the transcript */

    for (int 1 = 0; i < rounds; i++) {
      sentence = input.nextLine();
      response = reply(sentence);
      transcript[2*i+1] = sentence;
      transcript[2*i+2] = response;
      System.out.println(response);
    }
      System.out.println("\nTranscript:");
      for (int i = 0; i<2*rounds+1; i++){
        System.out.println(transcript[i]);
      }
    }
    public static String reply(String sentence) {
      String[] splitSentence = sentence.split(" ");
      String responseSentence = "";
      Random random = new Random();
      int xResponse = 0;
      boolean oneReplaced = false;
      boolean allReplaced = false;
    }
  }
}
