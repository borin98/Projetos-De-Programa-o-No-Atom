public class OperadoresDeAtribuicao
{

  public static void main ( String [ ] args )
  {

    int salario = 1800 ;

    salario += 1000 ; // salario = salario + 1000;

    System.out.println ( salario ) ;

    salario += (int) ( salario + 0.1 );// salario = salario + (int) ( salario + 0.1 )

    System.out.println ( salario );

  }


}
