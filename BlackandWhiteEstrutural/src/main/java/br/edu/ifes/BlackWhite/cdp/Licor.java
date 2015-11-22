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
public class Licor extends Complemento{

    public Licor(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double getPreco(){
        return CafeDecorator.getPreco() + 2.5;
    }
    
}
