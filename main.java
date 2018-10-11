public class main {
	public static void main(String[] args) {
		// using Scanner Class 
		import java.io.File; 
		import java.util.Scanner; 
		public class ReadFromFileUsingScanner 
		{ 
		  public static void main(String[] args) throws Exception  
		  { 
		    // pass the path to the file as a parameter 
		    File file = 
		      new File("C:\\Users\\amoores\\Desktop\\test.txt"); 
		    Scanner sc = new Scanner(file); 
		  
		    while (sc.hasNextLine()) 
		      System.out.println(sc.nextLine()); 
		  } 
		} 

	        

}