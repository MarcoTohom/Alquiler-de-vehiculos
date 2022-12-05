package Alquiler;

public class Alquiler {
    private boolean activo = true;
    private String dpi;
    private String placa;
    private short [] fechaEntrega = new short[3], fechaDevolucion = new short[3];
    
    public Alquiler(){
        
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        String str[] = dpi.split("[.]");
        this.dpi = str[0];
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        String str[] = placa.split("[.]");
        this.placa = str[0];
    }

    public short[] getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(short[] fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public short[] getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(short[] fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" + 
                "activo=" + activo + 
                ", dpi=" + dpi + 
                ", placa=" + placa + 
                ", fechaEntrega=" + fechaEntrega + 
                ", fechaDevolucion=" + fechaDevolucion + '}';
    }
    
}
