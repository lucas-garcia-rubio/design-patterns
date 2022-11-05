package factory

import factory.creators.{DuelistCreator, HealerCreator}

@main def game(): Unit = {

  val duelistCreator = DuelistCreator()
  val healerCreator = HealerCreator()

  val jett = duelistCreator.respawnCharacter("Jett")
  val reyna = duelistCreator.respawnCharacter("Reyna")
  val sage = healerCreator.respawnCharacter("Sage")

  jett.onMyWay
  reyna.onMyWay
  sage.needHealing

}