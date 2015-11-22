/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.BlackWhite.util;


import br.edu.ifes.BlackWhite.cdp.Cafe;
import br.edu.ifes.BlackWhite.cdp.Ingrediente;


/**
 *
 * @author 20131bsi0033
 */
public interface Fabrica {
    
    public Cafe criarCafe();
    
    public Ingrediente criarAcucar();
    
    public Ingrediente criarAgua();    
    
    public Ingrediente criarBicarbonato();
    
    public Ingrediente criarCanela();
    
    public Ingrediente criarChocolatePo();
    
    public Ingrediente criarLeite();
    
    public Ingrediente criarLeitePo();
    
    public Ingrediente criarSoluvel();
    
    public Ingrediente criarZeroCafeina();
    
    
}
