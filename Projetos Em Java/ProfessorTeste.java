import classes.professor.Professor ;
import java.util.Scanner ;

public class ProfessorTeste
{

  public static void main ( String [ ] args )
  {

    Scanner ler = new Scanner ( System.in ) ;
    Professor prof = new Professor (  ) ;

    System.out.println ( "\nDigite o nome do professor : " ) ;
    prof.nome = ler.nextLine (  ) ;

    System.out.println ( "\nDigite a matricula do professor : " ) ;
    prof.matricula = ler.nextLine (  ) ;

    System.out.println ( "\nDigite o rg do professor : " ) ;
    prof.rg = ler.nextLine ( ) ;

    System.out.println ( "\nDigite o cpf do professor : " ) ;
    prof.cpf = ler.nextLine (  ) ;

    prof.imprime ( ) ;

  }

}
