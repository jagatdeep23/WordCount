/**
 * Created by jc277043 on 9/03/15.
 */
public class App {
    public static void main(String[]args){
        System.out.println("manual unit test for word counter");
        System.out.println("simple.text has 5 words");
        String text= TextReader.load("simple.txt");
        int numberOfWords= countWords(text);
        System.out.println("Actual number of words"+numberOfWords);

        System.out.println("manual unit test for word counter");
        System.out.println("multiLine.text has 9 words");
        text= TextReader.load("multiLine");
         numberOfWords= countWords(text);
        System.out.println("Actual number of words"+numberOfWords);

    }
    public static int countWords(String text) {
        int tally = 0;
        for (char i : text.toCharArray()) {

            if (i == ' '|| i=='\n')
            {
                tally++;
        }
    }
return tally+1;
    }


}

