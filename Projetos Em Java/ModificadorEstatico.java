package modificador.modificador_static ;

public class ModificadorEstatico
{

  private String placa ;
  private double velocidadeMaxima ;
  private double velocidadeLimite ;

  public ModificadorEstatico ( String placa, double velocidadeMaxima, double velocidadeLimite )
  {

    this.placa = placa ;
    this.velocidadeMaxima = velocidadeMaxima ;
    this.velocidadeLimite = velocidadeLimite ;

  }

  public ModificadorEstatico (  )
  {



  }

  public void setplaca ( String placa  )
  {

    this.placa = placa ;

  }

  public void setVelocidadeMaxima ( double velocidadeMaxima )
  {

    this.velocidadeMaxima = velocidadeMaxima ;

  }

  public void setVelocidadeLimite ( double velocidadeLimite )
  {

    this.velocidadeLimite = velocidadeLimite ;

  }

  public String getplaca (  )
  {

    return placa ;

  }

  public double getVelocidadeMaxima (  )
  {

    return velocidadeMaxima ;

  }

  public double getVelocidadeLimite (  )
  {

    return velocidadeLimite ;

  }

}
