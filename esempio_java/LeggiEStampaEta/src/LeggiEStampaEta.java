/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author puntogil
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeggiEStampaEta
{
	public static void main (String args[]){
		// Impostazione per lo standard input
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		int eta;
		String testoletto;
		try {
			System.out.println("Digità la tua età: ");
			testoletto = tastiera.readLine();
			eta = Integer.valueOf(testoletto).intValue();
		} catch (Exception e) {
			System.out.println("\nNon hai digitato nessun numero!");
			return;
		}
		System.out.println("La tua eta è: " + eta);
	}
}

