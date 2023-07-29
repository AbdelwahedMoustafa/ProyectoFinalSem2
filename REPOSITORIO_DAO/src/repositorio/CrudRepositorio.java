package repositorio;

import java.util.List;

import modelo.Producto;

public interface CrudRepositorio<T> {
	List<T> listar();
	T porId(Integer id);
	void crear(T producto);
	void editar(T producto);
	void eliminar(Integer id);
	 
	
}
