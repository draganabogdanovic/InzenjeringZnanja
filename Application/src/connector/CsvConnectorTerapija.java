package connector;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collection;
import java.util.LinkedList;

import cbr.Lekovi;
import cbr.StringListMapper;
import ucm.gaia.jcolibri.cbrcore.CBRCase;
import ucm.gaia.jcolibri.cbrcore.CaseBaseFilter;
import ucm.gaia.jcolibri.cbrcore.Connector;
import ucm.gaia.jcolibri.exception.InitializingException;
import ucm.gaia.jcolibri.util.FileIO;

public class CsvConnectorTerapija implements Connector
{

	
	@Override
	public Collection<CBRCase> retrieveAllCases()
	{
		LinkedList<CBRCase> cases = new LinkedList<CBRCase>();

		try
		{
			//BufferedReader br = new BufferedReader(new InputStreamReader(FileIO.openFile("data/cases_therapy.csv")));
			
			BufferedReader br = new BufferedReader(new InputStreamReader(FileIO.openFile("data/terapija.csv")));
			
			if (br == null)
				throw new Exception("Error opening file");

			String line = "";
			while ((line = br.readLine()) != null)
			{
				if (line.startsWith("#") || (line.length() == 0))
					continue;
				String[] values = line.split(";");

				CBRCase cbrCase = new CBRCase();

				//Terapija t = new Terapija(line);
				Lekovi l = new Lekovi();
				l.setLek(values[0]);
				l.setBolesti(StringListMapper.toList(values[1]));
				
				cbrCase.setDescription(l);
				cases.add(cbrCase);
			}
			br.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return cases;
	}

	@Override
	public Collection<CBRCase> retrieveSomeCases(CaseBaseFilter arg0)
	{
		return null;
	}

	@Override
	public void storeCases(Collection<CBRCase> arg0)
	{
	}

	@Override
	public void close()
	{
	}

	@Override
	public void deleteCases(Collection<CBRCase> arg0)
	{
	}

	@Override
	public void initFromXMLfile(URL arg0) throws InitializingException
	{
	}

}




