public class randomwalker3d {
    public static void main(String[] args) {
        int steps = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        int z = 0;
        int origin = 0;

        for (int j = 0; j < trials; j++) {
            for (int i = 0; i < steps; i++) {
                double random = Math.random();

                if (random < (double) 1 / 6) {
                    x = x + 1;
                } else if (random < (double) 2 / 6) {
                    x = x - 1;
                } else if (random < (double) 3 / 6) {
                    y = y + 1;
                } else if (random < (double) 4 / 6) {
                    y = y - 1;
                } else if (random < (double) 5 / 6) {
                    z = z + 1;
                } else {
                    z = z - 1;
                }

                if (x == 0 && y == 0 && z == 0) {
                    origin = origin + 1;
                    break;
                }

            }
            x = 0;
            y = 0;
            z = 0;
        }
        System.out.printf("%d of %d trials resulted in a return to origin by %d steps", origin, trials, steps);

    }
}
