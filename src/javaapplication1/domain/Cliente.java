/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.domain;

import java.util.Objects;

/**
 *
 * @author Wosley Arruda
 */
public class Cliente {
    
    private String nome;
    private Long cpf;
    private Long tel;
    private String email;
    private Integer senha;

    public Cliente(String nome, String cpf, String tel, String email, String senha) {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf);
        this.tel = Long.valueOf(tel);
        this.email = email;
        this.senha = Integer.valueOf(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

//    @Override
//    public int compareTo(Cliente cliente) {
//        return Long.compare(this.cpf, cliente.getCpf());
//    }

    
}
