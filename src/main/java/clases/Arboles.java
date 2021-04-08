package clases;

public class Arboles extends Proyecto {

    private int cantidadArboles;

    public Arboles(int cantidadArboles, String nombreProyecto, int tipo_u, String fechaFinalizacion, String fechaEntrega) {
        super(nombreProyecto, tipo_u, fechaFinalizacion, fechaEntrega);
        this.cantidadArboles = cantidadArboles;
    }

    @Override
    public double costo() {

        double v[] = {0, 500, 380, 380};

        return v[super.getTipo_u()] * cantidadArboles;

    }

    @Override
    public double penalidad() {

        return super.dias() * 380;

    }

    @Override
    public double totalPagar() {

        return costo() - penalidad();

    }

    public int getCantidadArboles() {
        return cantidadArboles;
    }

    public void setCantidadArboles(int cantidadArboles) {
        this.cantidadArboles = cantidadArboles;
    }

}
