package aula04;

public class IfElse {
    public static void main(String[] args) {
        String nome = "Marcos" ; 
        int maiorIdade  = 23;
        int menorIdade = 16;
        if (maiorIdade >=18 ) {
            System.out.println("Voce é maior de idade");
        }else if(menorIdade >= 16 ){
        System.out.println("Voce é aborrecente");
        }else{
            System.out.println("Opção invalida");
        }
        System.out.println("");
    }
}
