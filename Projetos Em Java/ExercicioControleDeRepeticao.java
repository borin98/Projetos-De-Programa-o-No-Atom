import java.util.Scanner ;

public class ExercicioControleDeRepeticao
{

  public static void main ( String [  ] args )
  {

    int i ;
    int valor ;

    Scanner ler = new Scanner ( System.in ) ;

    System.out.println ( "Digite Um Valor Que Deseja Imprimir Seus Pares : " ) ;

    valor = ler.nextInt (  ) ;

    System.out.println ( "\n" ) ;

    for ( i = 0; i < ( valor + 1 ) ; i++ )
    {

      if ( i%2 == 0 )
      {

        System.out.println ( i ) ; // Imprime todos os números pares de 0 à valor

      }

    }

  }

}
