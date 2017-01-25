package com.epn;



public class ListaCircularDoble {
	
	private Nodo inicio;
	private Nodo fin;
	private int tama�o;
	
	public ListaCircularDoble() {
		super();
		//crear la lista con un primer nodo
		this.inicio = null;
		this.fin = null;
		this.tama�o=0;
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
			tama�o++;
		}else{
			Nodo aux = new Nodo(dato,inicio,fin);
			
			inicio.setAtras(aux);
			fin.setDespues(aux);
			inicio=aux;
			
			
			
			
		
			tama�o ++;
			
			
		}
		

	}
	
	public void ingresarFinal(String dato){
		if(estaVacia()){
			inicio= new Nodo(dato,null,null);
			fin=inicio;
			tama�o ++;
		}else{
			Nodo aux = new Nodo(dato,inicio,fin);
			inicio.setAtras(aux);
			fin.setDespues(aux);
			
			fin=aux;
			
		
			tama�o ++;
		}
		
	}
	
	public String Imprimir(){
		String salida=" ";
		if(estaVacia()){
			
			
			salida+="la lista esta vac�a";
		}else{
			
			Nodo aux =inicio;
			for (int i = 0; i!= tama�o; i++) {
				salida+=aux.getDato();
				
				salida+="\n";
				
				aux=aux.getDespues();
				
			}
			}
			
		return 	salida + "\ntama�o" + tama�o;
			
		}
		
		
	

public String Comprobar(){
	String salida= "";
	
	salida+= fin.getAtras()+"\n";
	salida+= inicio.getDespues();
	return salida;
}

	
	
}
	
	
	
	
	
	


