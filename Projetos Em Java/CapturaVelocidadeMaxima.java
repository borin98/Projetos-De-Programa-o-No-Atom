import modificador.modificador_static.ModificadorEstatico ;
import java.util.Scanner ;

public class CapturaVelocidadeMaxima
{

  public static void capturaVelocidadeVia ( char a, int sair, double velocidadeLimite, Scanner ler, ModificadorEstatico carro  )
  {

    while (  sair != 1 )
    {

       if ( a == 'N' || a == 'n' )
      {

        System.out.println ( "\nVoce saiu do modo de anotacoes. Obrigado por usar o programa !!!!" ) ;
        sair = 1 ;

      }

      else if ( (a == 'S' || a == 's') )
      {

        System.out.print("\nDigite a velocidadeLimite da via, em km/h : ") ;
        velocidadeLimite = ler.nextDouble (  ) ;
        carro.setVelocidadeLimite ( velocidadeLimite ) ;

        sair = 1 ;

      }

      else
      {

        System.out.print ( "\nResposta invalida !!! Digite outra alternativa valida ( s para sim e n para sair desse modo ) : " ) ;
        a = ler.nextLine ( ).charAt ( 0 ) ;

      }

    }

    sair = 0 ;

  }

  public static void setaDados ( ModificadorEstatico carro, Scanner ler,  )

  public static void main ( String [ ] args )
  {

    Scanner ler = new Scanner ( System.in ) ;
    ModificadorEstatico carro = new ModificadorEstatico (  ) ;

    String nome ;
    double velocidadeMaxima ;
    double velocidadeLimite = 0 ;
    char a ;
    int sair = 0 ;

    System.out.print ( "\nDeseja registrar inicializar o programa ? ( S para sim e N para nao ) : " ) ;
    a = ler.nextLine (  ).charAt ( 0 ) ;

    capturaVelocidadeVia ( a, sair, velocidadeLimite, ler, carro  ) ;


  }

}
