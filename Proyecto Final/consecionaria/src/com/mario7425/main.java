package com.mario7425;

import com.mario7425.dao.ClienteDao;
import com.mario7425.model.Cliente;
import com.mario7425.util.ConectorBD;

import java.sql.Connection;
import java.util.List;

public class main{
    public static <List> void main(String[] argos) {
        Cliente roberto = new Cliente("1215", "roberto", "Potosi", "Av. Villazon s/n", 465634);
        Cliente carlos = new Cliente("1215", "carlosz", "Potosi", "Av. Villazon s/n", 465634);
        Cliente elier = new Cliente("1215", "elier", "Potosi", "Av. Villazon s/n", 465634);
        Cliente juan = new Cliente("1215", "juan ", "Potosi", "Av. Villazon s/n", 465634);
        Cliente pedro = new Cliente("1215", "pedro", "Potosi", "Av. Villazon s/n", 465634);
        Cliente edgar = new Cliente("1215", "edgar", "Potosi", "Av. Villazon s/n", 465634);
        Cliente luis = new Cliente("1215", "luis", "Potosi", "Av. Villazon s/n", 465634);
        Cliente cristhian = new Cliente("1215", "cristhian", "Potosi", "Av. Villazon s/n", 465634);
        Cliente jose = new Cliente("1215", "josez", "Potosi", "Av. Villazon s/n", 465634);
        Cliente cliente = new Cliente("1215", "Wilfredina Andaluz", "Potosi", "Av. Villazon s/n", 465634);
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.addCliente(edgar);
        clienteDao.addCliente(carlos);
        clienteDao.addCliente(elier);
        clienteDao.addCliente(juan);
        clienteDao.addCliente(pedro);
        clienteDao.addCliente(luis);
        clienteDao.addCliente(cristhian);
        clienteDao.addCliente(jose);
        clienteDao.addCliente(cliente);
        java.util.List<Cliente> clientes = clienteDao.getAllClientes();
        for (int i= 0; i< clientes.size();i++);
        cliente = clientes.get(1);
        System.out.println(cliente);
    }
}
