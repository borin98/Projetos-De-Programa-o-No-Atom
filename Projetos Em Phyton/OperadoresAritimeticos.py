nome = input ( "Digite seu nome aqui : " )

print ( "Prazer em te conhecer {:7}!!!" .format ( nome ) ) #alinhamento dos caracteres dentro do {} > (direita), <( esquerda ), ^ ( centraliza ), : (caracter)

n1 = int ( input ( "Digite um valor inteiro : " ) )
n2 = int ( input ( "Digite outro valor inteiro : " ) )

print ( "A soma de {} + {} = {}\n".format ( n1, n2, ( n1 + n2 ) ) )

if ( n1 == 0 and n2 != 0) :

    print ( "A divisao de {} / {} = {}\n".format ( n1, n2, 0 ) )
    print ( "Nao é possível fazer essa divisão de {} / {} !!!\n".format ( n2, n1 ) )

elif ( n2 == 0 and n1 != 0 ) :

    print ( "Nao é possível fazer essa divisão de {} / {} !!!\n".format ( n1, n2 ) )
    print ( "A divisão de {} / {} = {}\n".format ( n2 , n1, 0 ) )


elif ( n1 == 0 and n2 == 0 ) :

    print ( "Não é possível fazer esta divisão !!!\n" )

else :

    print ( "A divisão de {} / {} = {:.2f}\n ".format ( n1, n2, float ( n1/n2 ) ) )
    print ( "A divisão de {} / {} = {:.2f}\n ".format ( n2, n1, float ( n2/n1 ) ) )

    print ( "A divisão inteira de {} / {} = {}\n".format ( n1, n2, ( n1//n2 ) ) )
    print ( "A divisao inteira de {} / {} = {}\n".format ( n2, n1, ( n2//n1 ) ) )

print ( "A multiplicação de {} * {} = {}\n".format ( n1, n2, ( n1*n2 ) ) )
print ( "A potenciação de {}**{} = {}\n".format ( n1, n2, ( n1**n2 ) ) )
print ( "A potenciaçao de {}**{} = {}\n".format ( n2, n1, ( n2**n1 ) ) )
