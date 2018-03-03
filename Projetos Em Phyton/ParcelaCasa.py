casa = float ( input ( "Digite o valor da casa R$ : " ) )
salario = float ( input ( "\nDigite o valor do salário do cliente R$ : " ) )
prestacoes = int ( input ( "\nDigite a quantidade de prestações da casa : " ) )

valor_final_prestacao = casa/prestacoes

if ( valor_final_prestacao <= ( 0.30*salario ) ) :

    print ( "\nO empréstimo será de R$ : {}".format ( valor_final_prestacao ) )

else :

    print ( "\nPrestação negada !!!" )
