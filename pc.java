package com.example.demo;


public class pc {
  public   String nome;          // Nome del PC, es. "iMac"
  public  String marca;         // Marca del PC, es. "Apple"
  public  String descrizione;   // Descrizione del PC, es. "M3, 500 giga"
  public   double prezzo;        // Prezzo del PC
  public   String url;           // URL dell'immagine o del prodotto
    
    // Costruttore
    public pc(String nome, String marca, String descrizione, double prezzo, String url) {
        this.nome = nome;
        this.marca = marca;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.url = url;
    }
    
    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Metodo toString per stampare le informazioni del PC
    @Override
    public String toString() {
        return "Pc{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", url='" + url + '\'' +
                '}';
    }
}

//nuovo esercizio
//https://docs.google.com/document/d/1o5HUBKbSMW47izANBjKZh-JTEnpJcMkcFx05ZVkp7ic/edit?tab=t.0
//1 creare un nuovo progetto springboot che abbia come dipedente:
//_ spring devtools
//_ spring web
//_ thymleaf
//
//2 creare una classe pc che abbia 
//un nome (imac) (string)
//una marca (apple)(string)
//una descrizione (m3, 500 giga)(string)
//un prezzo (double)
//una url (string)
//
//creare un controller dove alla rotta (“localhost:8080”) viene istanziato un arraylist di pc e inserite 4-5 pc,
//e viene ritornato un template al quale passiamo la lista
//Nel template stampare la lista di pc (o come tabella o come un insieme di card)
//la lista rappresenta un form dove è possibile selezionare più di un prodotto alla volta della lista.
//il form ha una rotta (es. “/process) che viene gestita nel controller e va a stampare i prodotti selezionati.

