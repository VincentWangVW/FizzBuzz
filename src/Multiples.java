public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                j++;
            }
            i++;
        }
        System.out.println(j);
    }
}
