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
public class TelevisorEntity extends ElectrodomesticEntity{
    
    private double pulgadas;
    private boolean sintonizadorTDT;

    public TelevisorEntity() {
        this.sintonizadorTDT = sintonizadorTDT=false;
    }

    public TelevisorEntity(double pulgadas, boolean sintonizadorTDT, String color, String consumoEnergetico, double peso) {
        super(color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT=false;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "TelevisorEntity{" + super.toString() + "pulgadas=" + pulgadas + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
    
    
    
}
