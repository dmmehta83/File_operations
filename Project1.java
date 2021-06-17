import java.io.File;
import java.io.IOException;
import java.util.*; 
public class FileOperations {
	
	public static void main(String a[]){
		
		
		do
		{
		Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter 1 for Add a File :");
			System.out.println("Enter 2 for Delete a File :");
			System.out.println("Enter 3 for Search a File :");
			System.out.println("Enter 4 for display Files in Ascending order :");
			System.out.println("Enter 5 for stop the program");
			System.out.println("Enter your choice::");
			int choice = sc.nextInt();
			 
		switch(choice)
		{
		case 1:
			Scanner sc1=new Scanner(System.in);			
			System.out.println("Enter File name to add:");
			String fn=sc1.nextLine();
			File stockFile = new File("f:/stu_certi/"+fn+".txt");
			try {
				boolean flag= stockFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			break;
		case 2:
			Scanner sc2=new Scanner(System.in);			
			System.out.println("Enter File name to delete:");
			fn=sc2.nextLine();
			File file1 = new File("f:/stu_certi/"+fn);
			file1.delete();
			
			break;
		case 3:
			Scanner sc3=new Scanner(System.in);		
			System.out.println("Enter File name to search:");
			fn=sc3.nextLine();
			File dir = new File("f:/stu_certi/");
		      String[] files = dir.list();
		      
		      if (files == null) {
		         System.out.println("Directory does not contains any file");
		      } else {
		         for (int i = 0; i < files.length; i++) {
		            
		        	 String filename = files[i];
		        	 if(fn.equals(filename))
		        	 {
		        	 System.out.println(filename);
		          }
		      }
		      }
			
			
			break;
		case 4:
			
			File file = new File("f:/stu_certi/");
			
			String[] fileList = file.list();
			for(String name:fileList){
					System.out.println(name);
				}
			int size = fileList.length;  
			   
			for(int i = 0; i<size-1; i++)   
			{  
			for (int j = i+1; j<fileList.length; j++)   
			{  
				if(fileList[i].compareTo(fileList[j])>0)   
			{  
			String temp = fileList[i];  
			fileList[i] = fileList[j];  
			fileList[j] = temp;  
			}  
			}  
			}  
				for(String name:fileList){
				System.out.println(name);
			}
		
			
			break;
		case 5:
			System.out.println("Closing Program");
			System.exit(0);
			break;

		default:
				System.out.println("Incorrect choice");
			
		}
		}while(true);

		
	}
	}


		
		
		
			
		
				
		
		
		
		
		
	

import java.io.File;
import java.io.IOException;
import java.util.*; 
public class FileOperations {
	
	public static void main(String a[]){
		
		
		do
		{
		Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter 1 for Add a File :");
			System.out.println("Enter 2 for Delete a File :");
			System.out.println("Enter 3 for Search a File :");
			System.out.println("Enter 4 for display Files in Ascending order :");
			System.out.println("Enter 5 for stop the program");
			System.out.println("Enter your choice::");
			int choice = sc.nextInt();
			 
		switch(choice)
		{
		case 1:
			Scanner sc1=new Scanner(System.in);			
			System.out.println("Enter File name to add:");
			String fn=sc1.nextLine();
			File stockFile = new File("f:/stu_certi/"+fn+".txt");
			try {
				boolean flag= stockFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			break;
		case 2:
			Scanner sc2=new Scanner(System.in);			
			System.out.println("Enter File name to delete:");
			fn=sc2.nextLine();
			File file1 = new File("f:/stu_certi/"+fn);
			file1.delete();
			
			break;
		case 3:
			Scanner sc3=new Scanner(System.in);		
			System.out.println("Enter File name to search:");
			fn=sc3.nextLine();
			File dir = new File("f:/stu_certi/");
		      String[] files = dir.list();
		      
		      if (files == null) {
		         System.out.println("Directory does not contains any file");
		      } else {
		         for (int i = 0; i < files.length; i++) {
		            
		        	 String filename = files[i];
		        	 if(fn.equals(filename))
		        	 {
		        	 System.out.println(filename);
		          }
		      }
		      }
			
			
			break;
		case 4:
			
			File file = new File("f:/stu_certi/");
			
			String[] fileList = file.list();
			for(String name:fileList){
					System.out.println(name);
				}
			int size = fileList.length;  
			   
			for(int i = 0; i<size-1; i++)   
			{  
			for (int j = i+1; j<fileList.length; j++)   
			{  
				if(fileList[i].compareTo(fileList[j])>0)   
			{  
			String temp = fileList[i];  
			fileList[i] = fileList[j];  
			fileList[j] = temp;  
			}  
			}  
			}  
				for(String name:fileList){
				System.out.println(name);
			}
		
			
			break;
		case 5:
			System.out.println("Closing Program");
			System.exit(0);
			break;

		default:
				System.out.println("Incorrect choice");
			
		}
		}while(true);

		
	}
	}


		
		
		
			
		
				
		
		
		
		
		
	

