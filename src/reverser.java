public class reverser {

    public static String spinWords(String sentence) {
        String reversedWord = "";
        boolean newWord = true;
        int counter = 0;

        for (int i = 0; i<sentence.length();i++) {
                int startIndex = i;
                int endIndex = 0;
                counter++;
                if (counter >= 5) {
                    reversedWord += reverse(sentence.substring(startIndex, endIndex));
                } else {
                    reversedWord += sentence.substring(startIndex, startIndex+1);
                }

                if (sentence.substring(i).equals(" ")) {
                    endIndex = i;
                    reversedWord += " ";
                    counter = 0;
                    newWord = false;
                }
        }
        return reversedWord;
    }

    public static void main(String[] args) {
        System.out.println(spinWords("hi there fellow"));
    }

    public static String reverse (String sentence) {
        int length = (sentence.length());
        String[] a = new String[length];
        String reversedWord = "";
        for (int i = 0;i<(sentence.length()/2);i++) {
            String temp = sentence.substring(i,i+1);
            a[i] = sentence.substring(length-1 , length);
            a[length-1] = temp;
            length--;
        }
        for (int i = 0;i<sentence.length();i++) {
            reversedWord += a[i];
        }
        return reversedWord;
    }

}
