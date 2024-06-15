/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javaapplication1.domain.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Wosley Arruda
 */
public class ClienteMapDAO implements IClienteDAO {
    
    private Map<Long, Cliente> map;
    
    public ClienteMapDAO() {
        map = new TreeMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }
        
        map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = map.get(cpf);
        if (clienteCadastrado != null) {
            map.remove(clienteCadastrado.getCpf());
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setCpf(cliente.getCpf());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setEmail(cliente.getEmail());
            clienteCadastrado.setSenha(cliente.getSenha());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }
    
}

