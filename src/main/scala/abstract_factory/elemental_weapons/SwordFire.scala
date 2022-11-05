package abstract_factory.elemental_weapons

import abstract_factory.weapons.Sword

class SwordFire extends Sword {

  override def attack: Unit = {
    println("The sword slashes, burning it all.")
  }

  override def defend: Unit = {
    println("The attacker got burned.")
  }

  override def toSheath: Unit = {
    println("The sword put out its fire.")
  }

}
