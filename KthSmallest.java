public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        // Arrays.sort(A);
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(B, Collections.reverseOrder());
        
        for (int i = 0; i < A.length; i++) {
            if (maxHeap.size() < B) {
                maxHeap.add(A[i]);
            } else if (maxHeap.peek() > A[i]) {
                maxHeap.poll();
                maxHeap.add(A[i]);
            }
        }
        return maxHeap.peek();
    }
}