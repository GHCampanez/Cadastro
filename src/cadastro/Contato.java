/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

/**
 *
 * @author Guilherme Campanez
 */
public class Contato {
    private String nome;
    
    public Contato(){
        
    }

    public Contato(String nome) {
        this.nome = nome;    }

 
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
