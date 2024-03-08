public class DefValue {
    static boolean b = true;
    static int i = 42;
    static double d = 3.14;
    static long l = 1234567890L;
    static char c = 'A';
    static float f = 2.718f;
    static byte y = 127;

    public static void main(String args[]) {
        DefValue val = new DefValue();
        System.out.println("Default boolean : " + val.b);
        System.out.println("Default integer : " + val.i);
        System.out.println("Default double :" + val.d);
        System.out.println("Default long : " + val.l);
        System.out.println("Default float : " + val.f);
        System.out.println("Default byte : " + val.y);
        System.out.println("Default char : " + val.c);
    }
}
