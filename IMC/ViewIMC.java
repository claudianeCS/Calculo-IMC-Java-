package IMC;

import java.util.ArrayList;

public class ViewIMC {
	
	public static void main(String[] args) { // faz acontecer 
		ArrayList<ModelIMC> valores = new ControlIMC().loader("C:\\Users\\claudiane\\Desktop\\dadosTeste.csv");
		
		for(ModelIMC  n : valores) {
			double soma;
			 soma = n.getPeso() / (n.getAltura() * n.getAltura());
			 String resultado = String.format("%.2f", soma); //formatou as casas depois do . em ate duas casas decimais.
			System.out.println(n.getNome().toUpperCase() + " " + n.getSobrenome().toUpperCase() +  " "  +  resultado);
		}
	}

}
