package Generated;

public class Son {

	private int id; 
	private String nom;
	private float[] sonMP3;
	
	public Son(int id, String nom, float[] sonMP3) {
		this.id = id;
		this.nom = nom;
		this.sonMP3 = sonMP3;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float[] getSonMP3() {
		return sonMP3;
	}
	public void setSonMP3(float[] sonMP3) {
		this.sonMP3 = sonMP3;
	}
}
