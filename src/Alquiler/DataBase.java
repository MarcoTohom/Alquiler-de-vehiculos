package Alquiler;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {

    public RandomAccessFile dataBase;
    public File archivo;
    
    public void connectDataBase(String nombreArchivo) throws IOException {
        archivo = new File(nombreArchivo);
        dataBase = new RandomAccessFile(archivo, "rw");
        dataBase.seek(0);
    }

    public void disconnectDataBase() throws IOException {
        if (dataBase != null) {
            dataBase.close();
        }
    }

    public void create(Usuario usuario) {
        try {
            connectDataBase("Usuarios/"+usuario.getDpi() + ".txt");
            dataBase.writeBoolean(usuario.isActivo());
            dataBase.writeLong(usuario.getDpi());
            dataBase.writeInt(usuario.getNit());
            dataBase.writeUTF(setLength(usuario.getNombres(), 30));
            dataBase.writeUTF(setLength(usuario.getApellidos(), 40));
            dataBase.writeUTF(setLength(usuario.getProfesion(), 20));
            dataBase.writeUTF(setLength(usuario.getDireccion(), 50));
            dataBase.writeShort(usuario.getFechaNacimiento()[0]);
            dataBase.writeShort(usuario.getFechaNacimiento()[1]);
            dataBase.writeShort(usuario.getFechaNacimiento()[2]);
            dataBase.writeShort(usuario.getFechaRegistro()[0]);
            dataBase.writeShort(usuario.getFechaRegistro()[1]);
            dataBase.writeShort(usuario.getFechaRegistro()[2]);
            dataBase.writeBoolean(usuario.isAlquilando());
            disconnectDataBase();
        } catch (IOException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void create(Vehiculo vehiculo) {
        try {
            connectDataBase("Vehiculos/" + vehiculo.getPlaca() + ".txt");
            dataBase.writeBoolean(vehiculo.isActivo());
            dataBase.writeUTF(setLength(vehiculo.getPlaca(), 7));
            dataBase.writeUTF(setLength(vehiculo.getMarca(), 10));
            dataBase.writeInt(vehiculo.getModelo());
            dataBase.writeUTF(setLength(vehiculo.getMotor(), 35));
            dataBase.writeUTF(setLength(vehiculo.getChasis(), 35));
            dataBase.writeShort(vehiculo.getNumero_asientos());
            dataBase.writeInt(vehiculo.getCentimetros_cubicos());
            dataBase.writeUTF(setLength(vehiculo.getColor(), 10));
            dataBase.writeBoolean(vehiculo.isAlquilado());
            disconnectDataBase();
        } catch (IOException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showUsuarios() {
        File folder = new File("Usuarios/");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                try {
                    System.out.println(file.getName());
                    connectDataBase(file.getName());
                    System.out.println("");
                    boolean active = dataBase.readBoolean();
                    if (active) {
                        System.out.println("DPI: " +          dataBase.readLong());
                        System.out.println("NIT: " +          dataBase.readInt());
                        System.out.println("Nombres: " +      dataBase.readUTF());
                        System.out.println("Apellidos: " +    dataBase.readUTF());
                        System.out.println("Dirección: " +    dataBase.readUTF());
                        System.out.println("F Nacimineto: " + dataBase.readShort() + "/" + dataBase.readShort() + "/" + dataBase.readShort());
                        System.out.println("F Registro: " +   dataBase.readShort() + "/" + dataBase.readShort() + "/" + dataBase.readShort());
                    }else{
                    }
                    disconnectDataBase();
                } catch (IOException ex) {
                    Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void showVehiculos(){
        File folder = new File("Vehiculos/");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            try {
                connectDataBase(file.getName());
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
            } catch (IOException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String setLength(String str, int size) {
        String newString = "";
        if (str.length() == size) {
            return str;
        }
        if (str.length() < size) {
            for (int i = 0; str.length() < size; i++) {
                str = str.concat(" ");
            }
            return str;
        }
        if (newString.length() > size) {
            for (int i = 0; i < size; i++) {
                newString = newString.concat(String.valueOf(str.charAt(i)));
            }
            return newString;
        }
        return newString;
    }
}
