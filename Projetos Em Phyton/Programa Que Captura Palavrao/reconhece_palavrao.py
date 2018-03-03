import urllib.request

def leitura_de_texto () :
    texto_n_lido = open ( "C:\Projetos De Programação Do Atom(Todas as linguagens) No Diretorio e funcional\Projetos em Phyton\Programa Que Captura Palavrao\movie_quotes.txt" )
    texto_lido = texto_n_lido.read (  )

    texto_n_lido.close

    checa_palavrao ( texto_lido )

def checa_palavrao ( texto_para_reconhecer ):
    comparacao = urllib.request.urlopen ( "http://www.wdylike.appspot.com/?q=shot"+urllib.parse.quote(texto_para_reconhecer) )

    output = comparacao.read (  )

    comparacao.close (  )

    if "true" in output :
        print ( "Palavrao detectado !!!!!" )

    elif "false" in output :
        print ( "Não Há Palavrao Detectado Neste Texto !!!!" )

    else :
        print ( "Não foi possível abrir este arquivo !!!" )

leitura_de_texto (  )
