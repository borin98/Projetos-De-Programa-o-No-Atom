from math import sqrt

o = float ( input ( 'Digite o valor do cateto oposto , em metros, : ' ) )

a = float ( input ( "\nDigite o valor do cateto adjacente, em metros, : " ) )

h = ( o**2 ) + ( a**2 )

print ( "\nO valor da hipotenusa será : {:.3f} m".format ( sqrt ( h ) ) )
