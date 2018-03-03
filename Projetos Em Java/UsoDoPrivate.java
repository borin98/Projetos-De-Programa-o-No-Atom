import classes.nota.Nota ;

public class UsoDoPrivate
{

  public static void main ( String [ ] args )
  {

    Nota estudante = new Nota (  ) ;

    estudante.setNome ( "O nome sera inserido dentro daqui " ) ;
    estudante.setIdade ( 19 ) ;

     System.out.println ( estudante.getNome (  ) ) ; // precisa criar um novo método para contrar ele

  }

}
