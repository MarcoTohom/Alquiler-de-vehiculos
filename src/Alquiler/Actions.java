
package Alquiler;

import java.util.Scanner;

public class Actions {
    public void addUsuario(){
        Scanner in = new Scanner (System.in);
        Usuario usuario = new Usuario();
        short[] fecha = new short[3];
        System.out.println("DPI:");
        usuario.setDpi(in.nextLong());
        System.out.println("NIT:");
        usuario.setNit(in.nextInt());
        in.nextLine();
        System.out.println("Direccion:");
        usuario.setDireccion(in.nextLine());
        System.out.println("Nombres:");
        usuario.setNombres(in.nextLine());
        System.out.println("Apellidos:");
        usuario.setApellidos(in.nextLine());
        System.out.println("Profesion");
        usuario.setProfesion(in.nextLine());
        System.out.println("Fecha de nacimiento");
        System.out.println("Año:");
        fecha[0] = in.nextShort();
        System.out.println("Mes:");
        fecha[1] = in.nextShort();
        System.out.println("Dia:");
        fecha[2] = in.nextShort();
        usuario.setFechaNacimiento(fecha);
        System.out.println("Fecha de registro");
        System.out.println("Año:");
        fecha[0] = in.nextShort();
        System.out.println("Mes:");
        fecha[1] = in.nextShort();
        System.out.println("Dia:");
        fecha[2] = in.nextShort();
        usuario.setFechaRegistro(fecha);
        DataBase dataBase = new DataBase();
        dataBase.create(usuario);
    }
    public void addVehiculo(){
        Scanner in = new Scanner (System.in);
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Placa:");
        vehiculo.setPlaca(in.nextLine());
        System.out.println("Marca:");
        vehiculo.setMarca(in.nextLine());
        System.out.println("Modelo:");
        vehiculo.setModelo(in.nextInt());
        System.out.println("Motor:");
        vehiculo.setMotor(in.nextLine());
        System.out.println("Chasis:");
        vehiculo.setChasis(in.nextLine());
        System.out.println("Numero de asientos:");
        vehiculo.setNumero_asientos(in.nextShort());
        System.out.println("Centimetros cubicos:");
        vehiculo.setCentimetros_cubicos(in.nextInt());
        System.out.println("Color:");
        vehiculo.setColor(in.nextLine());
        DataBase dataBase = new DataBase();
        dataBase.create(vehiculo);
    }
}
