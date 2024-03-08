class TestConversions {
    public static void main(String[] args) {
    double d = 2.12345D;
    float f = 150.50F;
    long l = 15000L;
    int i = 55;
    char c = 20;
    short s = 1000;
    byte b = 126;

    System.out.println();
    System.out.println("Implicit Widening conversions: ");
    System.out.println("-------------------------------");
    System.out.println("byte to short: \t -> "+ (s=b));
    System.out.println("short to int: \t -> "+ (i=s));
    System.out.println("int to long: \t -> "+ (l=i));
    System.out.println("long to float: \t -> "+ (f=l));
    System.out.println("float to double: \t -> "+ (d=f));
    System.out.println();
    System.out.println("Explicit Widening conversions: ");
    System.out.println("-------------------------------");
    System.out.println("Cast byte to char: \t -> "+ (char)b);
    System.out.println("Cast short to char: \t -> "+ (char)s);
    
    d = 150.234256421235489645;
    System.out.println();
    System.out.println("Explicit Narrowing conversions: ");
    System.out.println("--------------------------------");
    System.out.println("double to float: -> "+ (f = (float)d));
    System.out.println("float to long: -> "+ (l = (long)f));
    System.out.println("long to int: -> "+ (i = (int)l));
    System.out.println("int to short: -> "+ (s = (short)i));
    System.out.println("short to byte: -> "+ (b = (byte)s));
    }
}