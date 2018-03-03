import classes.funcionario.Funcionario ;
import java.util.Scanner ;

public class FuncionarioTeste
{

  public static void main ( String [ ] args )
  {

    Scanner ler = new Scanner ( System.in ) ;
    Funcionario funcionario = new Funcionario ( ) ;

    char a ;
    int sair = 0 ;
    String nome ;
    String cpf ;
    double salario ;

    System.out.println ( "\nDesesja incluir um funcionario ? ( s para sim e n para nao ) : " ) ;
    a = ler.nextLine().charAt(0) ;

    while ( sair != 1 )
    {

      if ( a == 's' || a == 'S' )
      {

        System.out.println ( "\nDigite o nome do funcionario : " ) ;
        nome = ler.nextLine ( ) ;
        funcionario.setNome ( nome ) ;

        System.out.println ( "\nDigite o CPF do funcionario : " ) ;
        cpf  = ler.nextLine ( ) ;
        funcionario.setCpf ( cpf ) ;

        System.out.println ( "\nDigite o salario do funcionario : " ) ;
        salario = ler.nextDouble ( ) ;
        funcionario.setSalario ( salario ) ;

        funcionario.imprime (  ) ;

        System.out.println ( "\nDesesja incluir um funcionario ? ( s para sim e n para nao ) : " ) ;
        nome = ler.nextLine ( ) ;
        a = ler.nextLine().charAt(0) ;

      }

      else if ( a == 'n' || a == 'N' )
      {

        System.out.println ( "\nObrigado por utilizar este programa !!!" ) ;
        sair = 1 ;

      }

      else
      {

        System.out.println ( "\nResposta invalida !!! Digite outra alternativa valida ( s para sim e n para sair desse modo ) : " ) ;
        a = ler.nextLine ( ).charAt ( 0 ) ;

      }

    }

  }

}
