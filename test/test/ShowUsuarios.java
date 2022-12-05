package test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShowUsuarios {

    public static RandomAccessFile dataBase;
    public static File archivo;

    public static void main(String[] args) {
        showUsuarios();
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

    public static void showUsuarios() {
        File folder = new File("Usuarios/");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {

            try {
                System.out.println(file.getName());
                connectDataBase("Usuarios/" + file.getName(), 0);
                System.out.println("");
                boolean active = true;
                //active = dataBase.readBoolean();
                if (active) {
                    System.out.println("Active: " + dataBase.readBoolean());
                    System.out.println("DPI: " + dataBase.readLong());
                    System.out.println("NIT: " + dataBase.readInt());
                    System.out.println("Nombres: " + dataBase.readUTF());
                    System.out.println("Apellidos: " + dataBase.readUTF());
                    System.out.println("Profesion: " + dataBase.readUTF());
                    System.out.println("Direccion: " + dataBase.readUTF());
                    System.out.println("F Nacimineto: " + dataBase.readShort() + "/" + dataBase.readShort() + "/" + dataBase.readShort());
                    System.out.println("F Registro: " + dataBase.readShort() + "/" + dataBase.readShort() + "/" + dataBase.readShort());
                } else {
                }

                disconnectDataBase();
            } catch (IOException ex) {
                Logger.getLogger(ShowUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
