import classes.blocodeinicializacao.Cliente ;
import java.util.Scanner ;

public class ClienteTeste
{

  public static void main ( String [ ] args )
  {

    Scanner ler = new Scanner ( System.in ) ;
    Cliente cliente = new Cliente (  ) ;

    System.out.println ( "\nExibindo quantidade de parcelas possiveis" ) ;

    for ( int parcela : cliente.getParcelas (  ) )
    {

      System.out.print ( parcela + " " ) ;

    }

  }

}
