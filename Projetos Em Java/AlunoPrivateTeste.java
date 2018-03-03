import classes.aluno.AlunoPrivate ;
import java.util.Scanner ;

public class AlunoPrivateTeste
{

  public static void avaliacao ( double aprovado )
  {

    System.out.println ( "\nMedia do aluno : "+aprovado ) ;

    if ( aprovado >= 6.0 )
    {

      System.out.println ( "\nAluno aprovado na materia" );

    }

    else
    {

      System.out.println ( "\nAluno reprovado na materia " ) ;

    }

  }


  public static void main ( String [ ] args )
  {

    Scanner ler = new Scanner ( System.in ) ;
    AlunoPrivate aluno = new AlunoPrivate (  ) ;

    double v[] = new double[3] ;
    double aprovado = 0 ;

    System.out.println ( "Digite o nome do aluno : " ) ;
    aluno.setNome ( ler.nextLine (  ) ) ;

    System.out.println ( "\nDigite a idade do estudante : " ) ;
    aluno.setIdade ( ler.nextInt (  ) ) ;

    for ( int i = 0; i < 3; i++ )
    {

      if ( i == 0 )
      {

        System.out.println("\nDigite a nota da primeira prova : ") ;

      }

      else if ( i == 1 )
      {

        System.out.println (  "\nDigite a nota da segunda prova : " ) ;

      }

      else
      {

        System.out.println ( "\nDigite a nota da terceira prova : " ) ;

      }

      v[i] = ler.nextDouble () ;

    }

    aluno.setNotas ( v ) ;

    aprovado = aluno.media ( aluno.getNotas ( ) ) ;

    avaliacao ( aprovado ) ;

  }

}
