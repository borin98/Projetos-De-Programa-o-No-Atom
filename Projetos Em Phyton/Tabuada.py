n = int ( input ( "Digite a tabuada que deseja ser calculada : " ) )

print ( "\n" )

print ( "="*10, end = ' ' )
print ( " Tabuda do {} ".format ( n ), end = ' ' )
print ( "="*10 )

i = 1

while ( i <= 10 ) :

    print ( "|"*10, end = '  ' )
    print ( "{}*{} = {:6}".format ( n, i, ( n*i ) ), end = '  ' )
    print ( "|"*10 )

    i+= 1

print ( "="*36 )
