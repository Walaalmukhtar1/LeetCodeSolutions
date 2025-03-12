class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int counter = 0;

        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1) {
                counter +=1;
            }
        }
        return counter;
    }
}