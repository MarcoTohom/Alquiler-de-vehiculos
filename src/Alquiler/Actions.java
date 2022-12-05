package Alquiler;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Actions {

    public void addUsuario() {
        Scanner in = new Scanner(System.in);
        Usuario usuario = new Usuario();
        short[] fechaNacimiento = new short[3];
        short[] fechaRegistro = new short[3];
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
        fechaNacimiento[0] = in.nextShort();
        System.out.println("Mes:");
        fechaNacimiento[1] = in.nextShort();
        System.out.println("Dia:");
        fechaNacimiento[2] = in.nextShort();
        usuario.setFechaNacimiento(fechaNacimiento);
        System.out.println("Fecha de registro");
        System.out.println("Año:");
        fechaRegistro[0] = in.nextShort();
        System.out.println("Mes:");
        fechaRegistro[1] = in.nextShort();
        System.out.println("Dia:");
        fechaRegistro[2] = in.nextShort();
        usuario.setFechaRegistro(fechaRegistro);
        DataBase dataBase = new DataBase();
        dataBase.create(usuario);
    }

    public void addVehiculo() {
        Scanner in = new Scanner(System.in);
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Placa:");
        vehiculo.setPlaca(in.nextLine());
        System.out.println("Marca:");
        vehiculo.setMarca(in.nextLine());
        System.out.println("Modelo:");
        vehiculo.setModelo(in.nextInt());
        in.nextLine();
        System.out.println("Motor:");
        vehiculo.setMotor(in.nextLine());
        System.out.println("Chasis:");
        vehiculo.setChasis(in.nextLine());
        System.out.println("Numero de asientos:");
        vehiculo.setNumero_asientos(in.nextShort());
        System.out.println("Centimetros cubicos:");
        vehiculo.setCentimetros_cubicos(in.nextInt());
        in.nextLine();
        System.out.println("Color:");
        vehiculo.setColor(in.nextLine());
        DataBase dataBase = new DataBase();
        dataBase.create(vehiculo);
    }

    public void editUsuario() {
        Scanner in = new Scanner(System.in);
        File folder = new File("Usuarios/");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> usuarios = new ArrayList<String>();
        Usuario usuario = new Usuario();
        short[] fecha = new short[3];
        short[] fecha2 = new short[3];
        int i = 1, opcion = 0;
        do {
            i = 0;
            opcion = 0;
            for (File file : listOfFiles) {
                System.out.println(i + ": " + file.getName());
                usuarios.add(file.getName());
                i++;
            }
            System.out.println("Elija el usuario que desea editar:");
            opcion = in.nextInt();
        } while (opcion < 0 || opcion > usuarios.size());
        String str[] = String.valueOf(usuarios.get(opcion)).split("[.]");
        usuario.setDpi(Long.parseLong(str[0]));
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
        fecha2[0] = in.nextShort();
        System.out.println("Mes:");
        fecha2[1] = in.nextShort();
        System.out.println("Dia:");
        fecha2[2] = in.nextShort();
        usuario.setFechaRegistro(fecha);
        DataBase dataBase = new DataBase();
        dataBase.create(usuario);
    }

    public void editVehiculo() {
        Scanner in = new Scanner(System.in);
        File folder = new File("Vehiculos/");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> vehiculos = new ArrayList<String>();
        Vehiculo vehiculo = new Vehiculo();
        short[] fecha = new short[3];
        int i = 1, opcion = 0;
        do {
            i = 0;
            opcion = 0;
            for (File file : listOfFiles) {
                System.out.println(i + ": " + file.getName());
                vehiculos.add(file.getName());
                i++;
            }
            System.out.println("Elija el vehiculo que desea editar:");
            opcion = in.nextInt();
        } while (opcion < 0 || opcion > vehiculos.size());
        vehiculo.setPlaca(vehiculos.get(opcion));
        in.nextLine();
        System.out.println("Marca:");
        vehiculo.setMarca(in.nextLine());
        System.out.println("Modelo:");
        vehiculo.setModelo(in.nextInt());
        in.nextLine();
        System.out.println("Motor:");
        vehiculo.setMotor(in.nextLine());
        System.out.println("Chasis:");
        vehiculo.setChasis(in.nextLine());
        System.out.println("Numero de asientos:");
        vehiculo.setNumero_asientos(in.nextShort());
        System.out.println("Centimetros cubicos:");
        vehiculo.setCentimetros_cubicos(in.nextInt());
        in.nextLine();
        System.out.println("Color:");
        vehiculo.setColor(in.nextLine());
        DataBase dataBase = new DataBase();
        dataBase.create(vehiculo);
    }

    public void deleteUsuario() {
        Scanner in = new Scanner(System.in);
        File folder = new File("Usuarios/");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> usuarios = new ArrayList<String>();
        Usuario usuario = new Usuario();
        short[] fecha = new short[3];
        int i = 1, opcion = 0;
        do {
            i = 0;
            opcion = 0;
            for (File file : listOfFiles) {
                System.out.println(i + ": " + file.getName());
                usuarios.add(file.getName());
                i++;
            }
            System.out.println("Elija el usuario que desea eliminar:");
            opcion = in.nextInt();
        } while (opcion < 0 || opcion > usuarios.size());
        DataBase dataBase = new DataBase();
        System.out.println("Usuarios/" + usuarios.get(opcion) + " deleted");
        dataBase.delete("Usuarios/" + usuarios.get(opcion));
    }

    public void deleteVehiculo() {
        Scanner in = new Scanner(System.in);
        File folder = new File("Vehiculos/");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> usuarios = new ArrayList<String>();
        Usuario usuario = new Usuario();
        short[] fecha = new short[3];
        int i = 1, opcion = 0;
        do {
            i = 0;
            opcion = 0;
            for (File file : listOfFiles) {
                System.out.println(i + ": " + file.getName());
                usuarios.add(file.getName());
                i++;
            }
            System.out.println("Elija el vehiculo que desea eliminar:");
            opcion = in.nextInt();
        } while (opcion < 0 || opcion > usuarios.size());
        DataBase dataBase = new DataBase();
        System.out.println("Vehiculos/" + usuarios.get(opcion) + " deleted");
        dataBase.delete("Vehiculos/" + usuarios.get(opcion));
    }

    public void addAlquiler() {
        Scanner in = new Scanner(System.in);
        DataBase dataBase = new DataBase();
        Alquiler alquiler = new Alquiler();
        ArrayList<String> vehiculos = new ArrayList<String>();
        ArrayList<String> usuarios = new ArrayList<String>();
        File folder = new File("Vehiculos/");
        File folderUsuarios = new File("Usuarios/");
        File[] listOfFiles = folder.listFiles();
        File[] listaUsuarios = folderUsuarios.listFiles();
        Vehiculo vehiculo = new Vehiculo();
        short[] fechaRegistro = new short[3];
        short[] fechaDevolucion = new short[3];
        int i = 0, opcion = 0;

        do {
            i = 0;
            opcion = 0;
            for (File file : listaUsuarios) {
                System.out.println(i + ": " + file.getName());
                usuarios.add(file.getName());
                i++;
            }
            System.out.println("Elija el usuario que desea agregar:");
            opcion = in.nextInt();
        } while (opcion < 0 || opcion > usuarios.size());
        alquiler.setDpi(usuarios.get(opcion));

        opcion = 0;
        boolean alquilado = false;
        do {
            if (alquilado) {
                System.out.println("Elija otro vehículo. Este se encuentra en alquiler");
            }
            do {
                i = 0;
                opcion = 0;
                for (File file : listOfFiles) {
                    System.out.println(i + ": " + file.getName());
                    vehiculos.add(file.getName());
                    i++;
                }
                System.out.println("Elija el vehiculo que desea agregar:");
                opcion = in.nextInt();
            } while (opcion < 0 || opcion > vehiculos.size());
            alquiler.setPlaca(vehiculos.get(opcion));
            alquilado = dataBase.isAlquilado(vehiculos.get(opcion));
        } while (alquilado);
        System.out.println("Fecha de entrega");
        System.out.println("Año:");
        fechaRegistro[0] = in.nextShort();
        System.out.println("Mes:");
        fechaRegistro[1] = in.nextShort();
        System.out.println("Dia:");
        fechaRegistro[2] = in.nextShort();
        alquiler.setFechaEntrega(fechaRegistro);
        System.out.println("Fecha de devolucion");
        System.out.println("Año:");
        fechaDevolucion[0] = in.nextShort();
        System.out.println("Mes:");
        fechaDevolucion[1] = in.nextShort();
        System.out.println("Dia:");
        fechaDevolucion[2] = in.nextShort();
        alquiler.setFechaDevolucion(fechaDevolucion);
        dataBase.create(alquiler);
    }
}
