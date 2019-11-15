# TBL1 - Fase 3
## Integrantes

| Nome | Matrícula | Github | Contribuição |
| -------- | -------- | -------- | --------- |
|Ícaro Oliveira|15/0129807|@icarooliv| 100% |
|Letícia Karla|15/0135939|@leticiaarj| 100% |
|Matheus Blanco|16/0138400|@MatheusBlanco| 100% |
|Max Henrique|16/0047013|@Maxlobo| 100% |
|Cauê Mateus|14/0056068|@caue96| 100% |
|Saleh Nazih Abdel Kader|16/0144485|@devsalula| 100% |
|Pedro Henrique Andrade Féo|17/002046|@phe0| 100% |
|Guilherme Marques Rosa|160007739|@guilhesme23| 100% |

**Obs: embora apenas um membro tenha realizado os commits, o grupo participou do desenvolvimento via Hangouts**

## Técnicas utilizadas

### Falsificação

Se existe um conecimento a cerca do problema e as soluções, mas a maneira da forma de codificar não é objetiva, é aconselhada a técnica de falsificação "Fake It".

É uma técnica simples que consiste em imaginar a solução e codificar a solução logo após, escrever os primeiros testes, isso faz com que o programador  seja obrigado a escrever novos testes e a pensar um pouco mais sobre o problema que está tentando se solucionar. Além disso, ao fim da solução o programador terá vários testes para provar que a sua implementação funciona. 

É uma técnica que traz os seguintes benefícios dois benefícios:

- Aumenta a confiança: uma vez que você terá vários testes para provar que a implementação continua funcionando mesmo depois de um refactoring.

- Ajuda a controlar o escopo: já que você pode tratar um problema isolando um pedaço dele e gradativamente adicionando complexidade à solução.

Apesar de às vezes ir contra a natureza criativa dos programadores, esta técnica nos ajuda a trabalhar com um foco bem definido, o tempo todo.

### Triangularização

Triangularização é uma das duas técnicas relativas ao método de _Test-Driven-Development_. A técnica possui esse nome através de uma analogia feita com a triangulação de radares, onde uma posição é obtida de maneira indireta a partir de um alcance determinado pelo radar e pela própria posição do radar.

Sendo assim, a técnica de triangularização possui duas características definitivas:

- Medição indireta: mapeia, a partir de alguns exemplos, o comportamento do que está sendo testado e depois o torna em algo mais generalizado do que o encontrado nos exemplos;
- Usa duas fontes de informação: se utiliza de dados obtidos de duas fontes, de maneira que se cria os testes da maneira mais simples possível de se implementar no começo, e progride aumentando a generalização a partir da obtenção dos outros exemplos.

Assim sendo, a técnica de triangularizar consiste na medição indireta a partir de mais de duas fontes ou exemplos, e onde se implementa o teste em sua forma mais simples, progredindo até a forma mais generalizada.

## Como triangularizar com parâmetros em frameworks de testes unitários

Deve haver uma forma no framework (através de imports por exemplo) que indique que em algum lugar do arquivo, irá ocorrer a presença de algum  teste parametrizado, seja pelo recebimento de alguma informação no código, ou de algum local externo (csv). E estruturar um teste que receba esses parâmetros e que informe a saída desejada.

## Análise Crítica

Foi interessante realizar o projeto seguindo os cinco passos estabelecidos, pelo fato de que escrever ao um novo teste, o desenvolvedor acaba por escrever um teste que será majoritariamente parecido com o anterior, ou seja, estará repetindo testes com parâmetros diferentes. Isso é um problema pelo fato de que se 12 situações diferentes necessitarem ser testadas, serão escritos 12 testes parecidos. Ao realizar a parametrização juntamente das técnicas empregadas, pode-se diminuir esta quantidade de testes realizados, ao mesmo tempo que se alcança um escopo maior do que os 12 testes não parametrizados. Caso haja mudanças no código, é mais fácil de se entender as mudanças em casos de uso a partir das falhas e sucessos dos testes.
- Facilidades: é mais custoso testar primeiro, mas é mais garantido o sucesso, a partir das técnicas empregadas, o que facilita o retrabalho.
- Dificuldades: configuração de ambiente da linguagem java, pois as pessoas do grupo não estavam acostumadas com a linguagem.
