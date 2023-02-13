package programms;

public class ReversingWordsOfSentence {


	  public static void main(String[] args) {
	    String sentence = "This is a sentence";
	    String reversed = "";
	    String[] words = sentence.split("\\s+");
	    for (int i = words.length - 1; i >= 0; i--) 
	    {
	      reversed += words[i] + " ";
	    }
	    System.out.println(reversed);
	  }
	}