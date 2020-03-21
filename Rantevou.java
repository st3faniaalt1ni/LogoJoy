


package LogoJoy;


public class Rantevou {
        private Mathitis mathitis;
        private String onomaEkpaideutikou;
        private int wra;
        private String imera;
        // 1 gia tameio , 2 xwris tameio
        private int eidosMathiti;

    public Rantevou(int wra, String imera) {
        
        this.wra = wra;
        this.imera = imera;
        
    }

   
   public boolean parousia(boolean i){
       return i;
   }     
   
   
   
   public void clearEkpaideutikou(){
       onomaEkpaideutikou=null;
   }
   public void clearMathiti(){
       mathitis=null;
   }

    public void setMathitis(Mathitis mathitis) {
        this.mathitis = mathitis;
    }

    public void setOnomaEkpaideutikou(String onomaEkpaideutikou) {
        this.onomaEkpaideutikou = onomaEkpaideutikou;
    }

    public void setEidosMathiti(int eidosMathiti) {
        this.eidosMathiti = eidosMathiti;
    }
   
  

        
    
    
    
    
}
