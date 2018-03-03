import turtle

def desenha_quadrado ( Robertina ) :

    for i in range ( 1, 5 ) :

        Robertina.forward ( 100 )
        Robertina.right ( 90 )

def desenha_arte (  ) :

    aux = 0

    window = turtle.Screen (  )
    window.bgcolor ( "red" )

    Robertina = turtle.Turtle (  )
    Robertina.shape ( "turtle" )
    Robertina.color ( "black" )
    Robertina.speed ( 2 )

    for i in range ( 0, 36 ):

        desenha_quadrado ( Robertina )
        Robertina.right ( 10 )

    window.exitonclick (  )

desenha_arte (  )
