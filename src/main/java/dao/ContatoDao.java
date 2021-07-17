/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Contato;

/**
 *
 * @author gustavo
 */
public class ContatoDao extends GenericDao {
    
    public void salvar(Contato contato) {
        savePojo(contato);
    }
    
    public void atualizar(Contato contato) {
        savePojo(contato);
    }
    
    public void excluir(Contato contato) {
        removePojo(contato);
    }
    
    public List<Contato> listar() {
        String sql = "select c from Contato c";
        
        return getPureList(Contato.class, sql);
    }
    
    public Contato buscarContato(Integer idContato) {
        String sql = "select c from Contato c where c.idContato = ?1";
        
        return (Contato) getPojo(sql, idContato);
    }
    
}
