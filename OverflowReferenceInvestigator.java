public class OverflowReferenceInvestigator {
    public static void main(String[] args) {
        byte number = 127;
        number++;
        System.out.println("Overflow: " + number);

        String a = new String("Hello");
        String b = new String("Hello");
        String c = "Hello";

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // == compares object references, while equals() compares text values.
        int[] first = {10, 20, 30};
        int[] second = first;

        second[0] = 99;
        System.out.println("First array: " + first[0]);
        System.out.println("Second array: " + second[0]);
    }
}
