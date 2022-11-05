package abstract_factory.elemental_weapons

import abstract_factory.weapons.Bow

class BowWater extends Bow {

  override def aim: Unit = {
    println("The air gets wet...")
  }

  override def shot: Unit = {
    println("...and an wet arrow comes out!")
  }

}
