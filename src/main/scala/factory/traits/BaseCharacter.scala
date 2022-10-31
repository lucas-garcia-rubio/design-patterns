// Product é a interface responsável por declarar todos os métodos comuns aos produtos
package factory.traits

trait BaseCharacter:

  def name: String
  def role: String
  def respawnHello: Unit
  def killCelebration: Unit
  def needHealing: Unit
  def onMyWay: Unit
