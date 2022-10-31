package factory

import factory.Creator
import factory.characters.duelists.*
import factory.traits.BaseCharacter

class DuelistCreator extends Creator {

  override def createCharacter(name: String): BaseCharacter = name match {
    case "Jett"   => Jett()
    case "Reyna"  => Reyna()
  }

  override def respawnCharacter(name: String): BaseCharacter = {
    val character = createCharacter(name)
    println(s"${character.name} joined to kill some newbies!")
    character
  }

}
