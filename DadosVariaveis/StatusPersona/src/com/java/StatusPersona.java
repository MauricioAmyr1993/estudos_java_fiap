package com.java;

public class StatusPersona {

	public static void main(String[] args) {
		
		// As variáveis  são compostas pelo seu nome e o tipo de informação que irá armazenar.
		// Para declará-la, primeiro é definido o tipo de e depois o nome da variável, por exemplo:
		
		// Armazenamentos de números inteiros: pode-se usar: int; short; long; byte.
		// Int: Armazenamento de até 4 bytes
		// short: 2 bytes
		// long: 8 bytes 
		// byte: 1 byte
		// Geralmente o Int é muito utilizado, mas por exemplo se optar armazenar um número grande, necessário usar long.
		// Cada tipo de armazenamento depende da necessidade e do tamanho do número inserido ali.
		int idade =10;
		// Valores Ponte Flutuante são os números que contém parte fracionária, ou seja, os números decimais.
		// Parra eles, existem dois tipos, o float e o double.
		// float: armazenamento de até 4 bytes
		// double: armazenamento de até 8 bytes
		double preco =10.0;
		// char é utilizado apenas para armazenar caractéres individuais, como letras, algarismos, sinais de pontuação, etc.
		char sexo = 'M';
		// boolean possuí somente dois valores, true or false. No Java não é possivel converter números inteiros em valores booleanos.
		boolean temFilhos = true;
		
		System.out.println(idade);
		System.out.println(preco);
		System.out.println(sexo);
		System.out.println(temFilhos);
		
		

	}

}
