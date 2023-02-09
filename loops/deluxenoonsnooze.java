public class deluxenoonsnooze {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]) + 1440;

        String[] PorA = new String[]{"pm", "am"};
        while (input > 1440) {
            input = input - 1440;
        }
        int PorAi = input / 720;

        while (input > 720) {
            input = input - 720;
        }

        int hours = (input / 60) + 12;
        while (hours > 12) {
            hours = hours - 12;
        }

        int minutes = input % 60;
        String s_minutes = String.format("%02d", minutes);

        System.out.printf("%d:%s%s", hours, s_minutes, PorA[PorAi]);
    }
}
