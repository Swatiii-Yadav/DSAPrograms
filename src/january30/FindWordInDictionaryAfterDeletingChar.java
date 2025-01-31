package january30;

public class FindWordInDictionaryAfterDeletingChar {
    public static String findWord(String word, String[] dictionary) {
        for (int i = 0; i < word.length(); i++) {
            String res = "";
            for (int j = 0; j < word.length(); j++) {
                if (j != i) {
                    res += word.charAt(j);
                }
            }

            for (int k=0;k<dictionary.length;k++){
                if (dictionary[k].equals(res)){
                    return res;
                }
            }

        }

        return null;
    }

    public static void main(String[] args) {

        String[] dictionary ={"cat","bat","rat","at","mat"};
        String word = "cats";
        String result = findWord(word, dictionary);
        System.out.println(result);
    }
}