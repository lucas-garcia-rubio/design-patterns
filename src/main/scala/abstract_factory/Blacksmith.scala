package abstract_factory

import abstract_factory.weapons.*

trait Blacksmith {

  def createSword: Sword
  def createSpear: Spear
  def createBow: Bow
  
}
