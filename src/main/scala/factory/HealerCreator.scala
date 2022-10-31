package factory

import factory.characters.healers.*
import factory.traits.BaseCharacter

class HealerCreator extends Creator{

  override def createCharacter(name: String): BaseCharacter = name match {
    case "Sage" => Sage()
  }

  override def respawnCharacter(name: String): BaseCharacter = {
    val character = createCharacter(name)
    println(s"Say hi to ${character.name}, your healer!")
    character
  }

}
