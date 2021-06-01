package Alquiler;
public class Vehiculo {
    private boolean eliminado = false;
    private String placa;
    private String marca;
    private int modelo;
    private String motor;
    private String chasis;
    private short numero_asientos;
    private int centimetros_cubicos;
    private String color;
    private boolean alquilado = false;

    public Vehiculo(String placa, String marca, int modelo, String motor, String chasis, short numero_asientos, int centimetros_cubicos, String color) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.chasis = chasis;
        this.numero_asientos = numero_asientos;
        this.centimetros_cubicos = centimetros_cubicos;
        this.color = color;
    }
    
    public Vehiculo(){
        
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public short getNumero_asientos() {
        return numero_asientos;
    }

    public void setNumero_asientos(short numero_asientos) {
        this.numero_asientos = numero_asientos;
    }

    public int getCentimetros_cubicos() {
        return centimetros_cubicos;
    }

    public void setCentimetros_cubicos(int centimetros_cubicos) {
        this.centimetros_cubicos = centimetros_cubicos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + 
                "eliminado=" + eliminado + 
                ", placa=" + placa + 
                ", marca=" + marca + 
                ", modelo=" + modelo + 
                ", motor=" + motor + 
                ", chasis=" + chasis + 
                ", numero_asientos=" + numero_asientos + 
                ", centimetros_cubicos=" + centimetros_cubicos + 
                ", color=" + color + 
                ", alquilado=" + alquilado + '}';
    }
    
    
}
