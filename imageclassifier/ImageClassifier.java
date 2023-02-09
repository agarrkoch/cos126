import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class ImageClassifier {

    // Creates a feature vector (1D array) from the given picture.
    public static double[] extractFeatures(Picture picture) {
        int x = picture.width();
        int y = picture.height();
        double[] vector = new double[x * y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Color color1 = picture.get(i, j);
                double v = color1.getRed();
                vector[i * x + j] = v;
            }
        }
        return vector;
    }

    private static int numLines(String txt) throws Exception {
        int num = 0;
        File f = new File(txt);
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            s.nextLine();
            num = num + 1;
        }

        return num - 2;

    }

    // See below.
    public static void main(String[] args) throws Exception {

        //training data
        File training = new File(args[0]);
        Scanner sc = new Scanner(training);

        int m = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int n = width * height;
        int pic_l;
        double[] vector;

        MultiPerceptron mp = new MultiPerceptron(m, n);

        while (sc.hasNext()) {
            String pic_s = sc.next();
            pic_l = sc.nextInt();
            Picture pic_p = new Picture(pic_s);
            vector = extractFeatures(pic_p);
            mp.trainMulti(vector, pic_l);
        }

        //testing data
        File testing = new File(args[1]);
        sc = new Scanner(testing);

        double error = 0.0;
        int lines = numLines(args[1]);
        m = sc.nextInt();
        width = sc.nextInt();
        height = sc.nextInt();

        while (sc.hasNext()) {
            String pic_s = sc.next();
            System.out.print(pic_s);
            pic_l = sc.nextInt();
            Picture pic_p = new Picture(pic_s);
            vector = extractFeatures(pic_p);
            int predict = mp.predictMulti(vector);
            System.out.printf("%s, label = %d, predict = %d", pic_s, pic_l, predict);
            System.out.println();

            if (predict != pic_l) {
                error = error + 1;
            }
        }
        System.out.printf("Test error rate = %f", error / lines);

    }
}

