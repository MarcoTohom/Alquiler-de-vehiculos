package Alquiler;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {

    public RandomAccessFile dataBase;

    /*
	 * Se abre el archivo recibiendo un nombre
     */

    public void connectDataBase(String nombreArchivo) throws IOException {
        dataBase = new RandomAccessFile(nombreArchivo, "rw");
        dataBase.seek(0);
    }

    /*
	 * Se cierra el archivo
     */

    public void disconnectDataBase() throws IOException {
        if (dataBase != null) {
            dataBase.close();
        }
    }
    
    public void create(Usuario usuario){
        try {
            connectDataBase(usuario.getDpi() + ".txt");
            dataBase.writeBoolean(usuario.isEliminado());
            dataBase.writeInt(usuario.getDpi());
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
    
    public void create(Vehiculo vehiculo){
        try {
            connectDataBase(vehiculo.getPlaca()+".txt");
            dataBase.writeBoolean(vehiculo.isEliminado());
            
        } catch (IOException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String setLength(String str, int size){
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
