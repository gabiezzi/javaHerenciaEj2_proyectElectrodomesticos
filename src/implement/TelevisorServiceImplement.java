package implement;

import entity.TelevisorEntity;
import java.util.Scanner;
import service.TelevisorService;

public class TelevisorServiceImplement implements TelevisorService {

    Scanner sc;

    public TelevisorServiceImplement() {

        sc = new Scanner(System.in).useDelimiter("\n");
    }

    @Override
    public TelevisorEntity crearTelevisor() {

        TelevisorEntity nuevoTv = new TelevisorEntity();

        nuevoTv.crearElectrodomestico();

        System.out.println("Ingrese la cant de pulgadas de tv");
        nuevoTv.setPulgadas(sc.nextDouble());
        System.out.println("Seleccione opcion sintonizador TDT : Si/No");
        String option = sc.next();
        if (option.equalsIgnoreCase("si")) {

            nuevoTv.setSintonizadorTDT(true);
        }
        
        nuevoTv.setPrecio(precioFinalTV(nuevoTv));

        return nuevoTv;
    }

    @Override
    public double precioFinalTV(TelevisorEntity nuevoTv) {

        double precioF = nuevoTv.getPrecio();

        if (nuevoTv.getPulgadas() > 40) {

            precioF += (precioF * 0.3);
        } else if (nuevoTv.isSintonizadorTDT()) {

            precioF += 500;
        }

        return precioF;
    }

}
