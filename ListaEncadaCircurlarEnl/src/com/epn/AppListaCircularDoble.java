package com.epn;

public class AppListaCircularDoble {

	public static void main(String[] args) {
	
		
		
		ListaCircularDoble lista = new ListaCircularDoble();
		
		lista.ingresarInicio("1");
		lista.ingresarFinal("2");
		lista.ingresarInicio("A");
		
		//lista.ingresarFinal("3");
		//lista.ingresarFinal("A");
		//lista.ingresarFinal("B");
		//lista.ingresarFinal("C");
		
		
	//	lista.ingresarInicio("inicio");
		
		System.out.println(lista.Imprimir());
		System.out.println("Comprovar enlaces de inicio a fin:\n" + lista.Comprobar() );
		
		
	}

}
