# State


> Um semáforo tem um temporizador que emite impulsos a intervalos regulares. Estes impulsos chegam ao controlador do semáforo sob a forma de chamadas ao método tick.

> 1. Em funcionamento normal, um tick faz com que o semáforo passe da cor vermelha para a verde, da verde para a amarela e da amarela para a vermelha, reiniciando o ciclo.

> 2. O semáforo tem ainda vários botões para controlo de situações especiais. Assim, o botão de pânico que faz com que o controlador mude o semáforo para a cor vermelha, qualquer que seja a anterior (método panic).

> 3. O botão off faz com que o semáforo mude imediatamente para amarelo intermitente (método off). Esta situação é interrompida através dos botões on (volta ao comportamento normal; método on) ou de pânico.

> 4. O botão on é a única forma de fazer semáforo sair da situação de pânico e recuperar o funcionamento normal. Além do código de controlo, o semáforo tem ainda um método (status) que permite saber a cor atual do semáforo.

> 5. O semáforo começa intermitente e quando recupera das situações de intermitência e de pânico fica vermelho. Implemente o semáforo e a sua máquina de estados. Dica: Utilizar o padrão de projeto State.
