/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogoJoy;


import java.util.*;
import Grafika.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String [] args){
        
        
        new KentrikiOthoniFrame();
        
        
        
//        MathitisTameio M1= new MathitisTameio("Amalia","Kalamarias","Πέτρος","Ιακωβίδης",9.5,"Δ ΔΗΜΟΤΙΚΟΥ","Stergios","756783597");
        
        
//           Database.connectionDB();
    
      	TreeSet<Integer> meres= new TreeSet<Integer>();
		meres.add(2);
		meres.add(14);
		meres.add(22);
		
		TreeSet<String> eidikothtes=new TreeSet<String>();
		eidikothtes.add("Λογοθεραπεία");
		eidikothtes.add("Εργοθεραπεία");
		
		
		System.out.println(new Apodei3i(Voithitikes_methodoi.epomeni_apodei3i(),"G","K","Μαρία","Γκαβογιάννη","4/5-3/6",eidikothtes,meres,4).keimenoApodei3is());
		System.out.println(new Apodei3i(Voithitikes_methodoi.epomeni_apodei3i(),"G","A","Γιώργος","Καρούτσος","9/5-8/6",eidikothtes,meres,6).keimenoApodei3is());
                System.out.println(new Apodei3i(Voithitikes_methodoi.epomeni_apodei3i(),"A","A","Γιώργος","Καρούτσος","9/5-8/6",eidikothtes,meres,7).keimenoApodei3is());
		System.out.println(new Apodei3i(Voithitikes_methodoi.epomeni_apodei3i(),"A","K","Μαρία","Καρά","9/5-8/6",eidikothtes,meres,5).keimenoApodei3is());
		 //new EggrafiEkpaideutikouFrame();
                 new OikonomikesSunallagesFrame();
	}

        
        
   
        
    }

    
    
    
    

