ano = int ( input ( "Digite qual ano você está : " ) )

if ( ( ( ano%4 == 0 ) and ( ano%100 != 0 ) ) or ( (ano%4 != 0 ) and ( ano%400 == 0 ) ) ) :

    print ( "\nO ano é bissexto" )

else :

    print ( "\nO ano não é bissexto" )
