package TALLER.MSSeguridad.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import TALLER.MSSeguridad.model.modelUsuario;

@Repository
public interface IAuthRepositoryUsu extends CrudRepository<modelUsuario, Integer>{
}
