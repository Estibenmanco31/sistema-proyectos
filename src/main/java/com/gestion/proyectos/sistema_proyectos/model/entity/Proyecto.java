package com.gestion.proyectos.sistema_proyectos.model.entity;

import com.gestion.proyectos.sistema_proyectos.model.embeddable.ContactoCliente;
import com.gestion.proyectos.sistema_proyectos.model.enums.EstadoProyecto;
import com.gestion.proyectos.sistema_proyectos.model.enums.Prioridad;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "proyectos")
public class Proyecto extends BaseEntity {
    private String nombre;

    private String descripcion;

    @Embedded
    private ContactoCliente contactoCliente;

    @Enumerated(EnumType.STRING)
    private EstadoProyecto estadoProyecto;

    @Enumerated(EnumType.STRING)
    private Prioridad prioridad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ContactoCliente getContactoCliente() {
        return contactoCliente;
    }

    public void setContactoCliente(ContactoCliente contactoCliente) {
        this.contactoCliente = contactoCliente;
    }

    public EstadoProyecto getEstadoProyecto() {
        return estadoProyecto;
    }

    public void setEstadoProyecto(EstadoProyecto estadoProyecto) {
        this.estadoProyecto = estadoProyecto;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
}
