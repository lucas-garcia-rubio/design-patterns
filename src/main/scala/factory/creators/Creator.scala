// A classe Creator cria os objetos da fábrica
package factory.creators

import factory.traits.BaseCharacter

abstract class Creator:

  def createCharacter(name: String): BaseCharacter
  def respawnCharacter(name: String): BaseCharacter