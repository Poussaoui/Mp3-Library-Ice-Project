package Generated;
import java.util.ArrayList;
import Ice.Current;

public class PlayerArcI extends Generated.Player._arcDisp {


	//*****************************
	private static final long serialVersionUID = 5536627696593511180L;
	
	private ArrayList<Son> listOfSon = new ArrayList<Son>();
			public ArrayList<Son> getlistOfSon() {
			return listOfSon;
	}

	public void setlistOfSon(ArrayList<Son> listOfSon) {
		this.listOfSon = listOfSon;
	}
		
	private Son findSonListByName(String name){
		for (Son mp3 :listOfSon){
			if (mp3.getNom().equals(name)){
				return mp3;
			}
		}
		return null;
	}
		
	private Son findSonInListById(int id){
		for (Son mp3 :listOfSon){
			if (mp3.getId() == id){
				return mp3;
			}
		}
		return null;
	}
		
		
	public void supprimerSonMP3(String name, Current __current){
		if(!findSonListByName(name).equals(null)){
			listOfSon.remove(name);
		}
	}
	//**********************END OF Son******************
	/**
	* Ajouter un son MP3 dans la arrayList
	*/

//************************************************

	@Override
	public float[] findSonByName(String name, Current __current) {
		/*
		if(!findSonListByName(nom).equals(null)){
			return findSonListByName(nom).getSonMP3();
		}
		return null;
		*/
		//********For Test********
		float[] A = {222,55,53};
	    return A;
	}
	@Override
	public float[] findSonById(int id, Current __current) {
		if(!findSonInListById(id).equals(null)){
			return findSonInListById(id).getSonMP3();
		}
		return null;
	}
	@Override
	public void addSon(int id, String name, float[] ms, Current __current) {
		listOfSon.add(new Son(id,name,ms));
		
	}
	@Override
	public void removeSonByName(String name, Current __current) {
		if(!findSonListByName(name).equals(null)){
			listOfSon.remove(name);
		}			
	}
	@Override
	public void removeSonById(int id, Current __current) {
		if(!findSonInListById(id).equals(null)){
			listOfSon.remove(id);
		}
	}
}
