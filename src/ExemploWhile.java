import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada>0){
            Double ValorDoce = valorAleatorio();
            if(ValorDoce > mesada)
                ValorDoce = mesada;
            


        System.out.println("Doce do valor: " + ValorDoce + "Adicionado no carrinho");
            mesada = mesada - ValorDoce;    

        System.out.println("Mesada: " + mesada); 
        System.out.println("Joaozinho gastou toda a sua mesada em doces");       }
    }

    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}
