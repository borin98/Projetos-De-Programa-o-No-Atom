public class ArraysBiDimencionais
{

  public static void main ( String [  ] args )
  {

    int dias [ ] [ ] = new int [12] [31] ;
    dias[0][0] = 1 ;
    dias[0][1] = 2 ;
    dias[1][0] = 3 ;
    dias[1][4] = 4 ;

    for ( int i = 0; i < dias.length; i++ )
    {

      System.out.println ( "O endereco de memoria de "+ i+ " e  : "+dias[i] ) ;

      for ( int j = 0; j < dias[i].length; j++ )
      {

        System.out.println ( "\n O valor de "+i+ " e "+j+" vale : "+dias[i][j] ) ;

      }

      System.out.println ( "\n Para o ' foreach ' temos o looping :  "  ) ;

      for ( int [] ref : dias ) // em java, funciona como cada posicao da matriz fosse um vetor e do vetor chama variaveis dentro, por isso precisa fazer referencia no estilo de vetor para isto funcionar direito
      {

        for ( int dia : ref  )
        {

          System.out.println ( dia ) ;

        }

      }

    }

  }

}
