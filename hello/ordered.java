public class ordered {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        int mid = Math.max(Math.min(x, y), Math.min(Math.max(x, y), z));

        System.out.println(Integer.toString(y).equals(Integer.toString(mid)));
    }
}
