package getSizeOfFilesinDirectoryinCSV.git;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


public class Demo {
	private static String demo="filesize";
	private static List<String> Al= new ArrayList<String>();
	public static void demodemo(List<String> extraFiles) throws FileNotFoundException, UnsupportedEncodingException
	{
		PrintWriter writer = new PrintWriter("Your Path to write files"+".txt", "UTF-8");
	  	   for (String object: extraFiles)
	  	   {
	  		   writer.println(object);
	  		   System.out.println(object+" inside writer");
	        }
	  	   writer.println("dhuiuhdeiudw hdoihqd iu");	  	 
	  	   writer.close();
	       	
	}

	 static void legend(String f) throws IOException, InterruptedException
	{
		File s=new File(f);
         File listFile[] = s.listFiles();
         Thread.sleep(10);
         if (listFile != null) {
             for (int i=0; i<listFile.length; i++) {
                 if (listFile[i].isDirectory()) {                	 
                	 System.out.println("Directory  -"+listFile[i].getName()+"----------------"+listFile[i].getAbsolutePath());                  
                	 legend(listFile[i].getAbsolutePath());              	
                 } else {  
                	
                	 File file = new File(listFile[i].getAbsolutePath());
                	 double size = file.length();
             			size=size/(1024*1024);
                	 Al.add(size+","+listFile[i].getName()+","+listFile[i].getAbsolutePath());
 					         
                 }
             }
         }
         return;
	}
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		String str="Your dirctory where you want to get details";  
		Demo.legend(str);
		demodemo(Al);
		
		for(int i=0;i<Al.size();i++)
		{
		System.out.println("demo"+Al.get(i));
		}
		
	}
	
}
