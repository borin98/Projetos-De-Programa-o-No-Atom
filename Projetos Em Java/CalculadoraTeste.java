import classes.calculadora.Calculadora ;
import java.util.Scanner ;

public class CalculadoraTeste
{

  public static void main ( String [ ] args )
  {

    Calculadora cal = new Calculadora (  ) ;
    Scanner ler = new Scanner ( System.in ) ;
    int n ;
    int i ;

    System.out.println ( "\nDigite o primeiro numero : " ) ;
    cal.n1 = ler.nextFloat ( ) ;

    System.out.println ( "\nDigite o segunto numero : " ) ;
    cal.n2 = ler.nextFloat (  ) ;

    cal.somaDoisNumeros ( cal.n1, cal.n2 ) ;
    cal.subtracaoDoisNumeros ( cal.n1, cal.n2 ) ;
    cal.multiplicacaoDoisNumeros ( cal.n1, cal.n2 ) ;
    cal.divisaoDoisNumeros ( cal.n1, cal.n2 ) ;

    System.out.println ( "\nDigite o tamanho do array que deseja construir : " ) ;
    n = ler.nextInt ( ) ;

    int v[] = new int[n] ;

    for ( i = 0; i < n; i++ )
    { 

      System.out.println ( "\nDigite o elemento da posicao "+i ) ;
      v[i] = ler.nextInt (  ) ;

    }

    cal.somaArray ( v, n ) ;

    //cal.somaVarArgs ( v ) ;  ou cal.somaVarArgs ( passa os valores aqui , 1, 2, 3, ... ) forma um vetor aqui

  }

}
