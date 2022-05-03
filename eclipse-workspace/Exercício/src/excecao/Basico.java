package excecao;

public class Basico {
public static void main(String[] args) {
	
	Aluno A1 = null;


try {
	imprimirNomeDoAluno(A1);
} catch (Exception e) {

	System.out.println("Ocorreu um erro no momento"
			+ "de imprimir o nome do usuário "+e.getLocalizedMessage());
}
try {
	System.out.println(7/0);
} catch (Exception e) {
	
	System.out.println("Ocorreu um erro: "+ e.getMessage());
	
}

System.out.println("Fim");


}




public static void imprimirNomeDoAluno(Aluno aluno) {
	System.out.println(aluno.nome);
}}

