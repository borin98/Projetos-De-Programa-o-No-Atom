import os
import re

def renomeia_pasta (  ):
    diretorio = os.listdir ( r"C:\Users\Borin\AppData\Local\atom\Projetos De Programação Do Atom(Todas as linguagens)\Linguagem em C\Projetos em Phyton\Programa resolve puzzle\prank" )

    pasta_lista = os.getcwd()

    print ( "O diretório atual é : "+pasta_lista )

    os.chdir ( r"C:\Users\Borin\AppData\Local\atom\Projetos De Programação Do Atom(Todas as linguagens)\Linguagem em C\Projetos em Phyton\Programa resolve puzzle\prank" )

    for file_name in diretorio :
        os.rename ( file_name, re.sub ( '[0-9]', '', file_name ) )
        print ( file_name )

renomeia_pasta (  )
