public class conflict {
    public static void main(String[] args) {
        String[] event1 = {"16:53","19:00"};
        String[] event2 = {"10:33","18:15"};
        System.out.println(haveConflict(event1,event2));

    }
    public static boolean haveConflict(String[] event1, String[] event2) {
        int c1 = event2[0].compareTo(event1[1]);
        System.out.println(c1);
        int c2 = event2[1].compareTo(event1[0]);
        System.out.println(c2);
        return (c1 <= 0) && (c2 >= 0);
    }
}
