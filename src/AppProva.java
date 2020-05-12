import java.util.ArrayList;
import java.util.Scanner;

import model.QuestaoMultiplaEscolha;
import model.QuestaoSilples;
import model.QuestaoComDica;



public class AppProva {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		/*QuestaoSimples prova[] = new QuestaoSimples[5];
		prova[0] = new QuestaoSimples("Quem descobriu o Brasa?","PA Cabral");
		prova[1] = new QuestaoComDica("Qual a linguagem deste curso?", "JAVA", "Comeca com JA e termina com VA");
	   */
		ArrayList<QuestaoSilples> prova = new ArrayList<QuestaoSilples>();
		prova.add(new QuestaoSilples("Quem descobriu o Brasa?","PA Cabral"));
		prova.add(new QuestaoComDica("Qual a cor do cavalo branco de Napoleao?","Marrom","Nao confunda cor com nome"));
		prova.add(new QuestaoMultiplaEscolha("Qual a formula da agua?", "H2O", "H2SO4", "NaCl", "H2O", "H2OH"));
		prova.add(new QuestaoSilples("Quanto vale 2+2?","4"));
		prova.add(new QuestaoComDica("Qual a linguagem do nosso curso?","JAVA","Comeca com JA e termina com VA"));
		
		int pontos=0;
		String resp;
		for (QuestaoSilples questao : prova) {    // for (int i=0; i<prova.size; i++) 
			                                      //    QuestaoSimples questao = prova.get(i);
			System.out.println(questao.aplicarQuestao());
			resp = teclado.nextLine();
			if (questao.corrigir(resp)) {
				pontos++;
			}
			else {
				System.out.println("Errrrrroooooooooooouuuuu");
			}
		}
		System.out.println("Sua pontuacao foi "+pontos+"/"+prova.size());
		teclado.close();
		
	}

}
