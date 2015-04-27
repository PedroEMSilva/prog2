import static java.lang.Character.toUpperCase;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cliente
 */
public class Pratica31 {
     
    private static void main(String[] args) {
        Date inicio=new Date();
        String meuNome = "Pedro Emanuel Mateus Silva";
        String nome1,nome2,nome3,sobrenome1;
        char sobrenome2;
        nome1=meuNome.substring(0,1).toUpperCase()+". ";
        nome2=meuNome.substring(6,7).toUpperCase()+". ";
        nome3=meuNome.substring(14,15).toUpperCase()+". ";
        sobrenome1=meuNome.substring(22).toLowerCase();
        sobrenome2=toUpperCase(meuNome.charAt(21));
        System.out.println(meuNome.toUpperCase());
        System.out.println(sobrenome2 + sobrenome1 + ", " + nome1 + nome2 + nome3);
        
         GregorianCalendar dataNascimento= new GregorianCalendar(1996, 11, 14);
          GregorianCalendar epoca= new GregorianCalendar();
         
         System.out.println("Dias passados: "+(epoca.getTimeInMillis()-dataNascimento.getTimeInMillis())/86400000);
         Date fim = new Date();
         System.out.println("Foram "+ (fim.getTime()-inicio.getTime())+" milissegundos");
    }
    
}
