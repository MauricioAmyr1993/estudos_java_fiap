package com.java.oprlgc;

public class OperadorLogico {

	public static void main(String[] args) {
		
		int idade = 20;
		
		boolean precisaVotar = idade >= 18 && idade < 70;
		
		// utilizamos os operadores de comparação >= para representar maior/igual
		// o mesmo seria se fossemos representar <= para menor/igual
		// utilizamos o operador && (o "e" comercial) para representar "and" e o "&" como ele mesmo
		
		System.out.println(precisaVotar);

	}

}
