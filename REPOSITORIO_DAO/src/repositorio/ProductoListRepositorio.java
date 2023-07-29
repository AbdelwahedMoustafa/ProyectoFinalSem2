package repositorio;

import java.util.ArrayList;

import java.util.List;

import modelo.Producto;


public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {


	
	@Override
	public void editar(Producto producto) {
		Producto c = this.porId(producto.getId());
		c.setNombreProducto(producto.getNombreProducto());
		c.setMarca(producto.getMarca());
		c.setCantidadStock(producto.getCantidadStock());
		c.setPresentacion(producto.getPresentacion());
	}

	

	@Override
	public List<Producto> listar(String campo, Direccion dir) {
		List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
		listaOrdenada.sort((a, b) -> {
			int resultado = 0;
			if(dir == Direccion.ASC) {
				resultado = ordenar(campo, a, b);
			}else if(dir == Direccion.DESC) {
				resultado = ordenar(campo, b, a);
			}
			return resultado;
		});
		return listaOrdenada;
	}

		
	public static int ordenar(String campo, Producto a, Producto b) {
		int resultado = 0;
		switch (campo) {
		case "id" -> resultado = a.getId().compareTo(b.getId());
		case "nombre del producto" -> resultado = a.getNombreProducto().compareTo(b.getNombreProducto());
		case "marca" -> resultado = a.getMarca().compareTo(b.getMarca());
		case "cantidadStock" -> resultado = Integer.compare(a.getCantidadStock(), b.getCantidadStock());
		case "presentacion" -> resultado = a.getPresentacion().compareTo(b.getPresentacion());
		}
		return resultado;
	}
	
}
