package interfaceTP;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
		
		Cercle c = new Cercle(2);
		c.calculerPerimetre();
		
		
		Rectangle r = new Rectangle(4,4);
		r.calculerSurface();
		
		Animal l = new Chat();
		Animal m = new Chien();
		
		List<Animal> animaux = new ArrayList<Animal>();
		
		animaux.add(l);
		animaux.add(m);
		
		for (Animal animal : animaux) {
			animal.dormir();
			animal.manger();
			
		}
		
		Vehicule v = new Voiture("bmw", "idk", 2020, 4);
		Vehicule a = new Avion();
		
		v.demarrer();
		a.voler();
 		
		
		Jouable g = new Guitar();
		Jouable p = new Piano();
		Jouable b = new Batterie();
		List <Jouable> instruments = new ArrayList<Jouable>();
		
		
		instruments.add(g);
		instruments.add(p);
		instruments.add(b);
		
		for(Jouable instrument : instruments) {
			instrument.jouer();
		}
		
		Rechargeable s = new Smartphone("samsung", 2);
		Rechargeable hp = new OrdinateurPortable("hp", 4);
		
		
		List<Rechargeable> apps = new ArrayList<Rechargeable>();
		apps.add(s);
		apps.add(hp);
		
		for (Rechargeable app: apps) {
			app.recharger();
		
			
		}

}
}
