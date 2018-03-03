import classes.aluno.EstudanteConstrutor ;
import java.util.Scanner ;

public class SobrecargaConstrutores
{

  public static void aprovacao ( EstudanteConstrutor est )
  {

    System.out.println ( "\nMedia do aluno : "+est.getMedia (  ) ) ;

    if ( est.getMedia (  ) >= 6.0 )
    {

      System.out.println ( "\nAluno "+est.getNome (  ) +" aprovado na materia" ) ;

    }

    else
    {

      System.out.println ( "\nAluno "+est.getNome (  )+ " reprovado na materia " ) ;

    }

  }

  public static double media ( double notas[], int j ,EstudanteConstrutor est )
  {

    double soma = 0 ;

    for ( int i = 0; i < j; i++ )
    {

      soma = notas[i] + soma ;

    }

    return soma/j ;

  }

  public static void montaNotas ( EstudanteConstrutor est, double notas[], int j, Scanner ler )
  {

    for ( int i = 0; i < j; i++ )
    {

      System.out.println ( "\nDigite a nota da "+(i + 1)+" prova do aluno "+est.getNome () ) ;
      notas[i] = ler.nextDouble (  ) ;
    }

  }

  public static void inicializacao ( double notas[], int n, Scanner ler, EstudanteConstrutor est )
  {

    int j ;
    String nome ;
    String matricula ;
    double media ;

    System.out.println ( "\nDigite a quantidade de alunos que deseja registrar : " ) ;
    j = ler.nextInt (  ) ;

    for ( int i = 0; i < j; i++ )
    {

      System.out.println ( "\nDigite o nome do aluno : " ) ;
      nome = ler.nextLine (  ) ;
      nome = ler.nextLine (  ) ;
      est.setNome ( nome ) ;

      System.out.println ( "\nDigite a matricula do aluno : " ) ;
      matricula = ler.nextLine (  ) ;
      est.setMatricula ( matricula ) ;

      montaNotas ( est, notas, j, ler ) ;

      media = media ( notas, j , est ) ;
      est.setMedia ( media ) ;

      aprovacao ( est ) ;

    }

  }

  public static void main ( String [ ] args )
  {

    Scanner ler = new Scanner ( System.in ) ;
    EstudanteConstrutor est = new EstudanteConstrutor (  ) ;

    int n ;

    System.out.println ( "\nDigite a quantidade de provas totais da materia : " ) ;
    n = ler.nextInt ( ) ;

    double notas[] = new double[n] ;

    inicializacao ( notas, n, ler, est ) ;

  }

}
