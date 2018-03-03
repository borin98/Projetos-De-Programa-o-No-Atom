import math #importa todas as funções pertencentes da biblioteca math

n = int ( input ( "Digite um número : " ) )

raiz = math.sqrt ( n )

print ( "\nA raiz do {} número é : {:.3f}".format ( n, raiz ) )
print ( "\nA raiz do {} número arredondado pra cima é : {}".format ( n, math.ceil ( raiz ) ) )
print ( "\nA raiz do {} número arredondado pra baixo é : {}".format ( n, math.floor ( raiz ) ) )
