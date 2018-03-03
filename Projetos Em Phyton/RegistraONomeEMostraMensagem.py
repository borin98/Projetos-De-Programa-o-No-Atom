nome = input ( "Digite Seu Nome : " )

numero = int ( input ( nome+" , Digite Um Número Entre 0 E 2 : " ) )

while ( numero > 2 or numero < 0 ) :

    if ( numero > 2 ) :

        print ( "O Número "+str (numero) + " É Inválido !!!, Pois É Maior Que 2" )
        numero = int ( input ( nome+" , Digite Um Número Entre 0 E 2 : " ) )

    else :

        print ( "O Número "+ str ( numero ) +" É Inválido !!!, Pois É Menor Que 0" )
        numero = int ( input ( nome+" , Digite Um Número Entre 0 E 2 : " ) )

if ( numero == 0 ) :

    print ( "Seja Bem - Vindo Ao Phyton !!!" )

elif ( numero == 1 ) :

    print ( " Tenha Um Ótimo Dia !!!"+nome )

else :

    print ( "O Dia Está Lindo Hoje !!!" )
