package controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Dictionary;

public class ResourceManager {
	public static void save1(Dictionary d, String fileName) throws Exception{
		try (ObjectOutputStream oos=new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))){
			oos.writeObject(d);
		}
	}
	
	public static void save(Serializable data, String fileName) throws Exception{
		try (ObjectOutputStream oos=new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))){
			oos.writeObject(data);
		}
	}
	
	public static Object load(String fileName) throws Exception{
		try (ObjectInputStream ois=new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))){
			return ois.readObject();
		}
	}
}
