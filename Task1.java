
public class Task1 {
    public static void main(String[] args) {
        int []  array = {1,5,6,6,7,88,7,9};
        int[] result = filterEvenIndexxOddVallue(array);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public  static int[] filterEvenIndexxOddVallue(int [] a){
        int count = 0;
        for (int i = 0; i < a.length; i += 2) {
            if (a[i] % 2 != 0) {
                count++;
            }
        }
        int[] b = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i += 2) {
            if (a[i] % 2 != 0) {
                b[index++] = a[i];
            }
        }

        return b;
    }
}
