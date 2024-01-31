package TALLER.MSSeguridad.Mapper;

import org.springframework.stereotype.Component;

import TALLER.MSSeguridad.dto.AuthRequestUsu;
import TALLER.MSSeguridad.model.modelUsuario;

@Component
public class UsuarioMapper {
    
    public AuthRequestUsu entityToDto(modelUsuario usuario){
        AuthRequestUsu dto = new AuthRequestUsu();
        dto.setUsuario(usuario.getUsuario());
        dto.setClave(usuario.getClave());
        return dto;
    }

    public modelUsuario dtoTOEntity(AuthRequestUsu dto){
        modelUsuario usuario = new modelUsuario();
        usuario.setUsuario(dto.getUsuario());
        usuario.setClave(dto.getClave());
        return usuario;
    }
}
