velocidade = int ( input ( "Digite a velocidade do veículo, em km/h : " ) )

multa = 0

if ( velocidade > 80 ) :

    print ( "\nVocê ultrapassou a velocidade permitida de 80 km/h com {} km/h".format ( velocidade ) )

    multa = 7* ( velocidade - 80 )

    print ( "\nVocê vai pagar uma multa de R$ {}".format ( multa ) )

else :

    print ( "\nVocê está dentro da norma de trânsito permitida !" )
