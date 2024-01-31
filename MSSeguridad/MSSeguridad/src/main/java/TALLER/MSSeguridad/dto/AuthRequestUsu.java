package TALLER.MSSeguridad.dto;

import java.io.Serializable;

public class AuthRequestUsu implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    
    public AuthRequestUsu() {
    }

    public AuthRequestUsu(String username, String password) {
        this.username = username;
        this.password = password;
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

    public void setClave(String password) {
        this.password = password;
    }

    
}
