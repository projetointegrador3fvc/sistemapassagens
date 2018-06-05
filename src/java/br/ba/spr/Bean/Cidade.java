/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.spr.Bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "cidadeBean")
@SessionScoped
public class Cidade {
   private String nomeCidade;
    //idCidade
    private String uf;

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    public void CadastroMensagem() {
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Cidade cadastrada com sucesso") );
        
    }
    public void ExcluirMensagem() {
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Cidade excluida com sucesso") );
        
    }
    
    
}
