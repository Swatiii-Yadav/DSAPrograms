package february5;

    public class BalancedSubsequencePartition {
        public static int countNoOfPartition(String s) {
            int n = s.length();
            int[] freq = new int[2 * n + 1];
            int count = 0, part = 0;
         freq[n] = 1;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    count += 1;
                } else {
                    count -= 1;
                }

                int index = count + n;
                if (freq[index] > 0) {
                    part += freq[index];
                }
                freq[index]++;
            }

            return part;
        }

        public static void main(String[] args) {
            String s = "010101";
            System.out.println("total : " + countNoOfPartition(s));
        }
    }


