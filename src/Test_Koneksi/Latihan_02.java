/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_Koneksi;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author rama
 */


public class Latihan_02 {
  static final String db_unidha="jdbc:mysql://localhost:3306/db_unidha";
    private static Connection Utama;
    public static Connection db_unidha() throws SQLException , ClassNotFoundException{
        try {
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(myDriver);
            System.out.println("Proses Deteksi Driver Berhasil");
            DriverManager.getConnection(db_unidha,"root","");
            System.out.println("Koneksi Database Berhasil");
        }catch (final SQLException ex) {
            System.out.println("Koneksi Database Gagal");
        }
        return Utama;
    }  
}
