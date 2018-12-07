package prova_n2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Agenda  {

	Set<Pessoa> agenda = new HashSet<>();
	
	public void addcontato(Pessoa p) {	
		agenda.add(p);
}


public void removecontato(Pessoa p) {
	agenda.remove(p);
}
//remove contato implementando erro em caso de falha  de contato inexistente
public void removepornome (String nome)throws  ContatoNotFound { //throws  ContatoNotFound 
	for (Pessoa x : agenda) {
		if (x.getNome().equals(nome)) {
			removecontato(x);
			//throw new ContatoNotFound("ERRO: NOME NAO CONSTA NA AGENDA");
			return;
			}
		}
	throw new ContatoNotFound("ERRO: NOME NAO CONSTA NA AGENDA");			
	}	
	
	
	


public void listacontato() {
	for (Pessoa x : agenda) {
		System.out.println(x);
	}
}


public void atualizacontato(Pessoa p,String nome , String fone ,String email) {
	p.setNome(nome);
	p.setFone(fone);
	p.setEmail(email);

}


public void atualizapornome(String nome , String fone , String email ) {
	for (Pessoa x : agenda) {
		if (x.getNome().equals(nome)) {
			x.setFone(fone);
			x.setEmail(email);
		}
	}
}

public void atualizaporemail(String nome , String fone , String email ) {
	for (Pessoa x : agenda) {
		if (x.getEmail().equals(email)) {
			x.setFone(fone);
			x.setNome(nome);
		}
	}
}


public void listanome() {
	ComparadorNome comparanome = new ComparadorNome();
	//
	List<Pessoa> comparavel = hashTolist(agenda);
	Collections.sort(comparavel, comparanome);
	//testando com iterator
	Iterator<Pessoa> i =  comparavel.iterator();
	while (i.hasNext()) {
	Pessoa z = i.next();
	System.out.println(z);
	}
	//for (Pessoa x : comparavel) {
		//System.out.println(x);
	//}
}



public void listaid() {
	ComparadorId comparaid = new ComparadorId();
	List<Pessoa> comparavel = hashTolist(agenda);
	Collections.sort(comparavel, comparaid);
	//
	for (Pessoa x : comparavel) {
		System.out.println(x);
	}
	
}

public List<Pessoa> hashTolist(Set<Pessoa> agenda) {
	List<Pessoa> contatos = new ArrayList<Pessoa>();
	for (Pessoa contato : agenda) {
		contatos.add(contato);
	}
	return contatos;
}


	
}	
	