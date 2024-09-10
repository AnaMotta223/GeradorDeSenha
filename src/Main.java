import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;
import java.lang.*;

public class Main {

    public static String geraSenha(int tamanho){
        //Listas de números, letras e caracteres
        String[] numeros = {"0","1","2","3","4","5","6","7","8","9"};
        String[] caracteres = {"!","@","#","%","$","&","*","?"};
        String[] letrasMaiusculas = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
                                    "Q","R","S","T","U","V","W","X","Y","Z"};
        String[] letrasMinusculas = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
                                    "q","r","s","t","u","v","w","x","y","z"};

        ArrayList<String> senha = new ArrayList<>();
        Random gerador = new Random();
        String caractere;
        int posicao;
        int caso;

        //Verifica se o tamanho é muito pequeno
        if (tamanho < 5){
            throw new NumberException("Tamanho inválido! Mínimo de 5 caracteres!");
        }

       //Sorteia um número (posição de lista) enquanto o tamanho desejado de senha não for atingido
       while (tamanho != senha.size()) {
           caso = gerador.nextInt(4);
           switch (caso){
               case 0:
                   posicao = gerador.nextInt(10);
                   caractere = numeros[posicao];
                   senha.add(caractere);
                   break;
               case 1:
                   posicao = gerador.nextInt(8);
                   caractere = caracteres[posicao];
                   senha.add(caractere);
                   break;
               case 2:
                   posicao = gerador.nextInt(26);
                   caractere = letrasMaiusculas[posicao];
                   senha.add(caractere);
                   break;
               case 3:
                   posicao = gerador.nextInt(26);
                   caractere = letrasMinusculas[posicao];
                   senha.add(caractere);
                   break;
           }


       }
        //Transforma a lista de caracteres em uma String única (senha desejada)
        String senhaFinal = senha.toString().replaceAll("[^0-9A-Za-z!@#%$&*?]","");
        return senhaFinal;
    }


    public static void main(String[] args) {

        int opcao = 1;

        do{
            try
            {
                int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tamanho da senha:", "Gerador de Senha",3));
                JOptionPane.showMessageDialog(null, "Sua senha é:\n" + geraSenha(tamanho), "Gerador de senha", JOptionPane.INFORMATION_MESSAGE);
                opcao = JOptionPane.showConfirmDialog(null,"Deseja sair?","Sair",0);
            } //Se o usuário digitar uma entrada sem ser um número:
            catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(null,"Caractere inválido!","Erro",JOptionPane.ERROR_MESSAGE );
            }//Se o usuário digitar um número menor que o tamanho mínimo:
           catch (NumberException ex2){
               JOptionPane.showMessageDialog(null,ex2.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE );
           }

        } while(opcao != 0);
    }
}