nome = input ( "Digite seu nome completo aqui : " )

i = 0
j = 0

primeiro_nome = nome
ultimo_nome = nome

while ( i < len ( nome ) ) :

    if ( nome[i] == ' ' ) :

        ultimo_nome = nome[ ( i+1 ) :len ( nome ) ]

        if ( j == 0 ) :

            primeiro_nome = nome[0:i]
            j = 1

    i += 1

print ( "\nPrimeiro nome : {}".format ( primeiro_nome ) )
print ( "\nÚltimo nome : {}".format ( ultimo_nome ) )
