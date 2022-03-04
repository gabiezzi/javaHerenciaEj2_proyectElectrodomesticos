/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Gabi
 */
public class LavadoraEntity extends ElectrodomesticEntity{
    
    private int carga;

    public LavadoraEntity(int carga, String color, String consumoEnergetico, double peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public LavadoraEntity() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "LavadoraEntity{" + super.toString() + "carga=" + carga + '}';
    }
    
    
    
    
    
    
}
