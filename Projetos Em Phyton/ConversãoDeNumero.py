n = int ( input ( "Digite um número inteiro : " ) )

opcao = int ( input ( "\nDigite qual opção deseja converter o número ( 1 para binário, 2 para octal e 3 para hexadecimal ) : " ) )

while ( opcao < 1 or opcao > 3 ) :

    print ( "\nOpção inválida !!!" )
    opcao = int ( input ( "\nDigite qual opção deseja converter o número ( 1 para binário, 2 para octal e 3 para hexadecimal ) : " ) )

if ( opcao == 1 ) :

    binario = bin ( n )
    print ( "\nO número {} em binário será : {}".format ( n, binario [ 2: ] ) )

elif ( opcao == 2 ) :

    octal = oct ( n )
    print ( "\nO número {} em octal será : {}".format ( n, octal[ 2:]) )

else :

    print ( "\nO número {} em hexadecimal será : {}".format ( n, hex ( n ) [ 2: ] ) )
