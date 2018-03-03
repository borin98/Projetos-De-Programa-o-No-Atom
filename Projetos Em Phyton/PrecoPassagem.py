distancia = float ( input ( "Digite a distância da viagem, em Km , que você irá percorrer : " ) )

if ( distancia <= 200 ) :

    print ( "\nVocê pagará R$ {}".format ( 0.5*distancia ) )

else :

    print ( "\n Você pagará R$ {}".format ( 0.45* ( distancia - 200 ) ) )
