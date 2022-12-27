import java.io.*;
import java.util.Scanner;
import java.util.Random; 

public class IDGENERATOR
{
    private String id;
	public static int number; 
    //public int rand_int;
    public IDGENERATOR(int year, int month) {
        try {
            char aChar='\0';
            FileReader fr=new FileReader("num.txt");   //Creation of File Reader object
            BufferedReader br=new BufferedReader(fr);  //Creation of BufferedReader object
            int c = 0;
            while((c = br.read()) != -1) {
                aChar = (char) c;  
            }
            number=(int) aChar; 
            fr.close();
			
			// Random rand = new Random();
			// int rand_int = rand.nextInt(1000);
            //System.out.println("After reading num: "+number);
			
            id=year+"-"+month+"-"+number;
			number++;
            // //System.out.println("After incrementation: "+number);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("Error writing num to num.txt file.");
            e.printStackTrace();
        }
    }
    public static int num()
    {
        return number;
    }
    public String ID()
    {
        return id;
    }
}
