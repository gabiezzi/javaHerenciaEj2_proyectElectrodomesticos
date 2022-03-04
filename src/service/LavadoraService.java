/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.LavadoraEntity;

/**
 *
 * @author Gabi
 */
public interface LavadoraService {
    
    
    public LavadoraEntity crearLavadora();
    
    public double precioFinalLavadora(LavadoraEntity nuevoElectro);
    
    
}
