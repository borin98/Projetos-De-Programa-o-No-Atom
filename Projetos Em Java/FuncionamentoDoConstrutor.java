import classes.construtores.IntroducaoAConstrutores ;
import java.util.Scanner ;

public class FuncionamentoDoConstrutor
{

  public static void main ( String [] args )
  {

    Scanner ler = new Scanner ( System.in ) ;

    String nome ;
    String cpf ;
    double salario ;

    nome = ler.nextLine (  ) ;
    cpf = ler.nextLine (  ) ;
    salario = ler.nextDouble (  ) ;

    IntroducaoAConstrutores funcionario = new IntroducaoAConstrutores ( nome, cpf, salario ) ;

  }

}
