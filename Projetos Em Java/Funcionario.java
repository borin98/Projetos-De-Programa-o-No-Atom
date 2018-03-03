package classes.funcionario ;

public class Funcionario
{

  private String nome ;
  private String cpf ;
  private double salario ;
  private String rg ;

  public void init ( String nome, String cpf, double salario )
  {

    this.nome = nome ;
    this.cpf = cpf ;
    this.salario = salario ;

  }
  //sobrecarga de métodos é aquele que copia um outro método com dados de entrada diferentes
  // o java irá procurar o melhor método que se encaixa neste padrão
  public void init ( String nome, String cpf, double salario, String rg )
  {

    init ( nome, cpf, salario ) ;

    this.rg = rg ;

  }

  public void setNome ( String nome )
  {

    this.nome = nome ;

  }

  public void setCpf ( String cpf )
  {

    this.cpf = cpf ;

  }

  public void setSalario ( double salario )
  {

    this.salario = salario ;

  }

  public String getNome ( )
  {

    return this.nome ;

  }

  public String getCpf (  )
  {

    return this.cpf ;

  }

  public double getSalario (  )
  {

    return this.salario ;

  }

  public void imprime (  )
  {

    System.out.println ( "\n Nome : "+this.nome ) ;
    System.out.println ( "\n Cpf : "+this.cpf ) ;
    System.out.println ( "\n Salario R$ : "+this.salario ) ;

  }

}
