
package LogoJoy;

import java.util.ArrayList;


public class Ekpaideutikos {
   
	private double wroMisthio;
	private int wres_ergasias=0;
	private String onoma;
	private String epitheto;
	private int[] Afm;
	private String dieuthinsi;
	private String tilefwno;
        private ArrayList<int> meres;
	public Ekpaideutikos(double wromisthio,String onoma, String epitheto, int[] afm,
			String dieuthinsi, String tilefwno) {
        this.meres = new ArrayList<int>([1,2,3,4,5]);
		this.wroMisthio=wromisthio;
		this.onoma = onoma;
		this.epitheto = epitheto;
		Afm = afm;
		this.dieuthinsi = dieuthinsi;
		this.tilefwno = tilefwno;
	}
	public String getOnoma() {
		return onoma;
	}
	public String getEpitheto() {
		return epitheto;
	}
	public int[] getAfm() {
		return Afm;
	}
	public String getDieuthinsi() {
		return dieuthinsi;
	}
	public String getTilefwno() {
		return tilefwno;
	}
	
	
	public int getWres_ergasias() {
		return wres_ergasias;
	}
	public void setWres_ergasias(int wres_ergasias) {
		this.wres_ergasias = wres_ergasias;
	}
	public double getWromisthio() {
		return wroMisthio;
	}
	public void prosthikiWrwnErgasias(int wres){
		wres_ergasias=wres;
	}
	
	public double upologismosMisthou(){
            return wres_ergasias+wroMisthio;
        }
        public void prosthikiRantevou(Rantevou r){
            
        }
        public ArrayList<int> emfanisiKenwnWrwn(int mera){
            return null;
        }
}


