# Abstract Factory

Este pacote implementa uma fábrica abstrata para armas elementais.

Qualquer tipo de arma deve ser declarada como uma interface em abstract_factory/weapons, e suas respectivas versões elementais devem ser implementadas em abstract_factory/elemental_weapons.

Agora o código cliente (Game.class) consegue declarar uma fábrica (Blacksmith) passando apenas o elemento que deseja utilizar.

Para adicionar novos elementos, basta implementar cada uma das armas para o novo elemento e criar um novo _blacksmith_.