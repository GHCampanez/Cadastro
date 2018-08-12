/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.util.ArrayList;

/**
 *
 * @author Guilherme Campanez
 */
public class ListaDeContatos {
    
    public static void main(String[] args) {
        JanelaCadastro jc = new JanelaCadastro();
        jc.setVisible(true);
        
        ArrayList<Contato> contatos = new ArrayList<>();
        Contato contato = new Contato("Guilherme");
        contatos.add(contato);            
        
       for(Contato c : contatos){
           System.out.println(c);
       }
       
    }        
    
}
