import classes.nota.Nota ;
import java.util.Scanner ;

public class ExercicioAnotaNomeIdadeEMediaDoAluno
{

  public static void main ( String [ ] args )
  {

    Scanner ler = new Scanner ( System.in ) ;
    Nota aluno = new Nota ( ) ;

    char a ;
    int sair = 0 ;
    double v[] = new double[3] ;

    System.out.println ( "\nDeseja registrar um novo aluno ? ( S para sim e N para nao )" ) ;
    a = ler.nextLine ( ).charAt ( 0 ) ;

    while ( sair != 1 )
    {

      if ( a == 'n' || a == 'N' )
      {

        System.out.println ( "\nVoce saiu do modo de anotacoes. Obrigado por usar o programa !!!!" ) ;
        sair = 1 ;

      }

      else if ( a == 'S' || a == 's' )
      {

        System.out.println ( "\nDigite o nome do aluno : " ) ;
        aluno.nome = ler.nextLine (  ) ;

        System.out.println ( "\nDigite a idade do aluno : " ) ;
        aluno.idade = ler.nextInt (  ) ;

        for ( int i = 0; i < 3; i++ )
        {

          if ( i == 0 )
          {

            System.out.println ( "\nDigite a nota da primeira prova" ) ;
            v[ i ] = ler.nextDouble ( ) ;

          }

          else if ( i == 1 )
          {

            System.out.println ( "\nDigite a nota da segunda prova " ) ;
            v[ i ] = ler.nextDouble ( ) ;

          }

          else
          {

            System.out.println ( "\nDigite a nota da terceira prova" ) ;
            v[ i ] = ler.nextDouble (  ) ;

          }

        }

          aluno.media = aluno.calculoMedia ( v ) ;
          aluno.imprimeResultado ( aluno.media ) ;

          aluno.nome = ler.nextLine (  ) ;

          System.out.println ( "\nDeseja registrar outro aluno ? ( S para sim e N para nao ) : " ) ;
          a = ler.nextLine ( ).charAt ( 0 ) ;

      }

      else
      {

        System.out.println ( "\nResposta invalida !!! Digite outra alternativa valida ( s para sim e n para sair desse modo ) : " ) ;
        a = ler.nextLine ( ).charAt ( 0 ) ;

      }

    }

  }

}
