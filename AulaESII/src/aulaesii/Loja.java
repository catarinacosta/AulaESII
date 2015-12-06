package TesteGB;

import java.util.Scanner;

public class Loja {
	static Scanner leia = new Scanner(System.in);
	

public static void main(String[]args){
	System.out.print("--Relacao de produtos para pesquisa de preco--\n");
    System.out.print(" 1 - Computador;\n");
    System.out.print(" 2 - Smartphone;\n");
    System.out.print(" 3 - Fone de ouvido;\n");
    System.out.print(" 4 - Relogio;\n");
    System.out.print(" 5 - PlayStation;\n");
    System.out.print("\n Informe qual produto desejado: ");
    @SuppressWarnings("unused")
	int nprod = leia.nextInt();
    
}
}