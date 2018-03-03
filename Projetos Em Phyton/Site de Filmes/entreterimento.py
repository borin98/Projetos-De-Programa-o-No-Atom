import filme
import site_de_filmes

jojo_bizarre_adventure_s1 = filme.Filme ( "JoJo no Kimyou na Bouken",
                                                                    "Uma épica aventura de terror e ação! Abrangendo as gerações da família Joestar, cada arco foca um certo membro da família e suas batalhas com vampiros, super vampiros e outros usuários de Stands. Phantom Blood mostra JOnathan Joestar e a ambição de Dio Brando. Mostra como a mascara de pedra foi encontrada e como Dio obteve e utilizou seus poderes. Assim que Jonathan e Robert. E. O. Speedwagon percebem as intenções de Dio, eles devem se juntar a Will A. Zepelli e aprender sobre a Onda (Hamon) para impedir Dio.",
                                                                    "https://myanimelist.cdn-dena.com/images/anime/3/40409l.jpg",
                                                                    "https://www.youtube.com/watch?v=EO08vMz73YY" )

jojo_bizarre_adventure_s2 = filme.Filme ( "Jojo no Kimyou na Bouken : Stardust Crusaders",
                                                                    "JoJo no Kimyou na Bouken, está de volta mostrando o terceiro arco do mangá, o anime é continuação direta de JoJo no Kimyou na Bouken: Battle Tendency, contando a saga de Jotaro Kujo, o mais furioso dos membros da família Joestar.",
                                                                    "https://myanimelist.cdn-dena.com/images/anime/11/55267l.jpg",
                                                                    "https://www.youtube.com/watch?v=_ZGRCxnAiaU")

jojo_bizarre_adventure_s3 = filme.Filme ( "Jojo no Kimyou na Bouken : Stardust Crusaders - Second Seasson",
                                                                     "Segunda temporada de Stardust Crusaders, seguindo a metade da história conhecida como o “Arco do Egito” em que a verdadeira luta contra Dio começará.",
                                                                     "https://vignette.wikia.nocookie.net/jjba/images/3/3b/StadustAnime-Promo.jpg/revision/latest?cb=20161111024204",
                                                                     "https://www.youtube.com/watch?v=hqjByToSauQ")

jojo_bizarre_adventure_s4 = filme.Filme ( "JoJo no Kimyou na Bouken : Diamond wa Kudakenai",
                                                                        "Quarta história de Jojo no Kimyou na Bouken. A cidade costeira de Moriah é atormentada pelo “Arco e Flecha”, um artefato antigo que manifesta as habilidades latentes conhecidas como Stands em criminosos e pessoas comuns. Ao mesmo tempo que precisam lidar com o enorme afluxo de usuários – bons e maus -em Morioh. ",
                                                                        "https://myanimelist.cdn-dena.com/images/anime/4/77157l.jpg",
                                                                        "https://www.youtube.com/watch?v=t8WxJVBhiTY")

filmes = [jojo_bizarre_adventure_s1, jojo_bizarre_adventure_s2, jojo_bizarre_adventure_s3, jojo_bizarre_adventure_s4]

site_de_filmes.open_movies_page ( filmes )
