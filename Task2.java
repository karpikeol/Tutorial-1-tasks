public class Task2 {
    public static void main(String[] args) {

    }

    public static int findDominant(int[] a){
        int count = 0;
        for (int i = 0; i < a.length; i += 2) {
            if (a[i] % 2 != 0) {
                count++;
            }
        }
        int[] b = new int[count];

        int dominate = 0;
        for (int i = 0; i < a.length; i += 2) {
            if (a[i] == dominate) {
                dominate = 
            }
        }

        return 1;
    }
}
