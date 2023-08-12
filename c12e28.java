package Exerci_MOD3;
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;
public class c12e28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      List<String> nomes = new ArrayList<String>(); // Declarando as listas dinâmicas e as incializando 
      List<String> ra = new ArrayList<String>();
      String nomePraAdd="",raPraAdd="";
      int posProcura=-1;
      do{
      System.out.println("Digite seu nome (digite x para interromper): ");
      nomePraAdd=teclado.nextLine();
       if(nomePraAdd.equalsIgnoreCase("x")){
        break;
       }
      
      System.out.println("Digite seu RA: ");
      raPraAdd=teclado.nextLine();
      nomes.add(nomePraAdd);
      ra.add(raPraAdd);
    
      }while(!nomePraAdd.equalsIgnoreCase("x"));
      for(int aux=0;aux<nomes.size()-1;aux++){   // Método da bolha para ordenação das listas dinâmicas 
        for (int cont=0;cont<nomes.size()-1;cont++){
            if (nomes.get(cont).compareTo(nomes.get(cont+1)) > 0){
            String temp=nomes.get(cont);
            nomes.set(cont, nomes.get(cont+1));
            nomes.set(cont+1, temp);
            String temp2=ra.get(cont);
            ra.set(cont, ra.get(cont+1));
            ra.set(cont+1, temp2);
            }
        }
    }
    System.out.println("Digite o nome de um aluno: ");
    String nomeProc=teclado.nextLine();
    posProcura=nomes.indexOf(nomeProc);
    if (posProcura==-1){
    System.out.println("Nome não encontrado! ");
    }
    System.out.println("RA do aluno: "+ra.get(posProcura)+" Encontrado na posição: "+posProcura);
    teclado.close();
    }
}
