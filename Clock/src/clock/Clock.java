
package clock;

/**
 *
 * @author pgdesouza
 */
public class Clock {
int hora;
int minuto;
int segundo;

public void setHora(int h, int m, int s){
  hora = ((h>=0 && h<24 ? h : 0));
  minuto = ((m>=0 && m<60 ? m : 0));
  segundo = ((s>=0 && s<60 ? s : 0));
 
}
  public String horario(){
      return String.format("%02d:%02d:%02d", hora, minuto,segundo);
      
  }  
    public String horario2(){
        
        return String.format("%02d:%02d:%02d %s", ((hora==0 ||hora==12 ) ? 12 : hora % 12), minuto,segundo,(hora<12 ? "AM":"PM"));
        
    }
    public static void main(String[] args) {
     Clock objeto = new Clock();
     objeto.setHora(20, 26, 10);
     System.out.print(objeto.horario());
        
        
    }
    
}
