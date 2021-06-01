package Alquiler;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataBase dataBase = new DataBase();
        Actions acciones = new Actions();
        short opcion = 0;
        do {
            System.out.println("1.- Registrar  Usuario");
            System.out.println("2.- Modificar  Usuario");
            System.out.println("3.- Eliminar   Usuario");
            System.out.println("4.- Mostrar    Usuarios");
            System.out.println("5.- Registrar  Vehiculo");
            System.out.println("6.- Modificar  Vehículo");
            System.out.println("7.- Eliminar   Vehículo");
            System.out.println("8.- Mostrar    Vehiculos");
            System.out.println("9.- Rentar     Vehículo");
            System.out.println("10.- Devolver  Vehículo");
            System.out.println("11.- Consultar Alquiler");
            System.out.println("0.- Salir");
            System.out.println("Elija una opcion:");
            opcion = in.nextShort();
            switch (opcion) {
                case 1:
                    acciones.addUsuario();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    dataBase.showUsuarios();
                    break;
                case 5:
                    acciones.addVehiculo();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    dataBase.showVehiculos();
                    break;
                case 9:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        } while (opcion != 0);

    }
}
