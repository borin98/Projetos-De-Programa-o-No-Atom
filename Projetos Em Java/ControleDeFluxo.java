//Estamos utilizando operadores ternários ( Binários  )

public class ControleDeFluxo
{

  public static void main ( String [  ] args )
  {

    int idade = 20 ;
    String status ;

/*    if ( idade < 18 )
    {

      status = "Nao Adulto " ;

    }

    else
    {

      status = "Adulto " ;

    }

    System.out.println ( status ) ;  // 1 -> Normal */

    status = idade < 18 ? "Nao Adulto " : "Adulto " ; // O primeiro termo sempre será o caso verdadeiro da pergunta feita

    System.out.println ( status ) ; // mesma coisa que 1

  }

}
