n = float ( input ( "Digite o valor do salário do trabalhador : R$ " ) )

d = int ( float ( "\nDigite o acréscimo do salário do trabalhador : R$ " ) )

valorTotal = 1 + ( d/100 )

print ( "O valor do salário do trabalhador será : R$ {:.2f}".format ( n*valorTotal ) )
