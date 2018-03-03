import webbrowser
import time

total_breaks = 3
break_count = 0

print ( "O horário atual é : "+time.ctime () )
while ( break_count < total_breaks ) :
    time.sleep ( 3600*2 )
    webbrowser.open ( "https://www.youtube.com/watch?v=0nV8E79oSSY" )
    break_count = break_count + 1
