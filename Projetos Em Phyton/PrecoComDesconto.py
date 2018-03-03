n = float ( input ( "Digite o preço do produto, em reais : R$  " ) )

d = int ( input ( "\nDigite o valor do desconto que deseja aplicar sobre o produto : " ) )

valorFinal = 1 - ( d/100 )

print ( "\nO novo preço do produto com {:.2f} % de desconto será : R$ {:.2f} ".format ( d , ( n*valorFinal) ) )
