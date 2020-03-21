package LogoJoy;

import java.util.*;
import java.text.DateFormatSymbols;

public class Apodei3i {
    
    private int id;
    private String fulo_goniou;
    private String fulo_paidiou;
    private String onoma_paidiou;
    private String epwnumo_paidiou;
    private String xroniko_diastima;
    private TreeSet<String> eidikotites;
    private TreeSet<Integer> imeres;
    private int minas;
    private double a3ia=0;
    //private Gnwmateusi gnwmateusi;

        
		
		
	public Apodei3i(int id, String fulo_goniou, String fulo_paidiou,
				String onoma_paidiou, String epwnumo_paidiou,
				String xroniko_diastima, TreeSet<String> eidikotites,
				TreeSet<Integer> imeres,int minas) {
			
			this.id = id;
			this.fulo_goniou = fulo_goniou;
			this.fulo_paidiou = fulo_paidiou;
			this.onoma_paidiou = onoma_paidiou;
			this.epwnumo_paidiou = epwnumo_paidiou;
			this.xroniko_diastima = xroniko_diastima;
			this.eidikotites = eidikotites;
			this.imeres = imeres;
			this.minas=minas;
		}
		
                
                
	
	public String keimenoApodei3is(){
			String fuloP,fuloG,diastima,eidik,imer,idApod;
			fuloP=null;
			fuloG=null;
			String onomaPaidiou=null;
			
			idApod="Αριθμός απόδειξης : "+Integer.toString(id)+"\n";
			if(fulo_paidiou.equals("K")){
				fuloP="Της κόρης ";
			}
			else if(fulo_paidiou.equals("A")){
				fuloP="Του γιου ";
			}
			
			if(fulo_goniou.equals("G")){
				fuloG="της ";
				if(fulo_paidiou.equals("K"))
				onomaPaidiou= epwnumo_paidiou+" "+onoma_paidiou+"ς"+" ";
				else 
				onomaPaidiou=epwnumo_paidiou.substring(0, epwnumo_paidiou.length()-1)+"υ "+onoma_paidiou.substring(0, onoma_paidiou.length()-1)+"υ  ";
				
			}
			else if(fulo_goniou.equals("A")){
				fuloG="του ";
                                if(fulo_paidiou.equals("K"))
                                   onomaPaidiou=onoma_paidiou+"ς"+" ";
                                else
                                   onomaPaidiou=onoma_paidiou.substring(0, onoma_paidiou.length()-1)+"υ ";
			}
			
			diastima="την "+xroniko_diastima+" \n";
			
			eidik="";
			for(String eidikotita:eidikotites){
				eidik= eidik+eidikotita+", ";
			}
			eidik=eidik+ "\n";
			imer="";
			for(int imera:imeres){
				imer=imer+imera+" ";
			}
                       String minasText=Voithitikes_methodoi.metatropiMina(minas);
			imer=imer+minasText;
			return idApod+fuloP+fuloG+onomaPaidiou+diastima+eidik+imer;
		}
		
    
    public double a3iaApodei3is(){
       return a3ia=imeres.size()*30;
    }
    
    
    
}
