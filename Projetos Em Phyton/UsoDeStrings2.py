frase = input ( "Digite seu nome aqui : " )

print ( "\nSeu nome com todas as letras maiúsculas serão : {} ".format ( frase.upper (  ) ) )
print ( "\nSeu nome com todas as letras minúsculas serão : {}".format ( frase.lower (  ) ) )

i = 0
contador_total = 0
j = 1

while ( i < len ( frase ) ) :

    if ( frase[i] != ' ' ) :

        contador_total += 1

    else :

        if ( j == 1 ) :

            contador_primeiro = contador_total

            j = 0

    i+= 1

print ( "\nSeu nome possui {} letras no total ".format ( contador_total ) )
print ( "\nSeu nome possu {} letras no seu primeiro nome".format ( contador_primeiro ) )
