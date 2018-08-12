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
public class Dados {
    ArrayList<Contato> contatos = new ArrayList<>();
    
    public void cadastraContato(Contato contato){
        contatos.add(contato);
    }
    public String numContatos(){
        return contatos.size()+ "";
    }
    
}
