import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		
		System.out.println("entrer le numéro de l'employé");
		Scanner sc = new Scanner(System.in);
		  int n =sc.nextInt();
		  boolean a =true;
		try {
			RandomAccessFile raf = new RandomAccessFile("empdirect.dat" , "r");
	        raf.seek(0);
            
	        while (a) {
	        	String emp[]= new String[4];		
				emp[0]=raf.readUTF();
				emp[1]=raf.readUTF();
				emp[2]=raf.readUTF();
				emp[3]=raf.readUTF();
	           if(Integer.parseInt(emp[3])== n){
			System.out.println("NOM " + emp[0] );
			System.out.println ("Adress "+ emp[1] );
			 a=false;
			}
	        	
	        }
	        	raf.close();
		} catch (Exception e) {
			
			System.out.println ("l'employé n'existe pas");
			}
		
		
		
	
		
			
			
			
			
			
			
		
	
 
        
		 
	}
}

