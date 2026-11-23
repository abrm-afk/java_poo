package p1;
import java.util.ArrayDeque;
import java.util.Iterator;

public class Empilement {
	private ArrayDeque<Bloc> pileblocs;
	public Empilement() {
		this.pileblocs = new ArrayDeque<>();
	}
	
	public double getHauteur() {
		double h=0;
		Iterator<Bloc> it = pileblocs.iterator();
		while(it.hasNext()) {
			Bloc b = it.next(); 
			h=+b.getHauteur();//celle de cube
			//le type bloc ne peut pas etre stocke dans un double
		}
		return h;
	}

	public void ajouterBloc(Bloc c) throws EmplimentImpossibleException {
		if(!c.estEmpilable()) {
			throw new EmplimentImpossibleException("Ce bloc n'est pas empilable");
		}
		
		if(!pileblocs.isEmpty()) {
			Bloc sommetActuel = pileblocs.peek();
			 if (!sommetActuel.estEmpilable()) { // On appelle sur sommetActuel (qui est un Bloc)
		            throw new EmplimentImpossibleException("Le sommet empêche l'ajout.");
		}
		pileblocs.push(c);
	}
}	



public Bloc retirerBloc() {
	return pileblocs.pop();
}
}