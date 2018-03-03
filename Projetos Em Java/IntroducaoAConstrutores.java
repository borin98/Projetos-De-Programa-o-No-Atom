package classes.construtores ;

public class IntroducaoAConstrutores//Construtores não terao retorno
{

  private String nome ;
  private String cpf ;
  private double salario ;
  private String rg ;

  public IntroducaoAConstrutores (String nome, String cpf, double salario)
  {

    this.nome = nome ;
    this.cpf = cpf ;
    this.salario = salario ;

    System.out.println ( "\nDentro da classe " ) ;
    System.out.println ( this.nome ) ;
    System.out.println ( this.cpf ) ;
    System.out.println ( this.salario ) ;

  }

  public void init ( String nome, String cpf, double salario )
  {

    this.nome = nome ;
    this.cpf = cpf ;
    this.salario = salario ;

  }

  public void init ( String nome, String cpf, double salario, String rg )
  {

    init ( nome, cpf, salario ) ;
    this.rg = rg ;

  }

}
