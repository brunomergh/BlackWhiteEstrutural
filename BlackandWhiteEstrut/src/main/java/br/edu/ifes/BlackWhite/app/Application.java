/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.app;

import br.edu.ifes.BlackWhite.cdp.Cafe;
import br.edu.ifes.BlackWhite.cdp.Chantili;
import br.edu.ifes.BlackWhite.cdp.Chocolate;
import br.edu.ifes.BlackWhite.cdp.CremeDeLaranja;
import br.edu.ifes.BlackWhite.cdp.Licor;
import br.edu.ifes.BlackWhite.util.Atendente;
import br.edu.ifes.BlackWhite.util.FabricaCafeMagic;
import br.edu.ifes.BlackWhite.util.Promocional;

/**
 *
 * @author Bruno
 */
public class Application {
    public static void main(String args[]) {
        
        Promocional dia = Promocional.getInstance(); 
        
        Cafe cafep = dia.Promocao("domingo"); 
        System.out.println("cafe de domingo: " + cafep);
        System.out.println("preco: " + cafep.getPreco());
        
        FabricaCafeMagic fabricaCafeMagic = FabricaCafeMagic.getInstance(); 
        
        fabricaCafeMagic.criarCafe("normal");
        
        cafep = new Chocolate(cafep);
        cafep = new Chantili(cafep);
        cafep = new CremeDeLaranja(cafep);
        cafep = new Licor(cafep);
        
        System.out.println("preco: " + cafep.getPreco());
        
        Atendente.INSTANCE.Promocao("segunda");
    }
}

