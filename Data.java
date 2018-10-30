import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 
import java.util.Set;
import java.util.Map.Entry; 


public class Data
{
    public static void main(String[] args) throws IOException {
    	FileReader fr = new FileReader("C:\\Users/Lakshmi/Desktop/Insight_Exam/sample.txt");
    	File tempFile = new File("C:\\Users/Lakshmi/Desktop/Insight_Exam/tempFile.txt");
        BufferedReader read = new BufferedReader(fr);
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        File f = new File("C:\\Users/Lakshmi/Desktop/Insight_Exam/sample.txt");
        Scanner sc = new Scanner(f);
        System.out.println("File taken");
String keyword="CERTIFIED";
	String var="WITHDRAWN";
        int i,b;
        String currentline;
        while((currentline = read.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentline.trim();
           
            if(currentline.contains(keyword)&& currentline.contains(var) ==false)
{
		
         	pw.print(currentline + System.getProperty("line.separator"));
}
            else 
            	continue;
        }
        writer.close(); 
        read.close(); 
}
}