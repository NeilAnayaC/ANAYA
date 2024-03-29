package TALLER.MSSeguridad.service;

import java.util.List;

import TALLER.MSSeguridad.model.modelUsuario;

public interface IAuthServiceUsu {
    public modelUsuario add (modelUsuario usu);
    public modelUsuario update (modelUsuario usu);
    public boolean delete (int id);
    public List<modelUsuario> findAll();
    public modelUsuario findById(int id);
    public boolean validarCredenciales(String usuario, String clave);
}
