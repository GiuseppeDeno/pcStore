package com.example.demo;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyControllerPc {
	//istanziamo un arraylist di pc
	
	ArrayList<pc> listaPc= new ArrayList<>();
	ArrayList<pcSelezionati> prodottiSelezionati = new ArrayList<>();
	    //meglio istanziare le arrayList globalmente
	
	 @GetMapping("/")  
	public String getIndex(Model m1) {
		 
		 listaPc.clear();
		
		 listaPc.add(new pc("1115G4","Lenovo"," Computer portatile" ,599.00,"https://m.media-amazon.com/images/I/51gChMl9iCL._AC_UL320_.jpg"));
		 listaPc.add(new pc("Aspire 3 A315-24P-R8DK","Acer"," Computer portatile Intel Core i7 12Th, 10 cORe, Ram 16Gb, SSD 512Gb +" ,499.00,"https://m.media-amazon.com/images/I/51325dqOYYL._AC_.jpg"));
		 listaPc.add(new pc("HP 250 G9","HP"," Computer portatile Intel Core i7 12Th, 10 cORe, Ram 16Gb, SSD 512Gb +" ,779.00,"https://m.media-amazon.com/images/I/81xqvUfqVKL._AC_SX679_.jpg"));
		 listaPc.add(new pc("STGsivir ","STGsivir"," Computer fisso Core i7 3.9GHz, 16G RAM, 1T SSD, WiFi 600 M, BT 5.0" ,500.00,"https://m.media-amazon.com/images/I/91N+LyACm0L._AC_SX679_.jpg"));
		
		 String nome= "pc";
		 m1.addAttribute("nome", nome);  
		  return "index";
		 
		 
		 
		 
	}
	 @GetMapping("/listaPcStore")
	  public String getLista(Model m1) {
		 m1.addAttribute("lista", listaPc);
		 
		 return "store";
		 
		 
	 }
	 @PostMapping("/process")
	 public String getPcSelezionati(@RequestParam("nome") ArrayList<String> nomi, 
	                                @RequestParam("num") ArrayList<Integer> numeri, Model m1) {
		 
		  prodottiSelezionati.clear();
	    	
	    	
	    	int somma=0;
	        for (int i = 0; i < nomi.size(); i++) {
	        	
	            if (numeri.get(i) >0) {
	                // Trova il prodotto corrispondente aggiungendolo ai prodotti selezionati
	            	//qui potrei fare la somma del costo dei prodotti selezionati somma+=numeri.get(i)*nomi.get(i)  dopo aver istanziato somam
	                somma += numeri.get(i)*listaPc.get(i).prezzo;
	                //stampa in console 
	                System.out.println("il costo totale è : " +somma);
	                
	              
	               
	                prodottiSelezionati.add(new pcSelezionati(listaPc.get(i).nome,listaPc.get(i).marca,listaPc.get(i).descrizione, listaPc.get(i).prezzo, listaPc.get(i).url,numeri.get(i)));
	               
	            }
	        }
	        
	       m1.addAttribute("sommaTotale", somma);
	        
	        m1.addAttribute("prodottiSelezionati", prodottiSelezionati);
	        //aggiungo al model listaProdotti tramite la chiave(?) lista nel caso in cui voglia stampare anche il catalogo di prodotti
	         m1.addAttribute("lista", listaPc);
	        return "stampaCarrello"; 
	        
		 
		
		 
	 }
	 

}
