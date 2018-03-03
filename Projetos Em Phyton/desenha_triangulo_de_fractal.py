import turtle
import math
import time

def desenha_fractal_triangulo ( aux_len ) :
    for i in range ( 3 ) :
        Robertina.forward ( aux_len )
        Robertina.left ( 120 )

def desenha_triangulo_sp ( x, y, aux_len ):
    if ( aux_len <= 5 ) :
        return

    else :
        Robertina.up (  )
        Robertina.goto ( x, y )
        Robertina.down (  )
        desenha_fractal_triangulo ( aux_len )

        desenha_triangulo_sp( x, y, aux_len/2 )
        desenha_triangulo_sp( x + (aux_len/2), y, aux_len/2)
        desenha_triangulo_sp( x + (aux_len/4), y + ( (math.sqrt(3)/4)*aux_len), aux_len/2)

def aumenta_velocidade_de_Robertina (  ) :

    turtle.delay ( 0 )
    Robertina.color ( "yellow" )
    Robertina.speed ( 9 )
    turtle.tracer ( 30, 0 )

Robertina = turtle.Turtle (  )

aumenta_velocidade_de_Robertina (  )

comeca = time.time (  )

window = turtle.Screen (  )
window.bgcolor ( "black" )

desenha_triangulo_sp ( -200, -200, 800 )

Robertina.write ( "Tempo Para Fazer o Fractal : "+str( time.time (  ) - comeca ) + "s" )

window.exitonclick (  )
