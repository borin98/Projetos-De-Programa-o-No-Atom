from random import randint

print ( "Bem -- Vindo ao meu jogo !!!" )
print ( "\nA regra é bem simples : adivinhe qual número estou pensando entre 0 à 5" )

numero_usuario = int ( input ( "\nDigite o número que estou pensado : " ) )

while ( ( numero_usuario < 0 ) or ( numero_usuario > 5 ) ) :

    print ( "\nOpção inválida !!!" )

    numero_usuario = int ( input ( "\nDigite o número que estou pensado : " ) )

print ( "\nVou pensar em um número ...." )

numero_computador = randint ( 0, 5 )

print ( "\nPensei no número {} enquanto você me falou {} ".format ( numero_computador, numero_usuario ) )

if ( numero_usuario == numero_computador ) :

    print ( "\nVocê venceu meu próprio jogo !!!!" )

else :

    print ( "\nVenci meu jogo e ganhei do jogo de Turing " )
    print ( "\nVou dominar o mundo !!!!!" )
