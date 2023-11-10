public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        }catch (CepinvalidadoException e) {
            System.out.println("O cep não corresponde com a regra de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
    }
    private static String formatarCep(String string) {
        return null;
    }
    
}