package simulations

import com.typesafe.config.ConfigFactory

case class TestConfiguration() {
  val config = ConfigFactory.load("test.conf")

  var baseUrl = config.getString("baseUrl")
  var numEntities = config.getInt("numEntities")
  var numUpdates = config.getInt("numUpdates")
  var updateDelay = config.getInt("updateDelay")
  var batchSize = config.getInt("batchSize")
  var notificationServerUrl = config.getString("notificationServerUrl")
}
