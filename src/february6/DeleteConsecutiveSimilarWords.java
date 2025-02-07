package february6;

public class DeleteConsecutiveSimilarWords {
        private static String findWords(String[] words, int i, String end) {

            if (i>= words.length) {
                return "";
            }

            String curr= words[i];
            if (curr.equals(end)) {
                return findWords(words, i + 1, end);
            }
            return curr +" "+ findWords(words, i + 1, curr);
        }

        public static String removeSame(String str) {
            if (str == null || str.isEmpty()) {
                return str;
            }

            String[] word = str.split(" ");
            String result = findWords(word, 0, "");

            return result.trim();
        }

        public static void main(String[] args) {
            String str = "hello hello world world world";
            System.out.println("output: " + removeSame(str));
        }
    }



