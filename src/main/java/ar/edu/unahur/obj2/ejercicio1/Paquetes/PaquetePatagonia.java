package ar.edu.unahur.obj2.ejercicio1.Paquetes;

public class PaquetePatagonia extends Paquete{


    public void imprimirItinerario() {
        print("Nombre: " + nombre());
        print("Transporte Ida: " + transporteIda());
        print("Dia 1: " + dia1());
        print("Dia 2: " + dia2());
        print("Dia 3: " + dia3());
        print("Transporte Vuelta: " + transporteVuelta());
    }

    @Override
    protected String nombre() {
        return "Paquete Patagonia";
    }

    @Override
    protected String transporteIda() {
        return "Traslado desde el aeropuerto de El calafate al hotel Huemul";
    }

    @Override
    protected String dia1() {
        return "Visita ciudad Calafate";
    }

    @Override
    protected String dia2() {
        return "Visita Glaciar Perito Moreno";
    }

    @Override
    protected String dia3() {
        return "Naveción Glaciares";
    }

    @Override
    protected String transporteVuelta() {
        return "Traslado del hotel Huemul al aeropuerto de El Calafate ";
    }

}
