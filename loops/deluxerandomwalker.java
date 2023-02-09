public class deluxerandomwalker {
    public static void main(String[] args) {
        int steps = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        //double avg = 0;
        int origin = 0;

        for (int j = 0; j < trials; j++) {
            for (int i = 0; i < steps; i++) {
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

                if (x == 0 && y == 0) {
                    origin = origin + 1;
                    break;
                }

            }
            //int distance = (x * x) + (y * y);

            //if (j == 0) {
            //    avg = distance;
            //} else {
            //    avg = (avg + distance) / 2;
            //}

            x = 0;
            y = 0;

        }
        //System.out.printf("mean squared distance: %f", avg);
        System.out.printf("%d of %d trials resulted in a return to origin by %d steps", origin, trials, steps);

    }
}
