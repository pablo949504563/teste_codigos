
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pgdesouza
 */
public class NewClass {
 
    
   // teste de sub menu 
        
         JMenu mAbrir = new JMenu("Abrir");
		barraMenu.add(mAbrir);
 
		JMenu smArquivo = new JMenu("Arquivo");
		mAbrir.add(smArquivo);
 
		JMenuItem smiEmBranco = new JMenuItem("Em Branco");
		JMenu smiDeTemplate = new JMenu("De Template");
 
		smArquivo.add(smiEmBranco);
		smArquivo.add(smiDeTemplate);
 
		JMenuItem ssmiTemplate01 = new JMenuItem("Template 01");
		JMenuItem ssmiTemplate02 = new JMenuItem("Template 02");
		smiDeTemplate.add(ssmiTemplate01);
		smiDeTemplate.add(ssmiTemplate02);
        
        
           // fim teste de sub menu 
    
    
    
}
