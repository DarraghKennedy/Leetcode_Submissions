class Solution {
    public int hammingDistance(int x, int y) {
        String numx = Integer.toBinaryString(x);
        String numy = Integer.toBinaryString(y);

        int maxLength = Math.max(numx.length(), numy.length());
        numx = String.format("%" + maxLength + "s", numx).replace(' ', '0');
        numy = String.format("%" + maxLength + "s", numy).replace(' ', '0');

        int count = 0;

        for(int i = 0; i < numx.length() && i < numy.length();i++) {
            if(numx.charAt(i) != numy.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}