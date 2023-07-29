package repositorio;

import java.util.List;

import modelo.Producto;

public class EjemploRepositorio {
	
		public static void main(String[] args) {
			OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
			repo.crear(new Producto("Aceite", "La favorita", 24,"Unidad"));
			repo.crear(new Producto("Galleta", "Kit Kat", 50,"Unidad"));
			repo.crear(new Producto("Leche", "Rey Leche", 10,"Unidad"));
			repo.crear(new Producto("Pollo", "Mr.Pollo",5,"kilo"));
			
			List<Producto> clientes = repo.listar();
			clientes.forEach(System.out::println);
			System.out.println("================ Paginable ================");
			List<Producto> paginable = repo.listar(0, 3);
			paginable.forEach(System.out::println);
			
			System.out.println("================ Ordenable ================");
			List<Producto> productoOrdenAsc = repo.listar("Marca", Direccion.DESC);
			for(Producto c: productoOrdenAsc) {
				System.out.println(c);
			}
				System.out.println("================ Editar ================");
				Producto galletaActualizar = new Producto("Galleta", "Oreo", 50, "Unidad");
				galletaActualizar.setId(2);
				repo.editar(galletaActualizar);
				
				Producto galleta = repo.porId(2);
				System.out.println(galleta);
				
				System.out.println("================ Listar la edicion ================");
				repo.listar("cantidadStock", Direccion.ASC).forEach(System.out::println);
				
				System.out.println("================ Eliminar ================");
				repo.eliminar(2);
				repo.listar("cantidadStock", Direccion.ASC).forEach(System.out::println);
				
	}
	

	
}
