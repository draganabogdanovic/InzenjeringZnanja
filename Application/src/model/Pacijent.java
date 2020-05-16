package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Pacijent implements Serializable {

	private String ime;
	private String prezime;
	private Date datumRodjenja;
	private Karton kartonPacijenta;
}
