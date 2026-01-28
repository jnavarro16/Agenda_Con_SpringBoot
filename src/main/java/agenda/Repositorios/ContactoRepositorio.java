package agenda.Repositorios;

import agenda.Entidades.Contacto;

import java.util.List;

public interface ContactoRepositorio {
    List<Contacto> obtenerTodos();
    Contacto obtenerPorId(Long id);
    Contacto guardar(Contacto contacto);
    void eliminar(Long id);
}
