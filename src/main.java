import java.io.File; 
import java.util.Scanner;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.util.ArrayList;
import java.io.FileNotFoundException; 
import java.io.PrintStream; 

public class main {	
  public static void main(String[] args) throws Exception  { 
		// using Scanner Class  
	  // pass the path to the file as a parameter 
    File filePath = new File("/Users" + File.separator + "Andy"+ File.separator + "Desktop" + File.separator+ "test.txt"); 
    Scanner inFile = new Scanner(filePath).useDelimiter("/t"); 
    String cardNum="Card Number";
    String enrollStore="Enroll Store";
    String enrollDate="Enroll Date";
    String Amount="Amount";
    String guestActivity="Last Guest Acivity Date";
  
    
    ArrayList<String> temps = new ArrayList<String>();
    String token1 = "";
    int[][] matrix;
    // while loop
    while (inFile.hasNext()) {
      // find next line
    	for (int i = 0; i < matrix.length; i++) {
    	     for (int j = 0; j < matrix[i].length; j++) {
    	             bw.write(matrix[i][j] + ",");
    	     }
    	     bw.newLine();
    	 }
      token1 = inFile.next();
      temps.add(token1);
      
    }
    
  /*  
   for (int i = 0;i<1;i++) {
	   
   }
   
    while (sc.hasNextLine()) 
    	
    	System.out.println(sc.nextLine()); 
    
 
    sc = new Scanner(file); 
    
  while (sc.hasNextLine()) 
      System.out.println(sc.nextLine()); 
    */
  
 inFile.close();
 
 for (int i = 0; i < matrix.length; i++) {
     for (int j = 0; j < matrix[i].length; j++) {
             bw.write(matrix[i][j] + ",");
     }
     bw.newLine();
 }

 for (String s : temps) {
   System.out.println(s);
 }
  } 


}

