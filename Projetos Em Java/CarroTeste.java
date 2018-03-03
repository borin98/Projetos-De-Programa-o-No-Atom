import java.util.Scanner ;
import classes.Carro ;

public class CarroTeste
{

  public static void main ( String [ ] args )
  {

    char a ;
    int sair = 0 ;

    Scanner ler = new Scanner ( System.in ) ;

    Carro carro = new Carro (  ) ;

    System.out.println ( "\nDeseja registrar um novo carro ? ( S para sim e N para nao )" ) ;
    a = ler.nextLine ( ).charAt ( 0 ) ;

    while (  sair != 1 )
    {

       if ( a == 'N' || a == 'n' )
      {

        System.out.println ( "\nVoce saiu do modo de anotacoes. Obrigado por usar o programa !!!!" ) ;
        sair = 1 ;

      }

      else if ( (a == 'S' || a == 's') )
      {

        System.out.println ( "\nDigite a placa do carro : " ) ;
        carro.placa = ler.nextLine ( ) ;

        System.out.println ( "\nDigite o modelo do carro : " ) ;
        carro.modelo = ler.nextLine (  ) ;

        System.out.println ( "\nDigite a velocidade maxima do veiculo, em km/h : " ) ;
        carro.velocidadeMaxima = ler.nextInt (  ) ;

        System.out.println ( "\nOs dados anotados foram os seguintes : " ) ;

        System.out.println ( "\nPlaca do carro : "+carro.placa ) ;
        System.out.println ( "\nModelo do veiculo : "+carro.modelo ) ;
        System.out.println ( "\nVelocidade maxima do veiculo, em km/h : "+carro.velocidadeMaxima ) ;

        carro.placa = ler.nextLine (  ) ;

        System.out.println ( "\nDeseja registrar um novo carro ? ( S para sim e N para nao )" ) ;
        a = ler.nextLine ( ).charAt ( 0 ) ;

/      }

      else
      {

        System.out.println ( "\nResposta invalida !!! Digite outra alternativa valida ( s para sim e n para sair desse modo ) : " ) ;
        a = ler.nextLine ( ).charAt ( 0 ) ;

      }

    }

  }

}
