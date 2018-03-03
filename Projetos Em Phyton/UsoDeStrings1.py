from random import randint

frase = str ( input ( "Digite uma frase aqui : " ) )

print ( "\nA palavra letra por letra será : \n" )

i = 0

while ( i < len ( frase ) ) :

    print ( frase[i] )
    i+= 1

n1 = randint ( 0, len ( frase ) )
n2 = randint ( 0, len ( frase ) )
n3 = randint ( 0,  len ( frase ) )

while ( n1 == n2 ) :

    n1 = randint ( 0, len ( frase ) )
    n2 = randint ( 0, len ( frase ) )

if ( n1 > n2  ) :

    print ( "\nA frase digitada no intervo de {} até {} será : {}".format ( n2, n1 - 1, frase[n2:n1] ) )

else :

    print ( "\nA frase digitada no intervo de {} até {} será : {}".format ( n1, n2 - 1, frase[n1:n2] ) )

if ( n1 > n2  ) :

    print ( "\nO intervalo da frase que será copiado será, saltando {} palavras : {}".format ( n3, frase[n2:n1:n3] ) )

else :

    print ( "\nO intervalo da frase que será copiado será, saltando  {} palavras : {}".format ( n3, frase[n1:n2:n3] ) )
