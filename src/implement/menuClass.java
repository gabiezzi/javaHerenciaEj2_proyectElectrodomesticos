/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.ElectrodomesticEntity;
import entity.LavadoraEntity;
import entity.TelevisorEntity;
import java.util.Scanner;

/**
 *
 * @author Gabi
 */
public class menuClass {

    
    Scanner sc;
    LavadoraServiceImplement newServiceLavadora;
    TelevisorServiceImplement newServiceTv;
    
    public menuClass() {
        sc = new Scanner(System.in);
        
        newServiceLavadora = new LavadoraServiceImplement();
        newServiceTv = new TelevisorServiceImplement();
    }
    
    
    
    public void menu(){
        
        System.out.println("--- Menu Compras Online    ---\n"
                + "1. Seleccionar tipo de Electrodomestico: (tv, lava, electro) \n"
                + "2. Salir.");
        
        int opt = sc.nextInt();
         
        switch (opt) {
            case 1:
                String optElectro = sc.next();
                switch (optElectro) {
                    case "tv":
                        
                        TelevisorEntity nuevoTv = newServiceTv.crearTelevisor();
                        System.out.println(nuevoTv.toString());                        
                        break;
                    
                    case "lava":
                        
                        LavadoraEntity nuevaLavadora = newServiceLavadora.crearLavadora();
                        System.out.println(nuevaLavadora.toString());    
                        
                        
                        break;
                    
                    case "electro":
                        
                        ElectrodomesticEntity nuevoElectro =  new ElectrodomesticEntity();
                        nuevoElectro.crearElectrodomestico();
                        System.out.println(nuevoElectro.toString());    
                        
                        break;
                    }
            case 2:
                
                System.out.println("Ha elegido salir.");
                
                
                break;
            
        }
        
        
    }
    
    
}
