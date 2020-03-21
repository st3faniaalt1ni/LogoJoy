package LogoJoy;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



    
    public abstract class Voithitikes_methodoi {
        private ArrayList<Gnwmateusi> gnwmateuseis;
	private TreeSet<Apodei3i> apodei3eis;
	private static TreeSet<Ekpaideutikos> ekpaideutikoi;
	private static int apodei3i;
        
        
	
	public static String metatropiMina(int minas){
             String minasString=null;
        switch (minas) {
            case 1:  minasString = "Ιανουάριος";
                     break;
            case 2:  minasString = "Φεβρουάριος";
                     break;
            case 3:  minasString = "Μάρτιος";
                     break;
            case 4:  minasString = "Απρίλιος";
                     break;
            case 5:  minasString = "Μάϊος";
                     break;
            case 6:  minasString = "Ιούνιος";
                     break;
            case 7:  minasString = "Ιούλιος";
                     break;
            case 8:  minasString = "Άυγουστος";
                     break;
            case 9:  minasString = "Σεπτέβριος";
                     break;
            case 10: minasString = "Οκτώβριος";
                     break;
            case 11: minasString = "Νοέμβριος";
                     break;
            case 12: minasString = "Δεκέμβριος";
                     break;
            default: minasString = "Invalid month";
                     break;
        
    }return minasString;

        }
	
	public static int epomeni_apodei3i(){
		apodei3i++;
		return apodei3i;
	}
	
	
	public void prosthikiApodei3is(Apodei3i a){
		apodei3eis.add(a);
	}
	public static double plirwmiEnosEkpaideutikou(String onoma){
		double misthos=0;
		Ekpaideutikos oEkpaideutikos=null;
		for(Ekpaideutikos ekpaideutikos:ekpaideutikoi){
			if(onoma.equals(ekpaideutikos.getOnoma())){
				 oEkpaideutikos = ekpaideutikos;
			}
			
			
		}
		misthos=oEkpaideutikos.getWromisthio()*oEkpaideutikos.getWres_ergasias();
		return misthos;
	}
	public double plirwmesEkpaideutikwn(){
		double misthoi=0;
		for(Ekpaideutikos ekpaideutikos:ekpaideutikoi){
			misthoi=ekpaideutikos.getWromisthio()*ekpaideutikos.getWres_ergasias();
		}
		return misthoi;
	}
	public static int metatropiEidikotitwn(Eidikothta e){
            if(e.equals("ΛΟΓΟΘΕΡΑΠΕΙΑ"))
                return 1;
            else if(e.equals("ΕΙΔΙΚΗ ΔΙΑΠΑΙΔΑΓΩΓΗΣΗ"))
                return 2;  
            else if(e.equals("ΕΡΓΟΘΕΡΑΠΕΙΑ"))
                return 3;
            else if(e.equals("ΨΥΧΟΘΕΡΑΠΕΙΑ"))        
                return 4;
            else return 0;
        }
        
        
        
        
        
        
        
        



    }

    
    
    
    

