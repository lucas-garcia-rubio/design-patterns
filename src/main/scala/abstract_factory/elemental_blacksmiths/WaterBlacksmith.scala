package abstract_factory.elemental_blacksmiths

import abstract_factory.Blacksmith
import abstract_factory.weapons.*
import abstract_factory.elemental_weapons.{SpearWater, SwordWater, BowWater}

class WaterBlacksmith extends Blacksmith {

  override def createSword: Sword = {
    println("The master is forging a Water Sword!")
    new SwordWater
  }

  override def createBow: Bow = {
    println("The master is crafting a Water Bow!")
    new BowWater
  }

  override def createSpear: Spear = {
    println("The master is forging a Water Spear!")
    new SpearWater
  }
  
}
