/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.util;

import br.edu.ifes.BlackWhite.cdp.*;

/**
 *
 * @author 20131bsi0033
 */
public class FabricaCafeNormal extends FabricaCafeAbstrata{

    @Override
    public Cafe criarCafe() {
        return new Cafe(2.0,"normal");
    }
    
    public FabricaCafeNormal(){
        
        this.soluvel = new Ingrediente();
        soluvel.setTipo("Soluvel");
        soluvel.setQtd(50);
        this.leite = new Ingrediente();
        leite.setTipo("Leite");
        leite.setQtd(100);
        
    }

}
