package prova_n2;

import java.util.Comparator;

public class ComparadorNome implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa arg0, Pessoa arg1) {
		return arg0.getNome().compareTo(arg1.getNome());
		}

}
