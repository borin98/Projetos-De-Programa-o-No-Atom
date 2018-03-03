frase = input ( "Digite a frase aqui : " )
palavra = input ( "\nDigite a palavra que deseja encontrar : " )

frase = frase.upper (  )
palavra = palavra.upper (  )

if ( frase.find ( palavra ) >= 0 ) :

    print ( "\nA frase possui a palavra {} em seu texto ".format ( palavra ) )

else :

    print ( "\nA frase não possui a palavra {} em seu texto ".format ( palavra ) )
