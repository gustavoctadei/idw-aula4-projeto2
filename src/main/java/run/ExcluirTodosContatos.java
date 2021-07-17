/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import dao.ContatoDao;
import java.util.List;
import model.Contato;

/**
 *
 * @author gustavo
 */
public class ExcluirTodosContatos {
    
    public static void main(String[] args) {
        ContatoDao contatoDao = new ContatoDao();
        
        List<Contato> listaContato = contatoDao.listar();
        
        for (Contato c : listaContato) {
            contatoDao.removePojo(c);
        }
    }
    
}
