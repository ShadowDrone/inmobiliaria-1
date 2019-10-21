package ar.com.ada.api.inmobiliaria.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import ar.com.ada.api.inmobiliaria.interfaces.ITieneUsuario;

/**
 * Locatario
 */
@Entity
@Table(name = "locatario")
public class Locatario extends Persona implements ITieneUsuario {

    @Id
    @Column(name = "locatario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // cambio nombre del atributo para poder mapear ITieneUsuario con Usuario

    @OneToMany(mappedBy = "locatario", cascade = CascadeType.ALL)
    private List<Reserva> reservas = new ArrayList<Reserva>();

    @OneToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    private Usuario usuario;

    @Transient
    private String tipoUsuario = "Locatario";

    public int getLocatarioId() {
        return id;
    }

    public void setLocatarioId(int locatarioId) {
        this.id = locatarioId;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Locatario() {
    }

    @Override
    public String toString() {
        return tipoUsuario;
    }

}