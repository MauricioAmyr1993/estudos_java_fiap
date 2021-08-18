package com.java;

public class StatusPersona {

	public static void main(String[] args) {
		
		// As vari�veis  s�o compostas pelo seu nome e o tipo de informa��o que ir� armazenar.
		// Para declar�-la, primeiro � definido o tipo de e depois o nome da vari�vel, por exemplo:
		
		// Armazenamentos de n�meros inteiros: pode-se usar: int; short; long; byte.
		// Int: Armazenamento de at� 4 bytes
		// short: 2 bytes
		// long: 8 bytes 
		// byte: 1 byte
		// Geralmente o Int � muito utilizado, mas por exemplo se optar armazenar um n�mero grande, necess�rio usar long.
		// Cada tipo de armazenamento depende da necessidade e do tamanho do n�mero inserido ali.
		int idade =10;
		// Valores Ponte Flutuante s�o os n�meros que cont�m parte fracion�ria, ou seja, os n�meros decimais.
		// Parra eles, existem dois tipos, o float e o double.
		// float: armazenamento de at� 4 bytes
		// double: armazenamento de at� 8 bytes
		double preco =10.0;
		// char � utilizado apenas para armazenar caract�res individuais, como letras, algarismos, sinais de pontua��o, etc.
		char sexo = 'M';
		// boolean possu� somente dois valores, true or false. No Java n�o � possivel converter n�meros inteiros em valores booleanos.
		boolean temFilhos = true;
		
		System.out.println(idade);
		System.out.println(preco);
		System.out.println(sexo);
		System.out.println(temFilhos);
		
		

	}

}
