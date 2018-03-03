import java.util.Scanner ;

public class UsoDeSwitch
{

  public static void main ( String [  ] args )
  {

    Scanner ler = new Scanner ( System.in ) ;

    int dia ;

    System.out.println ( "\nDigite Um Numero Entre 1 E 7, Que Corresponde Com O Dia Da Semana : " ) ;

    dia = ler.nextInt (  ) ;

    while ( dia < 1 || dia > 7 )
    {

      System.out.println ( "Valor Invalido !!!\n" ) ;

      System.out.println ( "Digite Um Numero Entre 1 E 7, Que Corresponde Com O Dia Da Semana : " ) ;

      dia = ler.nextInt (  ) ;

    }

    switch ( dia ) // Entra apenas variáveis do tipo char, int, byte, shor, enum e String
    {

    case 1 :
      System.out.println ( "\nO Numero Corresponde A Segunda - Feira" ) ;
      break ;

      case 2 :
        System.out.println ( "\nO Numero Corresponde A Terca - Feira" ) ;
        break ;

      case 3 :
        System.out.println ( "\nO Numero Corresponde A Quarta - Feira" ) ;
        break ;

      case 4 :
        System.out.println ( "\nO Numero Corresponde A Quinta - Feira" ) ;
        break ;

      case 5 :
      System.out.println ( "\nO Numero Corresponde A Sexta - Feira" ) ;
      break ;

      case 6 :
      System.out.println ( "\nO Numero Corresponde A Sabado" ) ;
      break ;

      case 7 :
      System.out.println ( "\nO Numero Corresponde A Domingo" ) ;
      break ;

      default :
        

    }

  }

}
