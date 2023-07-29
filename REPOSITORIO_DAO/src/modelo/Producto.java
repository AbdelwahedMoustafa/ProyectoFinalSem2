package modelo;

import java.util.Objects;

public class Producto extends BaseEntity{
	private Integer id;
	private String nombreProducto, marca;
    private int cantidadStock;
    private String presentacion;
	private static int ultimoId;
	
	
	public Producto() {
		this.id = ++ultimoId;
	}

	public Producto(String nombreProducto, String marca, int cantidadStock, String presentacion) {
		this();
		this.nombreProducto = nombreProducto;
		this.marca = marca;
        this.cantidadStock = cantidadStock;
        this.presentacion = presentacion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}
	

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	  public int getCantidadStock() {
	        return cantidadStock;
	    }

	    public void setCantidadStock(int cantidadStock) {
	        this.cantidadStock = cantidadStock;
	    }

	    public String getPresentacion() {
	        return presentacion;
	    }

	    public void setPresentacion(String presentacion) {
	        this.presentacion = presentacion;
	    }
	@Override
	public String toString() {
		return "id=" + id +
				", nombre del producto=" + nombreProducto + '\'' +
				", marca=" + marca + ", cantidad Stock=" + cantidadStock + ", presentacion="
		                + presentacion + '\'';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Producto producto = (Producto) o;
		return Objects.equals(id, producto.id);
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	
	
}

