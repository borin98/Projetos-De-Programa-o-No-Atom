import java.util.Scanner ;

public class SalarioEEmposto
{

  public static void main ( String [  ] args )
  {

    Scanner ler = new Scanner ( System.in ) ;

    float salario ;
    float imposto ;
    float dinheiroLiquido ;

    System.out.println ( "Digite o salario desejado : " ) ;
    salario = ler.nextFloat (  ) ;

    if ( salario < 1000 )
    {

      imposto = ( float ) ( salario*0.05) ;

    }

    else if ( salario >= 1000 && salario < 2000)
    {

      imposto = ( float ) ( salario*0.10 ) ;

    }

    else if ( salario >= 2000 && salario < 4000 )
    {

      imposto = ( float ) ( salario*0.15 ) ;

    }

    else
    {

      imposto = ( float ) ( salario*0.20 ) ;

    }

    System.out.println ( "O Imposto Sera De : "+imposto ) ;
    System.out.println ( "O Dinheiro Bruto sera de : "+( dinheiroLiquido = ( float ) ( salario - imposto ) ) ) ;

  }

}
