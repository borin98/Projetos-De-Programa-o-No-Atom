import java.util.Scanner ;

//Programa Que Calcula A Quantidade De Prestações Maiores Que 1000 Reais

public class ParcelasDeUmCarro
{

  public static void main ( String [  ] args )
  {

    double valorTotal ;
    double valorParcelas ;

    Scanner ler = new Scanner ( System.in ) ;

    System.out.println ( "Digite O Valor Do Automovel : " ) ;
    valorTotal = ler.nextDouble (  ) ;

    if ( valorTotal < 1000 )
    {

      System.out.println ( "Nao E Possivel Realizar As Parcelas !!! " ) ;


    }


    else
    {

        System.out.println ( "\nE Possivel Pagar As Prestacoes Do Carro Pela Seguinte Forma : \n" ) ;

      for ( int i = 1; i <= valorTotal ; i++ )
      {

        valorParcelas = valorTotal / i ;

        if ( valorParcelas >= 1000 )
        {

          System.out.println ( "O Valor De R$ "+valorTotal+ " Pode Ser Pago Em "+i+" Parcelas De R$ "+ (float) (valorParcelas) ) ;

        }

        else
        {

          break ;

        }

      }

    }

  }


}
