n1 = float ( input ( "Digite a nota da primeira prova : " ) )
n2 = float ( input ( "Digite a nota da segunda prova : " ) )

media  = (n1 + n2 )/2

print ( "\nA sua média foi : {:.2f}".format ( media ) )

if ( media >= 6.0 ) :

    print ( "\nAluno aprovado" )

else :

    print ( "\nAluno reprovado" )
