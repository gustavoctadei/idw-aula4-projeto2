/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import dao.ContatoDao;
import java.util.Date;
import java.util.List;
import model.Contato;

/**
 *
 * @author gustavo
 */
public class InsereContato {
    
    public static void main(String[] args) {
        ContatoDao contatoDao = new ContatoDao();
        
        Contato contato = new Contato();
        contato.setNome("Gustavo Tadei");
        contato.setTelefone("(69) 9 9999-0000");
        contato.setEmail("gustavo@email.com");
        contato.setDataCadastro(new Date());
        contato.setObservacao("Cliente novo");
        contato.setCpf("99999999999");
        
        contatoDao.salvar(contato);
        
        ////////////////////////////////////////////////////////////////////////
        
        contato = new Contato();
        contato.setNome("João da Silva");
        contato.setTelefone("(69) 9 9999-9999");
        contato.setEmail("joao@gmail.com");
        contato.setDataCadastro(new Date(System.currentTimeMillis()));
        contato.setObservacao("Novo cliente");
        contato.setCpf("11111111111");
        
        contatoDao.salvar(contato);
        
        ////////////////////////////////////////////////////////////////////////
        
        List<Contato> listaContato = contatoDao.listar();
        System.out.println("Lista de Contatos cadastrados:");
        
        for (Contato c : listaContato) {
            System.out.println(c);
        }
    }
    
}
