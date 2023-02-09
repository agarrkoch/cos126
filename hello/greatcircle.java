public class greatcircle {
    public static void main(String[] args) {
        double xone = Math.toRadians(Double.parseDouble(args[0]));
        double yone = Math.toRadians(Double.parseDouble(args[1]));
        double xtwo = Math.toRadians(Double.parseDouble(args[2]));
        double ytwo = Math.toRadians(Double.parseDouble(args[3]));

        double distance = 60 * Math.acos(
                Math.sin(xone) * Math.sin(xtwo) + Math.cos(xone) * Math.cos(xtwo) * Math.cos(
                        yone - ytwo));
        System.out.println((distance * 180) / Math.PI);

    }
}
