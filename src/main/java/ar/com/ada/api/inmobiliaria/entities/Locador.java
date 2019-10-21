package ar.com.ada.api.inmobiliaria.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Locador
 */
@Entity
@Table(name = "locador")
public class Locador extends Persona {

    @Id
    @Column(name = "locador_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int locadorId;
    @OneToMany(mappedBy = "locador", cascade = CascadeType.ALL)
    List<Inmueble> inmuebles = new ArrayList<Inmueble>();

    public int getLocadorId() {
        return locadorId;
    }

    public void setLocadorId(int locadorId) {
        this.locadorId = locadorId;
    }

    public List<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(List<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    public void agregarInmueble(Inmueble inmueble) {
        this.inmuebles.add(inmueble);
        inmueble.setLocador(this);
    }

    public Locador() {
    }
    
}