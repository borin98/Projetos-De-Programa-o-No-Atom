import string

class Pais (  ) :
    def __init__ ( self, sobrenome, cor_dos_olhos ) :
        self.sobrenome = sobrenome
        self.cor_dos_olhos = cor_dos_olhos

    def informacao (  self ) :
        print ( "Último Nome : "+self.sobrenome )
        print ( "Cor Dos Olhos : "+self.cor_dos_olhos )

class Crianca ( Pais ) :
    def __init__ ( self, sobrenome, cor_dos_olhos, numero_brinquedos ) :
        Pais.__init__ ( self, sobrenome, cor_dos_olhos )
        self.numero_brinquedos = numero_brinquedos

    def informacao ( self ) :
        print ( "Último Nome : "+self.sobrenome )
        print ( "Cor Dos Ólhos : "+self.cor_dos_olhos )
        print ( "Número de brinquedos : "+str ( self.numero_brinquedos ) )



i = 0

while ( i != 1 ) :

    if ( i == 0 ) :
        sobrenome_adulto = input ( 'Digite o sobrenome do adulto ( Aperte apenas q ou Q para sair do console ) : ' )

        if ( sobrenome_adulto == 'Q' or sobrenome_adulto == 'q' ) :

            i = 1
            print ( "Obrigado por registrar estes dados !!!!\n " )

        elif ( i == 0 ) :

            olhos_adulto = input ( 'Digite a cor dos olhos do adulto ( Aperte apenas q ou Q para sair do console ) : ' )

            if ( olhos_adulto == 'Q' or olhos_adulto == 'q') :

                i = 1
                print ( "\n" )
                print ( "Obrigado por registrar estes dados !!!!\n " )

            elif ( i == 0 ) :

                print ( "\n" )

                sobrenome_crianca = input ( 'Digite o sobrenome da criança ( Aperte apenas q ou Q para sair do console ) :  ' )

                if ( sobrenome_crianca == 'Q' or sobrenome_crianca == 'q' ) :

                    i = 0
                    print ( "\n" )
                    print ( "Obrigado por registrar estes dados !!!!\n " )

                else :

                    olhos_crianca = input ( 'Digite a cor dos olhos do adulto ( Aperte apenas q ou Q para sair do console ) : ' )

                    if ( olhos_crianca == 'Q' or olhos_crianca == 'q' ) :

                        i = 1
                        print ( "\n" )
                        print ( "Obrigado por registrar estes dados !!!!\n " )

                    elif ( i == 0 ) :

                        numero_brinquedos = input ( 'Digite a quantidade de brinquedo da crinca ( Aperte apenas q ou Q para sair do console ) : ' )

                        if ( numero_brinquedos == 'q' or numero_brinquedos == 'Q' ) :

                            i = 1
                            print ( "\n" )
                            print ( "Obrigado por registrar estes dados !!!!\n " )

                        elif ( i == 0 ) :

                            print( "\n" )

                            print ("Dados Do Adulto : \n")
                            pessoa_adulta = Pais ( sobrenome_adulto, olhos_adulto )
                            pessoa_adulta.informacao (  )

                            print ( "\n" )

                            print ( "Dados Da Criança : \n" )
                            pessoa_crianca = Crianca ( sobrenome_crianca, olhos_crianca, (numero_brinquedos) )
                            pessoa_crianca.informacao (  )

                            print ( "\n" )
