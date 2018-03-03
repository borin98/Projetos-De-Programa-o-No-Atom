a = int ( input ( "Digite o número da primeira medida : " ) )
b = int ( input ( "Digite o número da segunda medida : " ) )
c = int ( input ( "Digite o número da terceira medida : " ) )

medida1 = b - c
medida2 = a - c
medida3 = a - b

if ( medida1 < 0 ) :

    medida1 = -1*medida1

if ( medida2 < 0 ) :

    medida2 = -1*medida2

if ( medida3 < 0 ) :

    medida3 = -1*medida3

if ( ( ( medida1 < a ) and ( a < b + c ) ) and ( ( medida2 < b ) and ( b < a + c ) ) and ( ( medida3 < c ) and c < a + c ) ) :

    print ( "\nIsto forma um triângulo !!!" )

else :

    print ( "\nIsto não forma um triângulo !!!" )
