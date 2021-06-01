package Alquiler;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Actions acciones = new Actions();
        short opcion = 0;
        do {
            System.out.println("1.- Registrar Usuario");
            System.out.println("2.- Modificar Usuario");
            System.out.println("3.- Eliminar  Usuario");
            System.out.println("4.- Ingresar  Vehiculo");
            System.out.println("5.- Modificar Vehículo");
            System.out.println("6.- Eliminar  Vehículo");
            System.out.println("7.- Rentar    Vehículo");
            System.out.println("8.- Devolver  Vehículo");
            System.out.println("9.- Consultar Alquiler");
            System.out.println("0.- Salir");
            System.out.println("Elija una opcion:");
            opcion = in.nextShort();
            switch (opcion) {
                case 1:
                    acciones.addUsuario();
                    break;
                case 4:
                    acciones.addVehiculo();
                    break;
            }
        } while (opcion != 0);

    }
}
