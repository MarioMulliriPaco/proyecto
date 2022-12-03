package com.mario7425.dao;

import com.mario7425.model.Cliente;
import com.mario7425.util.ConectorBD;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
    private final Connection connection;

    public ClienteDao(){
        connection = ConectorBD.getConnection();
    }
    public void addCliente(Cliente cliente){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO clientes(nif, nombre,direccion, ciudad,telefono)VALUES(?, ?, ?, ?, ?)"
            );
            preparedStatement.setString(1, cliente.getNif());
            preparedStatement.setString(2, cliente.getNombre());
            preparedStatement.setString(3, cliente.getCiudad());
            preparedStatement.setString(3, cliente.getDireccion());
            preparedStatement.setInt(5, cliente.getTelefono());
            preparedStatement.executeUpdate();
            System.out.println(cliente + "creado");
        }catch (SQLException e){
            System.out.println("error al cre ar al cliente" + e.getMessage());
        }
    }
    public void updateCliente(Cliente cliente){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE clientes SET nif=?, nombre=?,direccion=?, ciudad=?,telefono=?WHERE nif=?"
            );
            preparedStatement.setString(1, cliente.getNif());
            preparedStatement.setString(2, cliente.getNombre());
            preparedStatement.setString(3, cliente.getCiudad());
            preparedStatement.setString(3, cliente.getDireccion());
            preparedStatement.setInt(5, cliente.getTelefono());
            preparedStatement.setString(6, cliente.getNif());
            preparedStatement.executeUpdate();
            System.out.println(cliente + "editado");
        }catch (SQLException e){
            System.out.println("error al editar al cliente" + e.getMessage());
        }
    }
    public java.util.List<Cliente> getAllClientes() {
        List<Cliente> clientes = new ArrayList();

        try {
            Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clientes");

            while(resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setNif(resultSet.getString("nif"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setCiudad(resultSet.getString("ciudad"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setTelefono(resultSet.getInt("telefono"));
                clientes.add(cliente);
            }
        } catch (SQLException var5) {
            System.out.println("Error al listar los clientes: " + var5.getMessage());
        }

        return clientes;
    }
}