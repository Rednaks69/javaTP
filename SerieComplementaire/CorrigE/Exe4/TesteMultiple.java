class TesteMultiple {

    // public static void multiple3T(int k) {
    // for (int i = 1; i < k; i++) {
    // System.out.println((multiple(i) != 0) ? i : "");
    // }
    // }

    public static int sum = 0;

    private static float multiple3(int a) {
        int k = a - 1;
        if (k < 3)
            System.out.print("");
        if (k == 1) {
            System.out.println("End Multiple-3");
            return 0;
        }
        if (k % 3 == 0) {
            sum += k;
            System.out.println("\t\t   " + k);
        }
        return multiple3(a - 1);
    }

    private static float multiple5(int a) {
        int k = a - 1;

        if (k < 5)
            System.out.print("");
        if (k == 1) {
            System.out.println("End Multiple-5");
            return 0;
        }
        if (k % 5 == 0) {
            sum += k;
            System.out.println("\t\t   " + k);
        }
        return multiple5(a - 1);
    }

    public static void Multiple(int n) {
        multiple3(n);
        multiple5(n);
    }

    public static void main(String[] args) {
        Multiple(100);
        System.out.println("-----------------------");
        System.out.println("sum :\t\t   " + sum);

    }

}