package classes.nota ;

public class Nota
{

  public String nome ;
  public int idade ;
  public double media ;

  public double calculoMedia ( double v[] )
  {

    return ( ( v[0] + v[1] + v[2] )/3 ) ;

  }


  public void imprimeResultado ( double avalicao )
  {

    System.out.println ( "\nNome do Aluno : "+this.nome ) ;
    System.out.println ( "\nIdade do aluno : "+this.idade ) ;
    System.out.println ( "\nMedia do aluno na disciplina : "+this.media ) ;

    if ( this.media >= 6.0 )
    {

      System.out.println ( "\n Aluno aprovado na disciplina " ) ;

    }

    else
    {

      System.out.println ( "\n Aluno reprovado na disciplina" ) ;

    }

  }

  public void setNome ( String nome )
  {

    this.nome = nome ;

  }

  public void setIdade ( int idade )
  {

    this.idade = idade ;

  }

  public void setNotas ( double media )
  {

    this.media = media ;

  }

  public String getNome (  )
  {

    return this.nome ;

  }

  public int getIdade (  )
  {

    return this.idade ;

  }

  public double getMedia (  )
  {

    return this.media ;

  }

}
