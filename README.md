# aplicando-praticas-poo
Projeto de exemplo de aplicação da Orientação a Objeto em Java.

Criador do conceito da orientação a objetos
**Alan Kay**, formado em matemática e biologia.
Objetivo do Alan: tornar a programação mais simples.

**Fonte de estudos**: Canal youtube Curso em Vídeo
_www.youtube.com/user/cursosemvideo_

Pensando no desenvolvimento de um controle remoto:

**Comparação**:
* Linguagens não orientadas a objeto:
  Foco nos circuitos do controle.

* Linguagens Orientadas a Objeto:
  Foco nas funcionalidades de cada botão.
  
**Vantagens:** 

  **Confiável**: Isolamento do objeto não havendo conflito nas alterações.
  uma alteração na pilha do controle não impacta nas funcionalidades do controle
  também podemos inserir diferentes marcas de pilhas, nosso controle vai continuar funcionando.<br>  
  **Oportuno**: Podemos paralelizar o desenvolvimento.<br>
  **Manutenível**: Fácil manutenção.<br>
  **Extensível**: Fácil implementação de novas funcionalidades.<br>
  **Reutilizável**: Podemos reaproveitar o código das funcionalidades do controle para desenvolver outros controles.<br>
  **Natural**: Preocupação nas funcionalidades e não nos detalhes.<br>

  **O que é um Objeto?**
  Coisa material ou abstrata, que pode percebida pelos sentidos e descrita por 
  meio das suas características, comportamentos e estado atual.<br>

 **características:** azul_claro, grande, redondo, quadrado, modelo.<br>
 **Estado:** ligado, desligado, adiantado, ativado, desativado, buscando_rede, novo.<br>
 **Comportamento:** ligar, desligar, alterar a cor, desmarcar compromisso. <br>
 **Objeto:** Caneta da marca bic, azul, tampa azul.<br>
 
 **Classe:** Molde ou classificação com atributos e características.<br>
     ***Coisas que tenho***? modelo, cor ponta, carga, tampada, destampada. (características.)<br>
     ***Coisas que eu faço***? pode escrever, rabiscar, pintar, tampar, destampar.<br>
     ***Como eu estou agora***? neste momento, esta 50% carga, destampada e escrevento.<br>

* **Atributos:** Cor, ponta, model, carga, tampada;
    * (Cada atributo tem um valor/tipo: caractere, real, inteiro, logico)
* **Métodos:** Escrever, rabiscar, pintar, tampar, destampar, obter estado.
    * Exemplo: rabiscar(), tampar(), carregar()
    * para poder rabiscar devemos ter uma validação se ela esta tampada ou não e se tem carga.
* **Estado:** Vazia, cheia, tampada, destampadas.
    * Ao criar um objeto do tipo caneta
    * devemos informar suas  características
    * Ex: Model, Destampada, Azul, 90%carga

* **Instanciar**<br>
    * É quando queremos transformar a classe em objetos.
    podendo popular os valores dessa instancia com métodos.
    * Podemos ter inúmeros objetos e cada um deles contém seus diferentes valores.
        * Ex: Caneta1. Caneta2 (São instancias de caneta. objetos diferentes da mesma classe)
        * Caneta1 é vermelha e Caneta2 é azul, podemos tampar e destapar separadamente cada uma.

* **Classe/Objeto um conceito depende do outro**<br>
    * Classe: Define atributos e metodos comuns compartilhados pelo objeto.(Ex: forma de biscoito)
    * Objeto: É uma instancia de uma classe.(Ex: o biscoito com características do objeto e valores/estados diferentes)
    
* **Abstração/Abstrair uma ideia.**
    * É o primeiro pilar do poo, é o ato de definir os atributos essenciais do objeto.
    * Ex: temos diferentes atributos para os seres humanos;
    * Quais atributos que importam para o Aluno ? Nome, Idade.  
    * Quais atributos que importam para uma Modelo? Olhos claros? Altura.
    * Ex: 5 = Abstrato, 5 Gatos = Concreta.

* **UML Linguagem de Modelagem Unificada**
    * Linguagem de Modelagem Unificada: no POO utilizamos o UML para fazer diagramas de classes.
    * É utilizada para facilitar a repesentatividade de objetos não existenes ex: uma aula.
    * Exemplo de diagrama de classe

![UML](src/images/UML.png) ![UML](src/images/UML2.png)  

* **Modificadores de visibilidade**
    * indica o nível de acesso de atributos e métodos (represntados dessa forma no UML).
    * public: +
        * A classe atual e todas as outras tem acesso. 
    * private: -
        * Somente a classe pode acessar.
    * protected: #
        * Só a classe atual e as subclasses podem acessar.

* **Métodos Especiais** (garantem  uma segurança)
    * **Métodos Acessores**: utilizando esses métodos damos acesso mas não direto ao atributo.
        * *Getters*: métodos utilizados para dar acesso a um atributo;
            * Ex: getSaldo();
    * **Métodos Modificadores**: modificamos coisas dentro dos objetos.  
        * *Setters*: métodos utilizados para popular o valor de um atributo;
            * Ex: setSaldo(saldo);
