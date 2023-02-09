public class randomwalker {
    public static void main(String[] args) {
        int loops = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;

        for (int i = 0; i < loops; i++) {
            double random = Math.random();

            if (random < (double) 1 / 4) {
                x = x + 1;
            } else if (random < (double) 2 / 4) {
                x = x - 1;
            } else if (random < (double) 3 / 4) {
                y = y + 1;
            } else {
                y = y - 1;
            }

            System.out.printf("(%d,%d)", x, y);
            System.out.println();
        }
        int distance = (x * x) + (y * y);
        System.out.printf("squared distance: %d", distance);

    }
}
