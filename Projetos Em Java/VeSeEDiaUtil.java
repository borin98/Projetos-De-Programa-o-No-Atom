import java.util.Scanner ;

public class VeSeEDiaUtil
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

    switch ( dia )
    {

      case 1 : case 2 : case 3 : case 4 : case 5 :
      System.out.println ( "\n E Um Dia Util " ) ;
      break ;

      default :
      System.out.println ( "\n E Um Final De Semana" ) ;
      break ;


    }

  }

}
