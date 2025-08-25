package Implementacion;

import java.util.HashMap;

import Dominio.Medicamentos;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {
	
	private HashMap<String, Medicamentos> hashMap = new HashMap<String, Medicamentos>();

	@Override
	public void guardar(Medicamentos medicamento) {
		// TODO Auto-generated method stub
		hashMap.put(medicamento.getMarca(), medicamento);
		
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.print(hashMap);
		
	}

	@Override
	public Medicamentos buscar(String nombre) {
		// TODO Auto-generated method stub
		return hashMap.get(nombre);
	}

	@Override
	public void editar(Medicamentos medicamento) {
		// TODO Auto-generated method stub
		hashMap.put(medicamento.getNombre(), medicamento);
		
	}

	@Override	
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		hashMap.remove(nombre);
		
	}

	public HashMap<String, Medicamentos> getHashMap() {
		return hashMap;
	}

	public void setHashMap(HashMap<String, Medicamentos> hashMap) {
		this.hashMap = hashMap;
	}
	
	

}
