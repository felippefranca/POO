package prova_n2;



public class TestaProva  {

	public static void main(String[] args) throws ContatoNotFound {
		
		Agenda contatos = new Agenda();
		
		Pessoa p1 = new Pessoa(1,"Joao","8888-8888","joao@gmail.com");
		Pessoa p2 = new Pessoa(2,"Ana","9999-8888","ana@gmail.com");
		Pessoa p3 = new Pessoa(3,"Pedro","8888-8888","pedro@gmail.com");
		
		contatos.agenda.add(p1);
		contatos.agenda.add(p2);
		contatos.addcontato(p3);
		
		//1ª listagem dos contatos adicionados
		contatos.listacontato();
		System.out.println();
				
		contatos.atualizapornome("Ana", "1111-8888", "ananew@gmail.com");
		
		//2ª listagem dos contatos apos atualizaçao
		contatos.listacontato();
		System.out.println();
				
		// tentando apagar um nome que nao existe(execao criada )
		//se add nome que faz parte, sera apagado
		try {			
			contatos.removepornome("Joao1");
		}catch (ContatoNotFound e) {
		System.out.println(e.getMessage());
		System.out.println();
		}
					
					
		
		//lista apos remoçao ou nao remoçao
		contatos.listacontato();
		System.out.println();
				
		
		
		//contatos.addcontato(p2);
		//contatos.listacontato();
		System.out.println("NOME");
		contatos.listanome();
		System.out.println();	
				
	//listagem classificada por id
		System.out.println("ID");
		contatos.listaid();
		
		
	}

}
