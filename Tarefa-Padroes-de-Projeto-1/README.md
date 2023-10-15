Fábrica de carros utilizando o Design Patern Factory Method

Explicando cada classe/interface:

Interface ICarro:
Métodos para criação de um carro, esses métodos são herdados em classes de diferentes tipos de carros

Classe CarroSedan:
Implementa os métodos contidos na interface ICarro

Classe CarroSUV: 
Mesma função da classe CarroSedan 
(aqui é possível notar que qualquer tipo de Carro pode ser criado usando esses métodos, basta implementar a Interface ICarro)

Interface IFabricaCarros:
Cria um novo método que instancia a interface ICarro

FabricaCarroSedan:
Implementa a interface IFabricaCarro, aqui retorna um novo CarroSedan, ou seja, os métodos de criação desse carro

FabricaCarroSUV:
Mesma função da classe FabricaCarroSUV

Programa:
Classe executável, nela deixei alguns métodos como exemplo, 
devs podem ficar à vontade para alterá-la e testar as saídas no console


