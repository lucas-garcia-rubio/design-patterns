package abstract_factory.elemental_weapons

import abstract_factory.weapons.Sword

class SwordWater extends Sword:

  override def attack: Unit = {
    println("The sword goes 'zlim', leaving water particles.")
  }

  override def defend: Unit = {
    println("Suddenly,  a water wall is formed in front of the blade.")
  }

  override def toSheath: Unit = {
    println("With a splash sound, the sword goes to its sheath.")
  }
