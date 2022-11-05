package abstract_factory.elemental_weapons

import abstract_factory.weapons.Bow

class BowFire extends Bow {

  override def aim: Unit = {
    println("The bow flames itself...")
  }

  override def shot: Unit = {
    println("...now an arrow of fire comes out!")
  }

}
