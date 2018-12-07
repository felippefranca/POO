package prova_n2;

import java.util.Comparator;

public class ComparadorId implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa arg0, Pessoa arg1) {
		//return arg0.getId() - arg1.getId();
		return Integer.compare(arg0.getId(), arg1.getId());
	}
	

}
