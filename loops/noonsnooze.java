public class noonsnooze {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        int minutes = input % 60;
        int hours = (input / 60) + 12;

        if (hours > 12) {
            if (hours % 12 == 0) {
                hours = 12;
            } else {
                hours = hours % 12;
            }
        }

        String PorA = "";

        if (((input / 60) / 12) % 2 == 0) {
            PorA = "pm";
        } else {
            PorA = "am";
        }

        String string_hours = Integer.toString(hours);
        String string_minutes = Integer.toString(minutes);

        if (string_minutes.length() == 1) {
            string_minutes = "0" + string_minutes;
        }

        System.out.print(string_hours + ":" + string_minutes + PorA);
    }
}
