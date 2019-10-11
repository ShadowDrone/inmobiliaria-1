package ar.com.ada.api.inmobiliaria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Inmobiliaria
 */
@Entity
@Table (name = "inmobiliaria")
public class Inmobiliaria {

    @Id
    @Column (name ="inmobiliaria_id")
    private int inmobiliariaId;

    private String nombre;

    private String cuil;

    @Column (name = "usuario_id")
    private int usuarioId;

    
}