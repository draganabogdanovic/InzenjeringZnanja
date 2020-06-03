package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import view.NoviPacijent;



public class Karton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Pacijent> listaPacijenata;
	private static Karton instance;

	public Karton()
	{
		listaPacijenata = new ArrayList<Pacijent>();
	}

	public ArrayList<Pacijent> getListaPacijenta()
	{
		return listaPacijenata;
	}

	public String toString()
	{
		return "Zdravstveni kartoni";
	}

	public void setListaPacijenta(ArrayList<Pacijent> listaPacijenta)
	{
		this.listaPacijenata = listaPacijenta;
	}

	public static Karton getInstance()
	{
		if (instance == null)
		{
			instance = new Karton();

		}
		return instance;
	}

	public void dodajPacijenta(Pacijent noviPac)
	{
		// if(!(listaPacijenata.contains(p))) {
		listaPacijenata.add(noviPac);
		// MainFrame.getInstance().revalidate();
		// }
	}

	public void dodajKarton(Pacijent p, PregledPacijenta pregled)
	{

		for (Pacijent x : this.listaPacijenata)
		{
			if (x.getBrLicneKarte() == p.getBrLicneKarte())
			{
				x.addPregled(pregled);
			}
		}
	}

	public ArrayList<Pacijent> getListaPacijenata()
	{
		return listaPacijenata;
	}

	public void setListaPacijenata(ArrayList<Pacijent> listaPacijenata)
	{
		this.listaPacijenata = listaPacijenata;
	}

	public boolean add(Pacijent arg0)
	{
		return listaPacijenata.add(arg0);
	}

	public void add(int arg0, Pacijent arg1)
	{
		listaPacijenata.add(arg0, arg1);
	}

	public boolean addAll(Collection<? extends Pacijent> arg0)
	{
		return listaPacijenata.addAll(arg0);
	}

	public boolean addAll(int arg0, Collection<? extends Pacijent> arg1)
	{
		return listaPacijenata.addAll(arg0, arg1);
	}

	public void clear()
	{
		listaPacijenata.clear();
	}

	public Object clone()
	{
		return listaPacijenata.clone();
	}

	public boolean contains(Object arg0)
	{
		return listaPacijenata.contains(arg0);
	}

	public boolean containsAll(Collection<?> arg0)
	{
		return listaPacijenata.containsAll(arg0);
	}

	public void ensureCapacity(int arg0)
	{
		listaPacijenata.ensureCapacity(arg0);
	}

	public boolean equals(Object arg0)
	{
		return listaPacijenata.equals(arg0);
	}

	public void forEach(Consumer<? super Pacijent> arg0)
	{
		listaPacijenata.forEach(arg0);
	}

	public Pacijent get(int arg0)
	{
		return listaPacijenata.get(arg0);
	}

	public int hashCode()
	{
		return listaPacijenata.hashCode();
	}

	public int indexOf(Object arg0)
	{
		return listaPacijenata.indexOf(arg0);
	}

	public boolean isEmpty()
	{
		return listaPacijenata.isEmpty();
	}

	public Iterator<Pacijent> iterator()
	{
		return listaPacijenata.iterator();
	}

	public int lastIndexOf(Object arg0)
	{
		return listaPacijenata.lastIndexOf(arg0);
	}

	public ListIterator<Pacijent> listIterator()
	{
		return listaPacijenata.listIterator();
	}

	public ListIterator<Pacijent> listIterator(int arg0)
	{
		return listaPacijenata.listIterator(arg0);
	}

	public ArrayList<Pacijent> obrisiPacijenta(Pacijent pac)
	{
		listaPacijenata.remove(pac);
		return listaPacijenata;
	}

	public boolean remove(Object arg0)
	{
		return listaPacijenata.remove(arg0);
	}

	public boolean removeAll(Collection<?> arg0)
	{
		return listaPacijenata.removeAll(arg0);
	}

	public boolean removeIf(Predicate<? super Pacijent> arg0)
	{
		return listaPacijenata.removeIf(arg0);
	}

	public void replaceAll(UnaryOperator<Pacijent> arg0)
	{
		listaPacijenata.replaceAll(arg0);
	}

	public boolean retainAll(Collection<?> arg0)
	{
		return listaPacijenata.retainAll(arg0);
	}

	public Pacijent set(int arg0, Pacijent arg1)
	{
		return listaPacijenata.set(arg0, arg1);
	}

	public int size()
	{
		return listaPacijenata.size();
	}

	public void sort(Comparator<? super Pacijent> arg0)
	{
		listaPacijenata.sort(arg0);
	}

	public Spliterator<Pacijent> spliterator()
	{
		return listaPacijenata.spliterator();
	}

	public List<Pacijent> subList(int arg0, int arg1)
	{
		return listaPacijenata.subList(arg0, arg1);
	}

	public Object[] toArray()
	{
		return listaPacijenata.toArray();
	}

	public <T> T[] toArray(T[] arg0)
	{
		return listaPacijenata.toArray(arg0);
	}

	public void trimToSize()
	{
		listaPacijenata.trimToSize();
	}
}
