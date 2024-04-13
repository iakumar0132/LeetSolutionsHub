class Solution {
    private void getLeftBound(char[] matrix, int[] leftBound, int[] height, int left) {
        for (int i = 0; i < height.length; i++) {
            if (matrix[i] == '1') {
                height[i]++;
                leftBound[i] = Math.max(leftBound[i], left);
            } else {
                height[i] = 0;
                leftBound[i] = 0;
                left = i + 1;
            }
        }
    }

    private void getRightBound(char[] matrix, int[] rightBound, int right) {
        for (int i = rightBound.length - 1; i >= 0; i--) {
            if (matrix[i] == '1') {
                rightBound[i] = Math.min(rightBound[i], right);
            } else {
                rightBound[i] = right;
                right = i;
            }
        }
    }

    private int getMaximumArea(int[] height, int[] leftBound, int[] rightBound, int area) {
        for (int i = 0; i < height.length; i++) {
            int width = rightBound[i] - leftBound[i];
            area = Math.max(area, height[i] * width);
        }
        return area;
    }

    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }


        int[] leftBound = new int[matrix[0].length];
        int[] rightBound = new int[matrix[0].length];
        int[] height = new int[matrix[0].length];

        Arrays.fill(rightBound, matrix[0].length);
        int area = 0;
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[0].length;

            getLeftBound(matrix[i], leftBound, height, left);
            getRightBound(matrix[i], rightBound, right);

            area = getMaximumArea(height, leftBound, rightBound, area);
        }
        return area;
    }
}