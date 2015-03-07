package prova;

import java.util.ArrayList;

import it.proloco.dm.Event;
import it.proloco.dm.Stand;

public class Prova 
{
	public static void main(String[] args) 
	{
		// 1. 	Creo una nuova istanza di tipo Event		
		// 		e la "chiamo" evento1
		Event evento1 = new Event(); 
		
		// 2. 	Imposto il nome di evento1 
		evento1.setName("Festa del Vino");
		
		// 3. 	Creo una nuovo istanza di tipo Stand
		//		e la chiamo "stand1".
		// 		Successivamente gli imposto il nome, 
		//		latitudine e longitudine
		Stand stand1 = new Stand();
		stand1.setName("Da Sir Picone");		
		stand1.setLat(2136126135.213123);
		stand1.setLon(999292.213123);
		
		// 4. 	Creo una nuovo istanza di tipo Stand
		//		e la chiamo "stand2".
		// 		Successivamente gli imposto il nome.		
		Stand stand2 = new Stand();
		stand2.setName("Classe San Biagio");
		
		// 5.	Aggiungo i due stand all'evento1
		evento1.addStand(stand1);
		evento1.addStand(stand2);
		
		// 6. 	Mi faccio dare, dall'evento1, gli stand che ho appena impostato
		ArrayList<Stand> standsOfEvent1 = evento1.getStands();

		// 7. 	Li scorro e per ogni stand stampo nome, 
		// 		latitudine e longitudine.
		for (Stand stand : standsOfEvent1) {
			String nameOfStand = stand.getName();

			double latitude = stand.getLat(); 
			double longitude = stand.getLon();
			
			String msg1 = "Nome: " + nameOfStand;
			String msg2 = "Latitudine: " + latitude;
			String msg3 = "Longitudine: " + longitude;
			
			System.out.println("*********");
			System.out.println(msg1);
			System.out.println(msg2);
			System.out.println(msg3);
		}
	}
}
