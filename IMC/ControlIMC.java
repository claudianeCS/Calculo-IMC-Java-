package IMC;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlIMC {
	//vai fazer a leitura do arquivo texto.
	
	private static Scanner input;
	// Variavel de Retorno,  VALORES vai receber os dados do csv
	private static ArrayList<ModelIMC> valores = new ArrayList<ModelIMC>();
    //ira retornar os valores do arquivo csv lidos  
	public ArrayList<ModelIMC> loader(String file){ // parametro 
		
		try { //codificação
			// Path e uma variavel dos sistema usada para localizar executaveis.
			input = new Scanner(Paths.get(file)); // vai aqui tentar (try) a leitura do arquivo.
			
			input.nextLine(); // Ele vai ler linha por linha, pula uma linha fazendo a leitura no vazio.
			
			while(input.hasNext()) { // aqui se faz a leitura completa do arquivo.O hasNext importa um resultado verdadeiro ou falso,ou seja, enquanto tiver algo retornara verdadeiro.
				String[] data = input.nextLine().split(";"); // quebra de linhas, e armazenar dentro do vetor do tipo String , as posições sao definidas automaticamente.
				
				ModelIMC dados = new ModelIMC();
				
				dados.setNome(data[0]);
				dados.setSobrenome(data[1]);
				data[2] = data[2].replaceAll(",","."); // substitui o , para o . 
				data[3] = data[3].replaceAll(",",".");
				dados.setPeso(Double.valueOf(data[2]).doubleValue());
				dados.setAltura(Double.valueOf(data[3]).doubleValue()); // Converteu de String para Double
				
				valores.add(dados); // em quanto for verdadeiro ele ira retornar valores a variavel VALORES.
			}
			
		
		}catch(Exception e){
			System.out.println("Erro!" + e.getMessage());
		}
		return valores;
	}
}
