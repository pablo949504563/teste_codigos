
package clock;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TarefaRepetida {
    
    public void executar(){
        
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\pgdesouza\\Documents\\java selenium\\browsers\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        try{WebDriver driver = new FirefoxDriver();
            
        }catch(Exception e){
            System.out.println();
            
        }
        
        
    }
    
    
    public static void main(String []args){
        
         Toolkit tk = Toolkit.getDefaultToolkit();
             tk.beep();
        Timer timer = new Timer();
        
        final long SEGUNDOS =  (1000 * 360000);
       
        
        
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
             System.out.println(new Date());
         
            }
        };
        timer.scheduleAtFixedRate(tarefa, 0, SEGUNDOS);
    }
}
