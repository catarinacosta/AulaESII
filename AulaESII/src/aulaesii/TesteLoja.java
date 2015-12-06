package TesteGB;

public class TesteLoja {

	private static int calc(int n) {
		  int response = 0;
		  switch (n){
		  	case 1:
		  		response = 2000;
		  		break;
		  	case 2:
		  		response = 1000;
		  		break;
		  	case 3:
		  		response = 80;
		  		break;
		  	case 4:
		  		response = 300;
		  		break;
		  	case 5:
		  		response = 4000;
		  		break;
		  }
	    return response;
	  
	}
	public static void main(String[]args){
		TesteLoja teste = new TesteLoja();
		System.out.println("preco"+ teste.calc(n));
	}
}
