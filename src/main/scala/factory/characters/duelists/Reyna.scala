package factory.characters.duelists

import factory.traits.{BaseCharacter, Skills}

class Reyna extends BaseCharacter, Skills:

  override def name: String = "Reyna"

  override def role: String = "Duelist"

  override def killCelebration: Unit = {
    println("You are battery to me.")
  }

  override def needHealing: Unit = {
    println("You are so kind... Why don't you heal me?")
  }

  override def respawnHello: Unit = {
    println("Another day of killing...")
  }

  override def onMyWay: Unit = {
    println("On my way!")
  }

  override def e: String = "Invulnerable"

  override def q: String = "Flash"

  override def ultimate: String = "Super Soldier"