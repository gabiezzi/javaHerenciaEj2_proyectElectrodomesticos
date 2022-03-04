/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Scanner;

/**
 *
 * @author Gabi
 */
public class ElectrodomesticEntity {

    protected String color;
    protected double precio;
    protected String consumoEnergetico;
    protected double peso;

    public ElectrodomesticEntity() {
        this.precio = precio = 1000d;
    }

    public ElectrodomesticEntity(String color, String consumoEnergetico, double peso) {
        this.color = color;
        this.precio = precio = 1000d;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "ElectrodomesticEntity{" + "color=" + color + ", precio=" + precio + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    private String comprobarColor(String color) {

        if (!(color.equalsIgnoreCase("blanco") ||color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul"))) {
            
            return "blanco";

        } else {

            return color;
        }
    }

    private String comprobarConsumo(String consumoEnergetico) {

        if (!(consumoEnergetico.equalsIgnoreCase("A") || consumoEnergetico.equalsIgnoreCase("B") || consumoEnergetico.equalsIgnoreCase("C") || consumoEnergetico.equalsIgnoreCase("D") || consumoEnergetico.equalsIgnoreCase("E") || consumoEnergetico.equalsIgnoreCase("F"))) {

            return "F";

        } else {

            return consumoEnergetico;
        }
    }

    public ElectrodomesticEntity crearElectrodomestico() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        
        System.out.println("Ingrese el peso del electrodomestic");
        peso = sc.nextDouble();
        System.out.println("Ingrese el consumo del electrodomestic");
        String consumoE = sc.next();
        System.out.println("Ingrese el color del electrodomestic");
        String colorE = sc.next();

        color = comprobarColor(colorE);
        consumoEnergetico = comprobarConsumo(consumoE);
        precio=precioFinal();

        return new ElectrodomesticEntity(color, consumoEnergetico, peso);

    }

    public double precioFinal() {

        double adicional = precio;

        switch (consumoEnergetico) {
            case "A":
                adicional+= 1000;
                break;

            case "B":
                adicional+= 800;

                break;

            case "C":
                adicional+= 600;
                break;

            case "D":
                adicional+= 500;

                break;

            case "E":

                adicional+= 300;
                break;

            case "F":

                adicional+= 100;
                break;
}

        if (peso <= 19 && peso >= 1) {
            adicional+= 100;
        } else if (peso <= 49 && peso >= 20) {
            adicional+= 500;

        } else if (peso <= 79 && peso >= 50) {
            adicional+= 800;

        } else if (peso >= 80) {
            adicional+= 1000;

        }

        return adicional;
    }

}
