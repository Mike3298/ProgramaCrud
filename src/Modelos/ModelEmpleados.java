/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.*;
import Modelos.Conexion;
import javax.swing.JOptionPane;

public class ModelEmpleados {
    Conexion nuevaConexion;
    Connection MyConexion;
    ResultSet rst;

    public ModelEmpleados(Conexion nuevaConexion, Connection MyConexion, ResultSet rst) {
        this.nuevaConexion = nuevaConexion;
        this.MyConexion = MyConexion;
        this.rst = rst;
    }

    public ModelEmpleados() {
        
    }
    
    public ResultSet ListarDatos()
    {
        try
        {
            MyConexion = nuevaConexion.conectar();
            Statement sentencia = MyConexion.createStatement();
            rst = sentencia.executeQuery("select * from Empleados");
            return rst;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"No se pudo Listar Empleados");
            return rst;
        }    
    }
    
    
 
    
    
}
