// Duelists é uma classe que estende Product para personalizar personagens duelistas
package factory.characters.duelists

import factory.traits.{BaseCharacter, Skills}

class Jett extends BaseCharacter, Skills:

  override def name: String = "Jett"

  override def role: String = "Duelist"

  override def respawnHello: Unit = {
    println("Hi, I'm Jett, the wind master!")
  }

  override def killCelebration: Unit = {
    println("That was easy, actually.")
  }

  override def needHealing: Unit = {
    println("Hey, need healing!")
  }

  override def onMyWay: Unit = {
    println("Hold on, wind is coming!")
  }

  override def e: String = "Horizontal Dash"

  override def q: String = "Vertical Dash"

  override def ultimate: String = "Wind Knife"

