package com.text;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  

public class Csv 
{  
public static void main(String[] args)   
{  
String line = "";  
String splitBy = ",";  
try   
{  
 
BufferedReader br = new BufferedReader(new FileReader("D:\\Emp.csv")); 
br.readLine();
while ((line = br.readLine()) != null)     
{  
String[] employee = line.split(splitBy);      
System.out.println("First Name = " + employee[0] + ", Last Name = " + employee[1] + ", Designation = " + employee[2] + ", Contact = " + employee[3] + ", Salary = " + employee[4] + "");
}  
}  
catch (IOException e)   
{  
}  
}
}