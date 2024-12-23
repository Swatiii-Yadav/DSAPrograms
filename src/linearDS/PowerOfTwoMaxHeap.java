package linearDS;



import java.util.ArrayList;
import java.util.List;

    public class PowerOfTwoMaxHeap {
        private final int branchFactorExponent; // Exponent to determine the number of children per node (2^branchFactorExponent)
        private final int childrenCount; // Actual number of children per node (2^branchFactorExponent)
        private final List<Integer> heap; // The underlying list to store heap elements

        // Constructor
        public PowerOfTwoMaxHeap(int branchFactorExponent) {
            if (branchFactorExponent < 0) {
                throw new IllegalArgumentException("branchFactorExponent must be non-negative");
            }
            this.branchFactorExponent = branchFactorExponent;
            this.childrenCount = (int) Math.pow(2, branchFactorExponent);
            this.heap = new ArrayList<>();
        }

        // Insert a new element into the heap
        public void insert(int value) {
            heap.add(value); // Add value to the end
            siftUp(heap.size() - 1); // Restore heap property
        }

        // Pop the maximum element from the heap
        public int popMax() {
            if (heap.isEmpty()) {
                throw new IllegalStateException("Heap is empty");
            }
            int max = heap.get(0);
            int lastValue = heap.remove(heap.size() - 1); // Remove the last element
            if (!heap.isEmpty()) {
                heap.set(0, lastValue); // Move the last element to the root
                siftDown(0); // Restore heap property
            }
            return max;
        }

        // Helper method to restore heap property during insert (sifting up)
        private void siftUp(int index) {
            int parentIndex = getParentIndex(index);
            while (index > 0 && heap.get(index) > heap.get(parentIndex)) {
                swap(index, parentIndex); // Swap current with its parent
                index = parentIndex;
                parentIndex = getParentIndex(index);
            }
        }

        // Helper method to restore heap property during popMax (sifting down)
        private void siftDown(int index) {
            while (true) {
                int maxIndex = index;
                for (int i = 1; i <= childrenCount; i++) {
                    int childIndex = getChildIndex(index, i);
                    if (childIndex < heap.size() && heap.get(childIndex) > heap.get(maxIndex)) {
                        maxIndex = childIndex;
                    }
                }
                if (maxIndex == index) {
                    break; // Heap property is satisfied
                }
                swap(index, maxIndex); // Swap current with the largest child
                index = maxIndex;
            }
        }

        // Get the index of the parent of the current node
        private int getParentIndex(int childIndex) {
            return (childIndex - 1) / childrenCount;
        }

        // Get the index of the ith child of the current node
        private int getChildIndex(int parentIndex, int childPosition) {
            return parentIndex * childrenCount + childPosition;
        }

        // Swap two elements in the heap
        private void swap(int i, int j) {
            int temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }

        // Utility: Print the heap (for debugging)
        public void printHeap() {
            System.out.println(heap);
        }

        // Main method for testing
        public static void main(String[] args) {
            // Test with branchFactorExponent = 1 (Binary Heap)
            PowerOfTwoMaxHeap binaryHeap = new PowerOfTwoMaxHeap(1);
            binaryHeap.insert(10);
            binaryHeap.insert(20);
            binaryHeap.insert(5);
            binaryHeap.insert(30);
            binaryHeap.printHeap(); // [30, 20, 5, 10]
            System.out.println(binaryHeap.popMax()); // 30
            binaryHeap.printHeap(); // [20, 10, 5]

            // Test with branchFactorExponent = 2 (Quaternary Heap)
            PowerOfTwoMaxHeap quaternaryHeap = new PowerOfTwoMaxHeap(2);
            quaternaryHeap.insert(10);
            quaternaryHeap.insert(20);
            quaternaryHeap.insert(5);
            quaternaryHeap.insert(30);
            quaternaryHeap.insert(25);
            quaternaryHeap.insert(35);
            quaternaryHeap.insert(40);
            quaternaryHeap.printHeap(); // [40, 30, 35, 10, 25, 5, 20]
            System.out.println(quaternaryHeap.popMax()); // 40
            quaternaryHeap.printHeap(); // [35, 30, 20, 10, 25, 5]
        }
    }


