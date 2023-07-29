package repositorio;

import java.util.ArrayList;
import java.util.List;

import modelo.BaseEntity;
import modelo.Producto;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T>  {
	
	protected List<T> dataSource;

	public AbstractaListRepositorio() {
		this.dataSource = new ArrayList<>();
	}

	@Override
	public List<T> listar() {
		return dataSource;
	}

	@Override
	public T porId(Integer id) {
		T resultado = null;
		for(T pro: dataSource) {
			if(pro.getId() != null && pro.getId().equals(id)) {
				resultado= pro;
				break;
			}		
		}
		return resultado;
	}

	@Override
	public void crear(T t) {
		this.dataSource.add(t);
		
	}

	

	@Override
	public void eliminar(Integer id) {
		this.dataSource.remove(this.porId(id));
		
	}

	

	@Override
	public List<T> listar(int desde, int hasta) {
		return dataSource.subList(desde, hasta);
	}
	

}
