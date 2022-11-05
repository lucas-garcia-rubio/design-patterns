package abstract_factory.elemental_weapons

import abstract_factory.weapons.Spear

class SpearFire extends Spear {

  override def sway: Unit = {
    println("The spear sways, leaving a warm trace.")
  }

  override def wield: Unit = {
    println("The spear puts out the fire.")
  }

  override def attack: Unit = {
    println("A blast of fire comes out.")
  }
  
}
