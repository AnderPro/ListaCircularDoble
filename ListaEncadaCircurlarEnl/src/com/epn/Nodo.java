package com.epn;

public class Nodo {
	String dato;
	private Nodo siguiente;
	private Nodo anterior;
	
	
	public Nodo(String dato,Nodo despues,Nodo atras ){
		this.dato=dato;
		this.siguiente = despues;
		this.anterior=atras;
	}
	public Nodo(String dato){
		
		this(dato,null,null);//primer Nodo
	}
	
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	
	public Nodo getAtras() {
		return anterior;
	}
	
	public void setAtras(Nodo atras) {
		this.anterior = atras;
	}
	public Nodo getDespues() {
		return siguiente;
	}
	public void setDespues(Nodo despues) {
		this.siguiente = despues;
	}
	@Override
	public String toString() {
		return "Nodo [dato=" + dato;
	}
	
	
	
	

}
