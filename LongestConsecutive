public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        HashSet<Integer> set = new HashSet<Integer>();
        int longestConsecutive = 0;
        for (int a : A) {
            set.add(a);
        }
        
        for (int v : A) {
            int temp = 1;
            int leftV = v;
            while (set.contains(--leftV)) {
               temp++; 
               set.remove(leftV); //prevent dups
            }
            
            int rightV = v;
            while (set.contains(++rightV)) {
                temp++;
                set.remove(rightV);
            }
            
            longestConsecutive = Math.max(temp, longestConsecutive);
        }
        
        return longestConsecutive;
    }
}
