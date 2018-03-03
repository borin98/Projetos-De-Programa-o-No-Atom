import random

n1 = random.random (  )

print ( "\nA função random gera apenas um número entre 0 e 1, neste caso gerou o número {:.3f}".format ( n1 ) )

n2 = int ( input ( "\nDigite um número inteiro : " ) )
n3 = int ( input ( "\nDigite outro número inteiro : " ) )
num = random.randint ( n2, n3 )

print ( "\nO número aleatório gerado entre {} e {} será {}".format ( n2, n3, num ) )
