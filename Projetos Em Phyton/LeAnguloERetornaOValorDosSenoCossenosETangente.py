from math import sin, cos, tan

angulo = float ( input ( "Digite o valor do ângulo desejado, em graus, : " ) )

print ( "\nO valor do seno de {} é {:.3f} ".format ( angulo, sin ( angulo ) ) )
print ( "\nO valor do cosseno de {} é {:.3f} ".format ( angulo, cos ( angulo ) ) )
print ( "\nO valor da tangente de {} é {:.3f} ".format ( angulo, tan ( angulo ) ) )
