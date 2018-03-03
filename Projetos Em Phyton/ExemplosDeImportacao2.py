from math import sqrt, ceil, floor

n = int ( input ( "Digite um número : " ) )

print ( "\n A raiz do número {} é : {:.3f}".format ( n, ( sqrt ( n ) ) ) )
print ( "\n A raiz do número {} arredondado pra cima é : {}".format ( n, ceil ( n ) ) )
print ( "\n A raiz do número {} arredondado pra baixo é : {}".format ( n, floor ( n ) ) )
