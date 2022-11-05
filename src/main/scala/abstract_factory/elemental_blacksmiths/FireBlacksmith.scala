package abstract_factory.elemental_blacksmiths

import abstract_factory.Blacksmith
import abstract_factory.weapons.*
import abstract_factory.elemental_weapons.{SpearFire, BowFire, SwordFire}

class FireBlacksmith extends Blacksmith {

  override def createBow: Bow = {
    println("The master is crafting a Fire Bow!")
    new BowFire
  }

  override def createSpear: Spear = {
    println("The master is forging a Fire Spear!")
    new SpearFire
  }

  override def createSword: Sword = {
    println("The master is forging a Fire Sword!")
    new SwordFire
  }
  
}
