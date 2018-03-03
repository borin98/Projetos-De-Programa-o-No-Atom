n = input ( "Digite Algo Aqui : " )

entrar = 0

if ( n. isnumeric (  ) == True ) :

    print ( "Você Digitou Um Número !!!" )

    entrar = 1

elif ( n.isalpha (  ) == True ) :

    print ( "Você Digitou Um Caracter" )

    entrar = 1

if ( ( n. isalnum (  ) == True and entrar == 0 )  ) :

    print ( "Você Digitou Um Número E Uma Letra !!!" )

elif ( n.isalnum (  ) == False ) :

    print ( "Você Digitou Um Caracter Especial !!!" )
