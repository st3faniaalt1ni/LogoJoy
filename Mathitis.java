
package LogoJoy;
import java.util.*;




public abstract class Mathitis {
  



	protected String onoma;
        protected String epitheto;
	protected double ilikia;
	protected String taksi;
	protected String onoma_patera;
        protected String tilefwno;
        protected TreeSet<Eidikothta> eidikotites=null;
        protected int wresMina=0;
        protected double ofiles=0;
	
        
	
	public Mathitis(String onoma,String epitheto, double ilikia, String taksi,
			String onoma_patera, String tilefwno) {
		
		this.onoma = onoma;
                this.epitheto=epitheto;
		this.ilikia = ilikia;
		this.taksi = taksi;
		this.onoma_patera = onoma_patera;
		this.tilefwno = tilefwno;
	}

	
	public void prosthikiEidikotitwn(String eidikotita){
		Eidikothta iEidikothta=null;
		
	}
	public double metatropiDedomenwnOfilws(ArrayList ofeiles){
            return 0;
        }
        
        public void prosthikiRantevou(Rantevou r){
            
        }
        public void addWra(){
            wresMina++;
        }
        public void clearWres(){
         wresMina=0;
        }
        
        public void meiwsiOfilwn(double a){
            ofiles =ofiles-a;
        }
        
        public void prosthikiOfilwn(){
         
        }
}


