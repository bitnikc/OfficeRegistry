package oving4;

public class Kontor {
	private char bygning;
	private int etasje;
	private int romnummer;
	
	public char getBygning() {
		return bygning;
	}
	
	public void setBygning(char bygning) {
		this.bygning = bygning;
	}
	
	public int getEtasje() {
		return etasje;
	}
	
	public void setEtasje(int etasje) {
		this.etasje = etasje;
	}
	
	public int getRomnummer() {
		return romnummer;
	}
	
	public void setRomnummer(int romnummer) {
		this.romnummer = romnummer;
	}
	
	public Kontor(char bygning, int etasje, int romnummer) {
		this.bygning = bygning;
		this.etasje = etasje;
		this.romnummer = romnummer;
	}
		
	public String toString() {
		String resultat = bygning + "-" + etasje;
		if (romnummer < 10) resultat += "0";
		resultat += romnummer;
		return resultat;
	}
	
	public static void main(String[] args) {
		Kontor test = new Kontor('E', 4, 2);
		System.out.println(test);
	}
}
