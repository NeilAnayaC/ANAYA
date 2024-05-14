package TALLER.MSSeguridad.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "secutiry")
public class modelUsuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarioid")
    public int usuarioid;

    @Column(name = "usuario")
    public String username;

    @Column(name = "clave")
    public String password;

    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getUsuario() {
        return username;
    }

    public void setUsuario(String username) {
        this.username = username;
    }

    public String getClave() {
        return password;
    }

    public void setClave(String username) {
        this.username = username;
    }

    
}
