public class unboxing {
    public static void main(String[] args) {
        Integer num1 = 42;
        int num2 = num1;
        System.out.println(num2);

        byte b=num1.byteValue();
        System.out.println(b);

        short s=num1.shortValue();
        System.out.println(s);

        long l=num1.longValue();
        System.out.println(1);

        float f=num1.floatValue();
        System.out.println(f);

        double d=num1.doubleValue();
        System.out.println(d);



    }
    
}
