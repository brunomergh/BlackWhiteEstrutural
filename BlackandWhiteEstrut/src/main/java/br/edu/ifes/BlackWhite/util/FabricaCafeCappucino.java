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
public class FabricaCafeCappucino extends FabricaCafeAbstrata {
    
    
    public Cafe criarCafe() {
        
        return new Cafe(5.0,"cappucino");
    }
    
    
    public FabricaCafeCappucino(){
        
        this.soluvel = new Ingrediente();        
        soluvel.setTipo("Soluvel");
        soluvel.setQtd(100);
        
        this.leitePo = new Ingrediente();
        leitePo.setTipo("Leite em Po");
        leitePo.setQtd(100);
        
        this.bicarbonato = new Ingrediente();
        bicarbonato.setTipo("Bicarbonato");
        bicarbonato.setQtd(1);
        
        this.chocolatePo = new Ingrediente();
        chocolatePo.setTipo("ChocolatePo");
        chocolatePo.setQtd(50);
        
        this.canela = new Ingrediente();
        canela.setTipo("Canela");
        canela.setQtd(1);
     
        
    }

        
}
