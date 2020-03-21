
package LogoJoy;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class MathitisTameio extends Mathitis{
    
    private String onoma_asfalismenou_gonea;
	private int[] Afm= new int[9];
	private String Doy;
        private ArrayList<Gnwmateusi> gnwmateuseis;
        private double ofiles=0;
        private static final int megistesWresMina=8; 

    public MathitisTameio(String onoma_asfalismenou_gonea, String Doy, ArrayList<Gnwmateusi> gnwmateuseis, String onoma, String epitheto, double ilikia, String taksi, String onoma_patera, String tilefwno) {
        super(onoma, epitheto, ilikia, taksi, onoma_patera, tilefwno);
        this.onoma_asfalismenou_gonea = onoma_asfalismenou_gonea;
        this.Doy = Doy;
        this.gnwmateuseis = gnwmateuseis;
    }
        
        public void prosthikiApodei3is(Apodei3i a){
            
        }

    
	public void prosthikiGnwmateusi(Gnwmateusi gn){
            gnwmateuseis.add(gn);
        }
	
        public void diagrafiGnwmateusi(Gnwmateusi gn){
            gnwmateuseis.remove(gn);
        }
	public void prosthikiOfilwn(Apodei3i a){
         ofiles= ofiles+ a.a3iaApodei3is();
        }
	
        
        
    @Override
        public void addWra(){
            if(wresMina<megistesWresMina)
                wresMina++;
                else
               
            JOptionPane.showMessageDialog(null,"O μαθητής "+onoma+ " "+epitheto+" συμπλήρωσε το μέγιστο επιτρεπτό όριο συνεδρειών για αυτό το μήνα",
    "Inane error",
    JOptionPane.ERROR_MESSAGE);
        }
                
       
        
     
}
