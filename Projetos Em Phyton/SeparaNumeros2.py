n = str ( input ( "Digite um número inteiro entre 0 à 9999 : " ) )

aux = int ( n )

i = 0

while ( aux > 9999 ) :

    print ( "\nValor inválido !!!!" )
    n = str ( input ( "\nDigite um número inteiro entre 0 à 9999 : " ) )

tamanho = len ( n ) - 1

while ( tamanho >= 0 ) :

    if ( tamanho == 3 ) :

        print ( "\nUnidade : {}".format ( n[tamanho] ) )

    elif ( tamanho == 2 ) :

        print ( "\nDezena : {}".format ( n[tamanho] ) )

    elif ( tamanho == 1 ) :

        print ( "\nCentena : {}".format ( n[tamanho] ) )

    else :

        print ( "\nMilhar : {} ".format ( n[tamanho] ) )

    tamanho -= 1
