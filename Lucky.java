
class LuckyNumbers {
    public static int[] getLuckyNumbers(int n) {
        int a[] = new int[n], lucky[] = {};
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        int offset = 1;
        while (++offset <= a.length) {
            lucky = new int[a.length - (a.length / offset)];
            for (int i = 0, c = 0; i < a.length; i++) {
                if ((i + 1) % offset != 0) {// check if the element is to be copied
                    lucky[c++] = a[i]; // copy the lucky element in the array lucky
                }
            }
            a = lucky;
        }
        return lucky;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(getLuckyNumbers(20))); // 1 3 7
    }
}
