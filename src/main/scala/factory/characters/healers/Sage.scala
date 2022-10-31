package factory.characters.healers

import factory.traits.{BaseCharacter, Skills}

class Sage extends BaseCharacter, Skills:

  override def name: String = "Sage"

  override def role: String = "Healer"

  override def killCelebration: Unit = println("You are a boulder!")

  override def needHealing: Unit = println("Your turn!")

  override def onMyWay: Unit = println("Almost there!")

  override def respawnHello: Unit = println("Let's finish it.")

  override def e: String = "Heal"

  override def q: String = "Orb"

  override def ultimate: String = "Resurrection"