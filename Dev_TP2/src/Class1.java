import java.io.*;
import java.util.Scanner; 
public class Class1 {

	public static void main(String[] args) {
		System.out.println("entrez le nombre des objets que vous voulez sérialiser");
		Scanner sc = new Scanner(System.in);
		 final int n =sc.nextInt();
		
			Employee [] emp = new Employee[n];
			 try
		      {
		         FileOutputStream fileOut =new FileOutputStream("emp.dat");
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			 for(int a=0;a<n;a++) {
				 emp[a] = new Employee();
				 System.out.println("entrer le nom");
				 sc.nextLine();
				 emp[a].name= sc.nextLine();
				 System.out.println("entrer l'adress ");
				 emp[a].address= sc.nextLine();
				 System.out.println("entrer SSN ");
				 emp[a].SSN= sc.nextInt();
				 System.out.println("entrer le numéro  ");
				 emp[a].number= sc.nextInt();
				 System.out.println(emp[a].name + "; " + emp[a].address + "; " + emp[a].SSN + "; " + emp[a].number);
				 
				
			         out.writeObject(emp[a]);
			         System.out.println("données serialisées sauvegardées dans <emp.dat>");
			 }
			 out.close();
	         fileOut.close();
	         }catch(IOException i)
			      {
			          i.printStackTrace();
			      }
			 }
		
		     
		     
		     
	      
	     

		
	}


