public class AlocacaoDeArrays
{

  public static void main ( String [  ] args )
  {

    int array1 [] = new int[5] ;
    int array2 [] =  {1, 2, 3, 4, 5} ;
    int array3 [] = new int [] {1, 2, 3, 4, 5} ; // possui o tamanho e inicializado do array2

    for ( int i = 0; i < array2.length; i++ )
    {

      System.out.println ( array2[i] ) ;

    }

    System.out.println ( "\n Temos um novo tipo de for no java : o ' foreach ' \n" ) ;

    for ( int aux : array2 ) // sintaxe do foreach -> mesmo tipo do array que ele vai copiar para da certo
    {

      System.out.println ( "\n O resultado de cada variavel sera : "+aux ) ;
      // obs : quando acaba este looping, o java apaga esta variavel da memoria. Logo, e possivel criar uma outra variavel com o mesmo nome
    }

  }

}
