{

import java.util.Scanner ;

  public static void main ( String [ ] args )
  {

    Scanner ler = new Scanner ( System.in ) ;

    System.out.print ( "\nDigite o nome do aluno : " ) ;
    String nome = ler.nextLine (  ) ;

    System.out.print ( "\nDigite a nota do aluno : " ) ;
    float nota = ler.nextFloat (  ) ;

    System.out.printf ( "\nA nota do aluno %s e : %.2f\n", nome, nota ) ;

  }

}
