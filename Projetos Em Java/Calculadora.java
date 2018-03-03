package classes.calculadora ;

public class Calculadora
{

  public float n1 ;
  public float n2 ;

  public void somaDoisNumeros (float n1, float n2 )
  {

    System.out.println ( "\nO resultado da soma e : "+ ( n1 + n2 ) ) ;

  }

  public void subtracaoDoisNumeros ( float n1, float n2 )
  {

    System.out.println ( "\nO resultado para subtracao e : "+ ( n1 - n2 ) ) ;

  }

  public void multiplicacaoDoisNumeros ( float n1, float n2 )
  {

    System.out.println ( "\nO resultado para a multiplicacao e : "+ ( n1*n2 ) ) ;

  }

  public void divisaoDoisNumeros ( float n1, float n2 )
  {

    System.out.println ( "\nO resultado para a divisao e : "+ ( n1/n2 ) ) ;

  }

  public void somaArray ( int [] numeros, int n )
  {

    int soma = 0;

    for ( int num : numeros )
    {

      soma += num ;

    }

    System.out.println ( "\nA soma dos elementos do array de tamanho "+n+ " e : "+soma ) ;

  }

  public void somaVarArgs ( int... numeros )
  {

    int soma = 0;

    for ( int num : numeros )
    {

      soma += num ;

    }

    //System.out.println ( "\nA soma dos elementos do array de tamanho "+n+ " e : "+soma ) ;

  }

}
