public class javaclass {
    public static void main(String[] args) {
       float[][] values=new float[3][];
       System.out.println(values.length); 
       System.out.println(values[0]);
       System.out.println(values[1]);
       System.out.println(values[2]);

       values[0 ]= new float[4];
       values[1] = new float [3];
       values[2] = new float [7];
       System.out.println(values[2][5]);
       

    }
}
