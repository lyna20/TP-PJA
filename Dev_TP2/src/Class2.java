import java.io.*;
import java.util.ArrayList;
public class Class2 {

	public static void main(String[] args) {
		
	
		
		
		
		try
		{
		FileInputStream fileIn = new FileInputStream("emp.dat");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		RandomAccessFile raf = new RandomAccessFile("empdirect.dat" , "rw");
		while (in.available()>=0){
			try {
			Employee e = (Employee) in.readObject();
			String emp[]= new String[4];
			emp[0]=e.name;
			emp[1]=e.address;
			emp[2]=String.valueOf(e.SSN);
			emp[3]=String.valueOf(e.number);
			
			raf.writeUTF(emp[0]);
			raf.writeUTF(emp[1]);
			raf.writeUTF(emp[2]);
			raf.writeUTF(emp[3]);
			
		}catch(IOException i)
		{
		
			break;
		}
		}
			in.close();
			fileIn.close();
			System.out.println("Le contenu du fichier <emp.dat> est copié dans <empdirecrt>");
		}catch(IOException i)
		{
		i.printStackTrace();
		return;
		}
		catch(ClassNotFoundException c)
		{
		
		c.printStackTrace();
		return;
		}
	
			
		}		
	
	
}


