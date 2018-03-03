l = float ( input ( "Digite a largura da parede, em metros : " ) )
a = float ( input ( "Digite a altura da parede, em metros : " ) )

print ( "A área da parede é : {:.2f} m^2".format ( l*a ) )
print ( "\nA quantidade de tinta necessária será : {:.3f} tintas ( sabendo que cada tinta cobre uma área de 2 m^2 )".format ( int ( l*a )/2 ) )
