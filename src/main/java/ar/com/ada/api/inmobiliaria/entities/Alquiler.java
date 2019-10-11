package ar.com.ada.api.inmobiliaria.entities;

import javax.persistence.*;

/**
 * Alquiler
 */
@Entity
@Table(name = "alquiler")
public class Alquiler {

    @Id
    @Table(name = "alquiler_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int alquilerId;

    @Table (name = "operacion_id")
    private int operacionId;

    @Table (name="tipo_alquiler")
    private String tipoAlquiler;

    @Table (name="plazo_alquiler")
    private String plazoAlquiler;

    
}