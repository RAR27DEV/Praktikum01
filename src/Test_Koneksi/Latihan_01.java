/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_Koneksi;

/**
 *
 * @author rama
 */
import java.sql.*;

public class Latihan_01 {
    static final String db_unidha="jdbc:mysql://localhost:3306/db_unidha";
    private static Connection Utama;
    public static Connection db_unidha() throws SQLException , ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Proses Deteksi Driver Berhasil");
            DriverManager.getConnection(db_unidha,"root","");
            System.out.println("Koneksi Database Berhasil");
        }catch (final SQLException ex) {
            System.out.println("Koneksi Database Gagal");
        }
        return Utama;
    }
}
