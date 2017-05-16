package hw.vpex.students;

/**
 * Vadim Voronov
 * Created: 16-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Phone {
    public static void main(String[] args) {
        String[] numbers = new String[]{
                "   8910 297-63-52",
                " +7910 297-63-52",
                "we   8910 297-63-52",
                "we%@#+7910 297-63-52",
                "%@#8910 297-63-52",
                "8910 297-63-52",
                "+7910 297-63-52"
        };


        String regexp = "(^\\D*8)|(^\\D*\\+7)";
        for (String number : numbers) {
            System.out.println(number.replaceAll(regexp,""));
        }

    }
}
