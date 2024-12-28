package december27;

public class BoatsToSavePeople {
        public int numOfBoats(int[] people, int limit) {
            for (int i = 0; i < people.length - 1; i++) {
                for (int j = i + 1; j < people.length; j++) {
                    if (people[i] > people[j]) {
                        int temp = people[i];
                        people[i] = people[j];
                        people[j] = temp;
                    }
                }
            }

            int left = 0, right = people.length - 1;
            int count = 0;

            while (left <= right) {
                if (people[left] + people[right] <= limit) {
                    
                    left++;
                    right--;
                } else {

                    right--;
                }
                count++;
            }

            return count;
        }
    }
