package prova;

import java.util.ArrayList;

import it.proloco.dm.Event;
import it.proloco.dm.Stand;

public class Prova 
{
	public static void main(String[] args) 
	{
		// 1. Istanzio event
		// <Classe> nomeVariabile = new <Classe>();
		
		Event evento1 = new Event(); 
		evento1.setName("Festa del Vino");
		
		Stand stand1 = new Stand();
		stand1.setName("Da Sir Picone");
		stand1.setLat(2136126135.213123);
		stand1.setLon(999292.213123);
		
		Stand stand2 = new Stand();
		stand2.setName("Classe San Biagio");
		
		evento1.addStand(stand1);
		evento1.addStand(stand2);
		
		ArrayList<Stand> standsOfEvent1 = evento1.getStands();
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
