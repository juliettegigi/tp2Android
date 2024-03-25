package com.softulp.tp2.entidades;

public class Inmueble {
    private int img;
    private String direccion;
    private float precio;

    public Inmueble(int img, String direccion, float precio) {
        this.img = img;
        this.direccion = direccion;
        this.precio = precio;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String domicilio) {
        this.direccion = domicilio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
