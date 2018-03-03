import aluno.Estudante ;
import java.util.Scanner ;

public class AlunoTeste
{

  public static void main ( String [ ] args )
  {

    int sair = 0 ;
    char a ;

    Scanner ler = new Scanner ( System.in ) ;
    Estudante estudante = new Estudante ( ) ;

    System.out.println ( "\nDeseja registrar um novo aluno ? ( S para sim e N para nao ) : " ) ;

    a = ler.nextLine ( ).charAt ( 0 ) ;

    while ( sair != 1 )
    {

      if ( a == 'n' || a == 'N' )
      {

        System.out.println ( "\nObrigrado por usar este programa !!!" ) ;
        sair = 1 ;

      }

      else if ( ( a == 's' || a == 'S' ) )
      {

        System.out.println ( "\nDigite o nome do estudante : " ) ;
        estudante.nome = ler.nextLine (  ) ;

        System.out.println ( "\nDigite o numero de matricula do estudante : " ) ;
        estudante.matricula = ler.nextLine (  ) ;

        System.out.println ( "\nDigite a idade do estudante : " ) ;
        estudante.idade = ler.nextInt (  ) ;

        System.out.println ( "\nOs dados anotados foram os seguintes : " ) ;

        System.out.println ( "\nNome do estudante : "+estudante.nome ) ;
        System.out.println ( "\nMatricula do estudante : "+estudante.matricula ) ;
        System.out.println ( "\nIdade do estudante : "+estudante.idade ) ;

        estudante.nome = ler.nextLine (  ) ;

        System.out.println ( "\nDeseja registrar um novo aluno ? ( S para sim e N para nao ) : " ) ;

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
