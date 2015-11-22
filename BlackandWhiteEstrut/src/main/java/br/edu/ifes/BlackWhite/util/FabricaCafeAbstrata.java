/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.util;


import br.edu.ifes.BlackWhite.cdp.Cafe;
import br.edu.ifes.BlackWhite.cdp.Chocolate;
import br.edu.ifes.BlackWhite.cdp.Ingrediente;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20131bsi0033
 */
public class FabricaCafeAbstrata implements Fabrica{
    
    protected Cafe cafe;
    protected Ingrediente agua;
    protected Ingrediente acucar;
    protected Ingrediente bicarbonato;
    protected Ingrediente canela;
    protected Ingrediente chocolatePo;
    protected Ingrediente leite;
    protected Ingrediente leitePo;
    protected Ingrediente soluvel;
    protected Ingrediente zeroCafeina;
    
    public FabricaCafeAbstrata()
    {
        this.agua = new Ingrediente();        
        agua.setTipo("Agua");
        agua.setQtd(100);
        
        this.acucar = new Ingrediente();        
        acucar.setTipo("Acucar");
        acucar.setQtd(2);
        
    }
    
    public Cafe criarCafe(){
        return new Cafe();
    }
    
    public Ingrediente criarAgua(){
        if (agua != null){
            try {
                return agua.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(FabricaCafeAbstrata.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public Ingrediente criarChocolatePo()
    {
       if (chocolatePo != null){
           try {
               return chocolatePo.clone();
           } catch (CloneNotSupportedException ex) {
               Logger.getLogger(FabricaCafeAbstrata.class.getName()).log(Level.SEVERE, null, ex);
           }
        } 
        return null;
    }

    @Override
    public Ingrediente criarAcucar() {
        if (acucar != null){
            try {
                return acucar.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(FabricaCafeAbstrata.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    

    @Override
    public Ingrediente criarBicarbonato() {
        if (bicarbonato != null){
            try {
                return bicarbonato.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(FabricaCafeAbstrata.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
        
    }

    @Override
    public Ingrediente criarCanela() {
        if (canela != null){
            try {
                return canela.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(FabricaCafeAbstrata.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public Ingrediente criarLeite() {
        if (leite != null){
            try {
                return leite.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(FabricaCafeAbstrata.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
        
    }

    @Override
    public Ingrediente criarLeitePo() {
        if (leitePo != null){
            try {
                return leitePo.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(FabricaCafeAbstrata.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public Ingrediente criarSoluvel() {
        try {
            if (soluvel != null){
                return soluvel.clone();
            }
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(FabricaCafeAbstrata.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Ingrediente criarZeroCafeina() {
        
        if (zeroCafeina != null){
            try {
                return zeroCafeina.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(FabricaCafeAbstrata.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    
}
