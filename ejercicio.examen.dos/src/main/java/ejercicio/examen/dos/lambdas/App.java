package ejercicio.examen.dos.lambdas;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceWithTwoParameters();
		interfaceWithoutParameters();
	}

	public static void interfaceWithTwoParameters() {
		String word1 = "Hola ";
		String word2 = "Nadia";
		
		InterfaceLambdaTwoParameters interfaceConcat = (w1,w2)->{
			return word1.concat(word2);
		};
		
		System.out.println(interfaceConcat.concat(word1, word2));
	}
	
	public static void interfaceWithoutParameters() {
		InterfaceWithoutParameters interfaceNoParameters = ()-> System.out.println("Te van a subir el sueldo 10.000€ mensuales");
		interfaceNoParameters.diCuantoMeVanASubirElSueldoPorHacerEsteEjercicio();
	}
}
