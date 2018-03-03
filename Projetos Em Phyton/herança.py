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



pessoa_adulta = Pais ( "Silva", "azul" )
pessoa_adulta.informacao (  )

pessoa_crianca = Crianca ( "Silva", "castanho", 14 )
pessoa_crianca.informacao (  )
