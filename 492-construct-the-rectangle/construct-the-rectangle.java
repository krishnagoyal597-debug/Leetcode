class Solution {
    public int[] constructRectangle(int area) {
    for (int width = (int)Math.sqrt(area); width >= 1; width--) {
        if (area % width == 0) {
            int length = area / width;
            return new int[]{length, width};
        }
    }
    return new int[]{area, 1};
    }
}