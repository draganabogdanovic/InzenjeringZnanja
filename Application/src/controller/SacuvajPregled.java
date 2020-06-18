package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class SacuvajPregled implements Serializable{
	public ArrayList<String> listaSimptoma;
	public Date datumPregleda;
	public ArrayList<String> listaLekova;
	public ArrayList<String> listaTerapija;
}
