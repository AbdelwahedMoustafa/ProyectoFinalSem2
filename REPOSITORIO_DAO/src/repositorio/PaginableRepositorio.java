package repositorio;

import java.util.List;

import modelo.Producto;

public interface PaginableRepositorio<T> {

	List<T> listar(int desde, int hasta);
}
