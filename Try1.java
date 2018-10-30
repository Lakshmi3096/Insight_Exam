
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.sql.Date; 
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 
import java.util.Set;
import java.util.Map.Entry; 


public class Try1
{
    public static void main(String[] args) throws IOException {
    	FileReader fr = new FileReader("C:\\Users/Lakshmi/Desktop/Insight_Exam/sample.txt");
    	File tempFile1 = new File("C:\\Users/Lakshmi/Desktop/Insight_Exam/tempFile1.txt");
        BufferedReader read = new BufferedReader(fr);
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile1));
PrintWriter pw = new PrintWriter(new FileWriter(tempFile1));
        File f = new File("C:\\Users/Lakshmi/Desktop/Insight_Exam/sample.txt");
        Scanner sc = new Scanner(f);
        System.out.println("File taken");
HashMap<String, Integer> map = new HashMap<>();
PrintStream ps = new PrintStream("C:\\Users/Lakshmi/Desktop/Insight_Exam/tempFile1.txt");
List<String> temps=new ArrayList<String>();
	 int i,count=0,count1=-1,o,l;
    while ((i=fr.read()) != -1)
      
    while (sc.hasNextLine()) 
    {
   
    String line = sc.nextLine();
    String[] words = line.split(";");
    
     
    
     temps.add(words[50]);
 if (map.containsKey(words[50])) {
                count = map.get(words[50]);
                map.put(words[50], count + 1);
            } else {
                map.put(words[50], 1);
            }
      }
int sum=0;
Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
// after sorting to find top 10 we can use l = list.subList(0,10);
	for (float a : map.values()) {
    sum += a;

}
System.out.println(sum);

        for(Map.Entry<String, Integer> entry:list){
           ps.println(entry.getKey()+"   "+entry.getValue()+"   "+((entry.getValue())*(100/sum))+"%");

           
}


 

} 

    
}
   



	
