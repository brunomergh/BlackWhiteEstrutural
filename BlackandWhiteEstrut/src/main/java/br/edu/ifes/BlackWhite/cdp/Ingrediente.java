/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class Ingrediente implements Cloneable{
    
    private String tipo;
    protected int qtd;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public int getQtd() {
        return qtd;
    }	

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
      @Override
    public Ingrediente clone() throws CloneNotSupportedException {
        return (Ingrediente) super.clone(); 
    }

    @Override
    public String toString() {
        return super.toString() +"|"+ tipo;
    }
	
}
