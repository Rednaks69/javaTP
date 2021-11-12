import java.util.Random;

public class TesteMinMax {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = random.ints(100, 0, 1000).toArray();
        int max1 = tab[0];
        int max2 = tab[tab.length / 2];
        int min1 = tab[0];
        int min2 = tab[tab.length / 2];

        for (int i : tab) {
            System.out.println(i);
        }

        for (int i = 0; i < (tab.length / 2) - 1; i++) {
            max1 = (tab[i] >= max1) ? tab[i] : max1;
            min1 = (tab[i] <= min1) ? tab[i] : min1;
        }
        for (int i = tab.length / 2; i < tab.length - 1; i++) {
            max2 = (tab[i] >= max2) ? tab[i] : max2;
            min2 = (tab[i] <= min2) ? tab[i] : min2;
        }
        System.out.println("le max est " + ((max1 > max2) ? max1 : max2));
        System.out.println("le min est " + ((min1 < min2) ? min1 : min2));

    }
}
