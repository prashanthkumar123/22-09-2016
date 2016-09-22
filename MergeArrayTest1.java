import java.io.*;
import java.util.*;
public class MergeArrayTest1
{
public static void main(String args[])
{
String array1[]={"A","b","c","d"};
String array2[]={"e","f"};
//list interface
List<String> list=new ArrayList<String>
(Arrays.asList(array1));
list.addAll(Arrays.asList(array2));
Object [] array3=list.toArray();
System.out.println(Arrays.toString(array3));

}
} 
