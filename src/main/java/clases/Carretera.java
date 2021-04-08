package clases;

public class Carretera extends Proyecto {

    private double cantidadKilometros;

    public Carretera(double cantidadKilometros, String nombreProyecto, int tipo_u, String fechaFinalizacion, String fechaEntrega) {
        super(nombreProyecto, tipo_u, fechaFinalizacion, fechaEntrega);
        this.cantidadKilometros = cantidadKilometros;
    }

    @Override
    public double costo() {

        double v[] = {0, 10000, 8700, 9200};

        return cantidadKilometros * v[super.getTipo_u()];
    }

    @Override
    public double penalidad() {

        return (int) (super.dias() / 7) * 600;
    }

    @Override
    public double totalPagar() {

        return costo() - penalidad();

    }

    public double getCantidadKilometros() {
        return cantidadKilometros;
    }

    public void setCantidadKilometros(double cantidadKilometros) {
        this.cantidadKilometros = cantidadKilometros;
    }

}
