package com.text;


import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 
import com.itextpdf.layout.Document; 
import com.itextpdf.layout.element.Paragraph;  

public class Pdf {    
   public static void main(String args[]) throws Exception {
           
      String dest = "D:/sample.pdf";       
      PdfWriter writer = new PdfWriter(dest);           
      
      PdfDocument pdf = new PdfDocument(writer);              
      
       try (Document doc = new Document(pdf)) 
       {
           String para1 = "HelloFriend";
           Paragraph p1 = new Paragraph(para1);
           doc.add(p1);
       }             
      System.out.println("Executed successfully");    
   } 
}  

