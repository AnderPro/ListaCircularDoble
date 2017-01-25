package com.epn;



public class ListaCircularDoble {
	
	private Nodo inicio;
	private Nodo fin;
	private int tamaño;
	
	public ListaCircularDoble() {
		super();
		//crear la lista con un primer nodo
		this.inicio = null;
		this.fin = null;
		this.tamaño=0;
	}


	public ListaCircularDoble(Nodo cabeza, Nodo cola) {
		this.inicio= cabeza;
		this.fin= cola;
		
	}
	public boolean estaVacia(){
		return inicio==null;
	}
	public void ingresarInicio(String dato){
		if(estaVacia()){
			fin= new Nodo(dato,null,null);
			inicio=fin;
			tamaño++;
		}else{
			Nodo aux = new Nodo(dato,inicio,fin);
			
			inicio.setAtras(aux);
			fin.setDespues(aux);
			inicio=aux;
			
			
			
			
		
			tamaño ++;
			
			
		}
		

	}
	
	public void ingresarFinal(String dato){
		if(estaVacia()){
			inicio= new Nodo(dato,null,null);
			fin=inicio;
			tamaño ++;
		}else{
			Nodo aux = new Nodo(dato,inicio,fin);
			inicio.setAtras(aux);
			fin.setDespues(aux);
			
			fin=aux;
			
		
			tamaño ++;
		}
		
	}
	
	public String Imprimir(){
		String salida=" ";
		if(estaVacia()){
			
			
			salida+="la lista esta vacía";
		}else{
			
			Nodo aux =inicio;
			for (int i = 0; i!= tamaño; i++) {
				salida+=aux.getDato();
				
				salida+="\n";
				
				aux=aux.getDespues();
				
			}
			}
			
		return 	salida + "\ntamaño" + tamaño;
			
		}
		
		
	

public String Comprobar(){
	String salida= "";
	
	salida+= fin.getAtras()+"\n";
	salida+= inicio.getDespues();
	return salida;
}

	
	
}
	
	
	
	
	
	


