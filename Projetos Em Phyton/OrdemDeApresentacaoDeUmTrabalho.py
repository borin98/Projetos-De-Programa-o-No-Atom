from random import randint

i = 0
j = 0

vet = [0]*4

while ( i < 4 ) :

    vet[i] = str ( input ( "Digite o nome do aluno {} aluno : ".format ( ( i + 1 ) ) ) )
    i+=1

n = randint ( 0, 3 )

i = 0

while ( j < 4 ) :

    print ( "\nQuem será {} a apresentar será : {} ".format ( j, vet[n] ) )

    j+= 1
    n+= 1

    if ( n > 3 ) :

        n = 0
