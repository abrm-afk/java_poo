package p1;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Empilement2 {
	public ArrayDeque<Bloc> blocs;

	public Empilement2() {
		this.blocs = new ArrayDeque<>();
	}
	public double getHauteur() {
		double h=0;
		Iterator <Bloc>it = blocs.iterator();
		while(it.hasNext()) {
			Bloc c = it.next();
			h+=c.getHauteur();
		}
		return h;
	}
	public void ajouterBloc(Bloc c) throws EmplimentImpossibleException{
		if(!c.estEmpilable()) {
			throw new EmplimentImpossibleException("Ce bloc n'est pas empilable");
		}if(!blocs.isEmpty()) {
			
		}
	}
}
