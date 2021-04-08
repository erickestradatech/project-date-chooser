package clases;

import java.text.DecimalFormat;

public abstract class Proyecto {

    // UIT = $1200
    private String codigo;
    private String nombreProyecto;
    private int tipo_u;
    private String fechaFinalizacion;
    private String fechaEntrega;

    static int cuenta = 1;

    // CONSTRUCTOR
    public Proyecto(String nombreProyecto, int tipo_u, String fechaFinalizacion, String fechaEntrega) {

        DecimalFormat d = new DecimalFormat("00000");
        this.codigo = d.format(cuenta++);
        this.nombreProyecto = nombreProyecto;
        this.tipo_u = tipo_u;
        this.fechaFinalizacion = fechaFinalizacion;
        this.fechaEntrega = fechaEntrega;
    }

    // METODOS ABSTRACTOS
    public abstract double costo();

    public abstract double penalidad();

    public abstract double totalPagar();

    // METODOS 
    public long dias() {
        return Lib01.difecha(fechaFinalizacion, fechaEntrega);
    }

    public String ubicacion() {

        String v[] = {"", "Norte", "Central", "Sur"};

        return v[tipo_u];
    }

    // GETTERS Y SETTERS
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public int getTipo_u() {
        return tipo_u;
    }

    public void setTipo_u(int tipo_u) {
        this.tipo_u = tipo_u;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

}
