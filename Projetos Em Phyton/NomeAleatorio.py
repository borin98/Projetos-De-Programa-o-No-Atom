from random import randint

i = 0

vet = [0]*4

while ( i < 4 ) :

    vet[i] = str ( input ( "Digite o nome do aluno {} aluno : ".format ( ( i + 1 ) ) ) )
    i+=1

n = randint ( 0, 3 )

print ( "\nO aluno que apagará a lousa será {} ".format ( vet[n] ) )
