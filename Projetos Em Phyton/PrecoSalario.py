salario = float ( input ( "Digite o valor do salário R$ : " ) )

if ( salario <= 1250.00 ) :

    print ( "\nO valor do aumento do salário é de 15%, logo : R$ {:.2f}".format ( 1.15*salario ) )

else :

    print ( "\nO valor do aumento do salário é de 15%, logo : R$ {:.2f}".format ( 1.10*salario ) )
