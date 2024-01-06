public class CepInvalidoException {

    public static void main(String[] args) throws{
        try{

            String cepFormatado = formatarCep("234497793");
            System.out.println(cepFormatado);
        }
        catch(CepInvalidoException e){

            System.out.println("O CEP não corresponde as regras de negocios");
        }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)

          throw new CepInvalidoException();

          //simulando um cep formatado
          return "23.765-064";
        }

    }
}
