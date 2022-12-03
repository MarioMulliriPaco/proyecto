package com.mario7425.model;

public class Coche {
    //PK
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double presio;
    //FK
    private Cliente cliente;

    public Coche(String matricula, String marca, String modelo, String color, double presio, Cliente cliente) {
        this.setMatricula(matricula);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setColor(color);
        this.setPresio(presio);
        this.setCliente(cliente);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPresio() {
        return presio;
    }

    public void setPresio(double presio) {
        this.presio = presio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", presio=" + presio +
                ", cliente=" + cliente +
                '}';
    }
}
