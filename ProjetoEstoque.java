package Conectar;

import java.util.Scanner;

public class ProjetoEstoque {

	public static void main(String[] args) {

		int tamanhoEstoque = 5;
		
		Scanner opcao = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("Escolha uma opcao: \n ");
		
		System.out.println(" Opcao1:Incluir produto\n");
		
		System.out.println(" Opcao2:Atualizar Produto \n ");
		
		System.out.println("Opcao3: Excluir o Produto\n ");
		
		System.out.println(" Opcao4: Sair do Programa: \n ");
		
		String escolha = opcao.nextLine();
		
		switch (escolha) {
			
			case "1":
				Scanner sc = new Scanner(System.in);
				
				String [] produto = new String[tamanhoEstoque];
				for (int i=0; i < produto.length; i++) {
				System.out.println("Digite o novo produto");
					produto[i]= sc.nextLine();
				}
		          
				 Double [] precoProduto = new Double [tamanhoEstoque];
				 
				 for ( int i=0; i< precoProduto.length; i++) {
					 
					 System.out.println(" Digite o produto");
				 }
		}
		
	}

}
