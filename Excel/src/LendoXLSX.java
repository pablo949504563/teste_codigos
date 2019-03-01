
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFBReader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class LendoXLSX {
  
  public static void main(String []args ){
     
      FileInputStream filePlanilha = null;
      
      try {
          File file = new File("C:\\excel\\PlanilhaDaAula.xlsx");
          filePlanilha = new FileInputStream(file);
          
          try {
              
              //cria um workbook = cria uma planilha com todas as abas
              XSSFWorkbook workbook = new XSSFWorkbook(file);
              
              //recuperamos a planilha 1 
              XSSFSheet sheet = workbook.getSheetAt(0);
              
              //retorna todas as planilhas 
              Iterator<Row>  rowIterator = sheet.iterator();
              
             //varre todas as linhas da planilha
             
             while(rowIterator.hasNext() ){
                 
                 // recebe todas as linhas da planilhas
                  Row row = rowIterator.next();
                  
                  //pegar todas as celulas da linha 
                  Iterator<Cell> cellIterator = row.iterator();
                  
                  //varrer todas as celulas da linha
                  while(cellIterator.hasNext()){
                     
                      //criar um objeto celula
                      Cell cell = cellIterator.next();
                      
                      
                      switch(cell.getCellType()){
                          
                          case Cell. :
                              
                              System.out.println(" TIPO:  " + cell.getStringCellValue());
                              break;
                          
                          
                          
                      }
                 
             }
                  
              }
              
          } catch (IOException ex) {
              Logger.getLogger(LendoXLSX.class.getName()).log(Level.SEVERE, null, ex);
          } catch (InvalidFormatException ex) {
              Logger.getLogger(LendoXLSX.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
          
          
          
          
          
      } catch (FileNotFoundException ex) {
          Logger.getLogger(LendoXLSX.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      
  }  
    
    
}
