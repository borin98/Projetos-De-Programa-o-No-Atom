public class ArraysMultidimencionais
{

  public static void main ( String [  ] args )
  {

    int dias [] [] = new int [3] [ ] ;

    /*Tipos de inicializaca :

    int [ ] tipo1 = {numeros};
    int [ ] tipo2 = new int [numero] ;
    int [ ] tipo 3 = new int [] {numeros} ;*/


    dias [0] = new int [2] ;  //   Estamos criando arrays dentro de outros arrays de tal forma que ele possui mais dois espacços dentro dele
    dias [1] = new int [ ] {1, 2, 3} ;  // Já está inicializado dentro dele
    dias [2] = new int [4] ;  // Possui um vetor de tamanho mais de 4 dentro dele

    int [ ] [ ] dia = { { 0,1 }, {2, 3, 4}, {5, 6, 7, 8} } ;

    for ( int [  ] aux1 : dias )
    {

      for ( int aux2 : aux1 )
      {

        System.out.println ( aux2 ) ;

      }

      System.out.println ( "\n-------------------------------------------------------------------\n" ) ;

      for ( int [ ] aux3 : dia )
      {

        for ( int aux4 : aux3 )
        {

          System.out.println ( aux4 ) ;

        }

      }

    }

  }

}
