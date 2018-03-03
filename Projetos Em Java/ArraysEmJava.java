import java.util.Scanner ;

public class ArraysEmJava
{

  public static void main ( String [  ] args )
  {

    int i ;
    int idade [] = new int [3] ;  // Sintaxe Para Inicializar Um Vetor
    //  A palavra new sempre é utilizada para criar objeto

    Scanner ler = new Scanner ( System.in ) ;

    for ( i = 0; i < idade.length; i++ )
    {

      System.out.println ( "\nDigite A Idade Da Posicao "+( i + 1 ) ) ;
      idade[i] = ler.nextInt (  ) ;

    }

    for ( i = 0; i < 3; i++ )
    {

      System.out.println ( "\nO valor da posicao" + ( i + 1 )+ " e : "+idade[i] ) ;

    }

  }

}
