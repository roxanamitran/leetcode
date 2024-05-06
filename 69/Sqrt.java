package binarySearch;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(2));

    }

    public static int mySqrt(int x) {
        int left = 1;
        int right = (int)Math.sqrt(Integer.MAX_VALUE);
        int middle = 0;

        while (left <= right) {
            middle = (left + right) / 2;

            if (middle * middle == x) {
                return middle;
            } else if (middle * middle > x){
               right = middle - 1;
            }else if (middle * middle < x) {
               left = middle + 1;
            }
        }

        return middle - 1;
    }
}
