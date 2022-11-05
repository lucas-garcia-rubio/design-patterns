package abstract_factory

import abstract_factory.Blacksmith
import abstract_factory.elemental_blacksmiths.*

object Game {

  @main def playGame(): Unit = {

    val elementalChoice = "water"

    val factory = returnBlacksmiths(elementalChoice)

    val sword = factory.createSword
    val spear = factory.createSpear
    val bow = factory.createBow

    sword.attack
    spear.wield
    bow.aim
    bow.shot

  }

}

def returnBlacksmiths(choice: String): Blacksmith = {

  if choice == "water" then
    new WaterBlacksmith
  else
    new FireBlacksmith

}