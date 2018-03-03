frase = input ( "Digite uma frase aqui : " )

i = 0
A_total = 0
A_primeira = 0
A_ultima = 0
j = 0

while ( i < len ( frase ) ) :

    if ( frase[i] == 'a' or frase[i] == 'A' ) :

        A_total += 1

        A_ultima = i

        if ( j == 0 ) :

            A_primeira = i
            j = 1

    i += 1

print ( "\nA quantidade de vezes que aparece a na frase é : {}".format ( A_total ) )
print ( "\nA primeira posição que aparece a letra a é : {} ".format ( A_primeira ) )
print ( "\nA última vez que aparece a letra a é : {}".format ( A_ultima ) )
