import urllib.request

def leitura_de_texto () :
    texto_n_lido = open ( "C:\Projetos De Programação Do Atom(Todas as linguagens)\Projetos em Phyton\Programa Que Captura Palavrao\movie_quotes.txt" )
    texto_lido = texto_n_lido.read (  )

    print ( texto_lido )

    texto_n_lido.close

    checa_palavrao ( texto_lido )

def checa_palavrao ( texto_para_reconhecer ):
    comparacao = urllib.request.urlopen ( "http://www.wdylike.appspot.com/?q=shot"+texto_para_reconhecer )

    output = comparacao.read (  )

    print ( output )

    comparacao.close (  )

leitura_de_texto (  )
