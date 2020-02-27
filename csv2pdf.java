import java.io.FileOutputStream;
import java.io.*;
import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
public class csv2pdf {  
        public static void main(String[] args) throws Exception{
                
               
                String inputCSVFile = "csv_to_pdf.csv";
                CSVReader reader = new CSVReader(new FileReader(inputCSVFile));
                
                String [] nextLine;           
                int lnNum = 0; 
               
                Document my_pdf_data = new Document();
                PdfWriter.getInstance(my_pdf_data, new FileOutputStream("converted_PDF_File.pdf"));
                my_pdf_data.open();            
                PdfPTable my_first_table = new PdfPTable(2);
                PdfPCell table_cell;
                
                while ((nextLine = reader.readNext()) != null) {
                        lnNum++;        
                        table_cell=new PdfPCell(new Phrase(nextLine[0]));
                        my_first_table.addCell(table_cell);
                        table_cell=new PdfPCell(new Phrase(nextLine[1]));
                        my_first_table.addCell(table_cell);                                             
                }
                
                my_pdf_data.add(my_first_table);                       
                my_pdf_data.close();            
        }
}
