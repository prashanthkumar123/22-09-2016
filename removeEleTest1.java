import java.io.*;
import java.util.*;
public class removeEleTest1
{
public static void main(String args[])
{
//String[] array={"one","two","three"};

ArrayList<String> array1=new ArrayList<String>();

//array1.clear();

array1.add(new String("ramu"));
array1.add(new String("raju"));
array1.remove(1);

System.out.println(array1);
}
}
