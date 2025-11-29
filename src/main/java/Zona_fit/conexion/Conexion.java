package Zona_fit.conexion.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    public static Connection getConexion(){
        Connection conexion = null;
        var baseDatos = "zona_fit_db"; //nombre de base de datos
        var url = "jdbc:mysql://localhost:3306/" + baseDatos; //cadena de conexion
        var usuario = "root"; // nombre de usuario
        var password = "Jose@MySQL2025"; // password
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // UP Clase conexion a la base de datos
            //UP Datos necesarios para establecer la conexion a mysql
            conexion = DriverManager.getConnection(url, usuario, password);
        }catch (Exception e){
            System.out.println("Error al conectarnos a la BD" + e.getMessage());
        }
        return conexion; // UP Retornamos el objeto conexion
    }
    //UP Agregamos un metodo main para probar nuestar conexion
    public static void main(String[] args) {
        //Variable para poder obtener la conexion a la base de datos
        var conexion = Conexion.getConexion();
        if (conexion != null)
            System.out.println("Conexion exitosa" + conexion);
        else
            System.out.println("Error al conectarse");
    }
}
