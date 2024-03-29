package Alquiler;

public class Usuario {

    private boolean activo = true;
    private long dpi;
    private int nit;
    private String nombres;
    private String apellidos;
    private String profesion;
    private String direccion;
    private short[] fechaNacimiento;
    private short[] fechaRegistro;
    private boolean alquilando = false;

    public Usuario(long dpi, int nit, String direccion, short[] fechaNacimiento, String nombres, String apellidos, String profesion, short[] fechaRegistro) {
        this.dpi = dpi;
        this.nit = nit;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.profesion = profesion;
        this.fechaRegistro = fechaRegistro;
    }
    
    public Usuario(){
        
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public short[] getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(short[] fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public short[] getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(short[] fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isAlquilando() {
        return alquilando;
    }

    public void setAlquilando(boolean alquilando) {
        this.alquilando = alquilando;
    }

    @Override
    public String toString() {
        return "Usuario{" + 
                "eliminado=" + activo + 
                ", dpi=" + dpi + 
                ", nit=" + nit + 
                ", direccion=" + direccion + 
                ", fechaNacimiento=" + fechaNacimiento + 
                ", nombres=" + nombres + 
                ", apellidos=" + apellidos + 
                ", profesion=" + profesion + 
                ", fechaRegistro=" + fechaRegistro + 
                ", alquilando=" + alquilando + '}';
    }

}
