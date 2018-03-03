import java.util.Scanner ;

public class UsoDeContinueNoJava
{

  public static void main ( String [  ] args )
  {

    Scanner ler = new Scanner ( System.in ) ;

    double valorTotal ;
    double valorParcelas ;

    System.out.println ( "Digite O Valor Do Automovel : " ) ;
    valorTotal = ler.nextDouble (  ) ;

    for ( int i = (int) valorTotal; i >= 1; i-- )
    {

      valorParcelas = valorTotal / i ;

      if ( valorParcelas <= 1000 )
      {

        continue ;
        //  Os Códigos Aqui Para Baixo Do Continue Não Serão Compilados
      }

      else
      {

        System.out.println ( "O Valor De R$ "+valorTotal+ " Pode Ser Pago Em "+i+" Parcelas De R$ "+ (float) (valorParcelas) ) ;

      }

    }

  }


}
