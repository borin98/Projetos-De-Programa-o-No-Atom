package classes.aluno ;

public class AlunoPrivate // o método private é utilizado para reduzir o que chamamos de acoplamento, o qual é um método sem "poucos filtros"
{

  private String nome ;
  private int idade ;
  private double[] nota ;
  private boolean aprovados ;

  public void setNome ( String nome )
  {

    this.nome = nome ;

  }

  public void setIdade ( int idade )
  {

    this.idade = idade ;

  }

  public void setNotas ( double [] nota )
  {

    this.nota = nota ;

  }

  public double media ( double [] notas )
  {

    return ( ( notas[0] + notas[1] + notas[2] ) / 3 ) ;

  }

  public String getNome ( )
  {

    return this.nome ;

  }

  public int getIdade ( )
  {

    return this.idade ;

  }

  public double [] getNotas (  )
  {

    return this.nota ;

  }

  public boolean isAprovados (  )
  {

    return this.aprovados ; // não modifica o atributo durante o código

  }

}
