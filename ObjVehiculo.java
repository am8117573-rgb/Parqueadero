public class ObjVehiculo {
    private String Vehiculo;
    private String Propietario;
    private String tipo;
    private int Plan;
    private int ValorPlan;
    private int descuento;
    private int TotalPagar;

    public ObjVehiculo(String vehiculo, String propietario, String tipo, String plan, int valorPlan, int descuento,
            int totalPagar) {
        Vehiculo = vehiculo;
        Propietario = propietario;
        this.tipo = tipo;
        Plan = plan;
        ValorPlan = valorPlan;
        this.descuento = descuento;
        TotalPagar = totalPagar;
    }

    public ObjVehiculo() {
    }

    public String getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        Vehiculo = vehiculo;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlan() {
        return Plan;
    }

    public void setPlan(int plan) {
        Plan = plan;
    }

    public int getValorPlan() {
        return ValorPlan;
    }

    public void setValorPlan(int valorPlan) {
        ValorPlan = valorPlan;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(int totalPagar) {
        TotalPagar = totalPagar;
    }
    
    

}
