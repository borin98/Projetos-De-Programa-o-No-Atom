package classes.aluno ;

public class EstudanteConstrutor
{

  private String matricula ;
  private String nome ;
  private double media ;

  public EstudanteConstrutor ( String matricula, String nome)
  {

    this.matricula = matricula ;
    this.nome = nome ;

  }

  public EstudanteConstrutor ( String matricula, String nome, double media  )
  {
    //este método é útil para lançar pacotes que os usuários podem usar ao longo do tempo, sem prejudicalos ao longo do tempo 
    this ( matricula, nome ) ; // está chamando o próprio construtor dento dele
    this.media = media ;

  }

  public void setMatricula ( String matricula )
  {

    this.matricula = matricula ;

  }

  public void setNome ( String nome )
  {

    this.nome = nome ;

  }

  public void setMedia ( double media )
  {

    this.media = media ;

  }

  public String getMatricula (  )
  {

    return matricula ;

  }

  public String getNome (  )
  {

    return nome ;

  }

  public double getMedia (  )
  {

    return media ;

  }

}
