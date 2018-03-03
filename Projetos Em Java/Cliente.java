package classes.blocodeinicializacao ;

public class Cliente
{

  private int parcelas[] ;
  { // bloco de inicialização, ele sempre inicializa em qualquer lugar, mas sempre antes da classe cliente

    parcelas = new int [100] ;

    for ( int i = 0; i < 100; i++ )
    {

      parcelas[i] = i + 1 ;

    }

  }

  public Cliente (  )// não posso jogar valores para inicializar dentro do construtor
  {


  }

  public void setParcelas ( int parcelas[] )
  {

    this.parcelas = parcelas ;

  }

  public int [] getParcelas (  )
  {

    return parcelas ;

  }

}
