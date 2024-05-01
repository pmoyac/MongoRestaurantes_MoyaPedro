/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Pedro
 */
public class Restaurante {
    private ObjectId id;
    private String nombre;
    private int rating;
    private Date fechaInauguracion;
    private List<String> categorias;

    public Restaurante() {
    }

    public Restaurante(ObjectId id) {
        this.id = id;
    }

    public Restaurante(ObjectId id, String nombre, int rating, Date fechaInauguracion, List<String> categorias) {
        this.id = id;
        this.nombre = nombre;
        this.rating = rating;
        this.fechaInauguracion = fechaInauguracion;
        this.categorias = categorias;
    }

    public Restaurante(String nombre, int rating, Date fechaInauguracion) {
        this.nombre = nombre;
        this.rating = rating;
        this.fechaInauguracion = fechaInauguracion;
    }

    public Restaurante(String nombre, int rating, Date fechaInauguracion, List<String> categorias) {
        this.nombre = nombre;
        this.rating = rating;
        this.fechaInauguracion = fechaInauguracion;
        this.categorias = categorias;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getFechaInauguracion() {
        return fechaInauguracion;
    }

    public void setFechaInauguracion(Date fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "id=" + id + ", nombre=" + nombre + ", rating=" + rating + ", fechaInauguracion=" + fechaInauguracion + ", categorias=" + categorias + '}';
    }
    
    
}
