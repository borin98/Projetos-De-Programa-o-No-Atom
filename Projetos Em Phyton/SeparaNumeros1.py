n = int ( input ( "Digite um número inteiro entre 0 à 9999 : " ) )

i = 0

while ( n > 9999 ) :

    print ( "\nValor inválido !!!!" )
    n = int ( input ( "\nDigite um número inteiro entre 0 à 9999 : " ) )

while ( i < 3) :

    resto = n%10
    n = int (n/10)

    if ( i == 0 ) :

        print ( "\nUnidade : {}".format ( resto ) )

    elif ( i == 1 ) :

        print ( "\nDezena : {}".format ( resto ) )

    else :

        print ( "\nCentena : {}".format ( resto ) )
        print ( "\nMilhar : {}".format ( n ) )

    i+=1
