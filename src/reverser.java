public class reverser {

    public String spinWords(String sentence) {
        boolean newWord = true;
        int counter = 0;
        for (int i = 0; i<sentence.length();i++) {
            while (newWord) {
                int startIndex = i;
                counter++;



                if (sentence.substring(i).equals(" ")) {
                    counter = 0;
                    newWord = false;
                    int endIndex = i;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(reverse("fellow"));
    }

    public static StringBuilder reverse (String sentence) {
        int length = (sentence.length());
        String[] a = new String[length];
        StringBuilder reversedWord = new StringBuilder();
        for (int i = 0;i<(sentence.length()/2);i++) {
            String temp = sentence.substring(i,i+1);
            a[i] = sentence.substring(length-1 , length);
            a[length-1] = temp;
            length--;
        }
        for (int i = 0;i<sentence.length();i++) {
            reversedWord.append(a[i]);
        }
        return reversedWord;
    }

}
