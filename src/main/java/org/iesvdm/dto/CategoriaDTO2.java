package org.iesvdm.dto;

import java.sql.Date;
import java.util.List;

import org.iesvdm.domain.Almacen;
import org.iesvdm.domain.Categoria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDTO2 extends Categoria{
	
	private List<Almacen> listAlmacen;
	
	public CategoriaDTO2(Long id_categoria, String nombre,Date fecha, List<Almacen> listaAlm) {
		super(id_categoria, nombre, fecha);
		this.listAlmacen = listaAlm;
	}
	
}
