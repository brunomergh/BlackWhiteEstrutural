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
public class Complemento extends Cafe {
    
    protected Cafe CafeDecorator;

    public Complemento(Cafe cafe) {
        
        super(cafe.getPreco());
        this.CafeDecorator = cafe;
    }
    
    

  
    
    
    
}
