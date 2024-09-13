3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

    Soma = 77

4) Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, ___
b) 2, 4, 8, 16, 32, 64, ____
c) 0, 1, 4, 9, 16, 25, 36, ____
d) 4, 16, 36, 64, ____
e) 1, 1, 2, 3, 5, 8, ____
f) 2, 10, 12, 16, 17, 18, 19, ____

    a) 9

    b) 128

    c) 49

    d) 100

    e) 13

    f) 20



5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? 

    1°) Ligar 1° interruptor e esperar um tempo 


    2°) Após o tempo, apagar 1° interruptor e acender o 2° interruptor

    3°) Ir para sala 1:

        Se a lãmpada estiver acesa:
            2° Interruptor -> Sala 1
        Senão:
            Se lâmpada estiver apagada e quente:
                1° Interrutor -> Sala 1
            Senão:
                Se lâmpada estiver apagada e fria:
                    3° Interruptor -> Sala 

    4°) Acender um dos interruptores que sobraram e ir para a Sala 2

        Se a lâmpada estiver acessa, o interruptor acendido será dessa sala e o que sobrou da outra
        Se a lâmpada estiver apagada, o interruptor acendido é o da sala 3 e a o que sobrou é da sala 2