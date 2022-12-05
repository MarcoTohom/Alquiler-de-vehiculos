package test;

import Alquiler.DataBase;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShowVehiculos {

    public static RandomAccessFile dataBase;
    public static File archivo;

    public static void main(String[] args) {
        showVehiculos();
    }

    public static void connectDataBase(String nombreArchivo, long position) throws IOException {
        archivo = new File(nombreArchivo);
        dataBase = new RandomAccessFile(archivo, "rw");
        dataBase.seek(0);
    }

    public static void disconnectDataBase() throws IOException {
        if (dataBase != null) {
            dataBase.close();
        }
    }

    public static void showVehiculos() {

        try {
            File folder = new File("Vehiculos/");
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                System.out.println(file.getName());
                connectDataBase("Vehiculos/" + file.getName(), 0);
                System.out.println("");
                if (dataBase.readBoolean()) {
                    System.out.println("Placa: " + dataBase.readUTF());
                    System.out.println("Marca: " + dataBase.readUTF());
                    System.out.println("Modelo: " + dataBase.readInt());
                    System.out.println("Motor: " + dataBase.readUTF());
                    System.out.println("Chasis: " + dataBase.readUTF());
                    System.out.println("Asientos: " + dataBase.readShort());
                    System.out.println("Centimetros cubicos: " + dataBase.readInt());
                    System.out.println("Color: " + dataBase.readUTF());
                }
                disconnectDataBase();
            }
        } catch (NullPointerException npe) {
            System.out.println("No hay vehículos");
        } catch (IOException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
