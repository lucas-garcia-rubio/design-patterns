package abstract_factory.elemental_weapons

import abstract_factory.weapons.Spear

class SpearWater extends Spear {

  override def sway: Unit = {
    println("The spear makes a slash wet.")
  }

  override def wield: Unit = {
    println("The spear gets wet.")
  }

  override def attack: Unit = {
    println("The spear's target becomes wet (?).")
  }

}
