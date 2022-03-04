package implement;

import entity.ElectrodomesticEntity;
import entity.LavadoraEntity;
import java.util.Scanner;
import service.LavadoraService;

public class LavadoraServiceImplement implements LavadoraService {

    Scanner sc;

    public LavadoraServiceImplement() {

        sc = new Scanner(System.in).useDelimiter("\n");
    }

    @Override
    public LavadoraEntity crearLavadora() {

        LavadoraEntity nuevaLava = new LavadoraEntity();
        nuevaLava.crearElectrodomestico();

        System.out.println("Ingrese la carga del lavarropa:");
        nuevaLava.setCarga(sc.nextInt());

        return nuevaLava;

    }

    @Override
    public double precioFinalLavadora(LavadoraEntity nuevoElectro) {

        if (nuevoElectro.getCarga() >= 30) {

            return nuevoElectro.getPrecio() + 500d;

        } else {

            return nuevoElectro.getPrecio();

        }

    }
}
