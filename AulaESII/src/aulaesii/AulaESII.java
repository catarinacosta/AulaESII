/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaesii;

/**
 *
 * @author Catarina
 */
public class AulaESII {
	
	Ufac u = new Ufac();

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma();
		System.out.println("Resultado = " + soma);
		
	}
	
	boolean ufac() {
		
		String s = u.teste();
		return s.equals("UFAC");
		
	}
	
}
