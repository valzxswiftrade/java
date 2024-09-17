import java.io.FileInputStream;

public class exception {
public static void main(String[] args) {
    try(FileInputStream fis=new FileInputStream("C:\\Users\\ADDIS\\Desktop\\javaClass\\write.txt")){
        byte buff1[]=new byte[150];
        fis.read(buff1,0,150);
        String bufferstString=new String (buff1);
        System.out.println(bufferstString);
    }
        catch(Exception e){
            System.out.println("exception occoured:::"+e.getMessage());
            e.printStackTrace();
        }
    }
   
    }
    
    

    

