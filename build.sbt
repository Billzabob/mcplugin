ThisBuild / scalaVersion     := "2.13.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .enablePlugins(BukkitPlugin)
  .settings(
    name := "spigot",
    serverVersion := "1.14.4-R0.1-SNAPSHOT",
    serverApi := SpigotApi
    // You'll need to install the spigot jar to run the server through sbt. See here: https://github.com/aki-ks/sbt-bukkit/wiki/Start-Bukkit-Server
    // spigotJar := "/home/user/Downloads/spigot-1.14.4.jar"
  )

Bukkit / pluginName := "ProofointersPlugin"
Bukkit / pluginVersion := "1.0"
Bukkit / pluginDescription := "An example plugin configuration"
Bukkit / pluginAuthor := "Steph"

// Your website or the website of the plugin
Bukkit / pluginWebsite := "https://github.com/aki-ks/sbt-bukkit"

// When will the plugin be initialized.
// Can be set to `OnStartup` or `PostWorld`.
Bukkit / pluginLoadTime := OnStartup

// Logging prefix of your plugin
Bukkit / pluginPrefix := "ProofpointersPlugin"

// Does your plugin use a database
Bukkit / pluginDatabase := false

// Commands registered by your plugin
// Bukkit / pluginCommands += { /gm }
//   .alias(/gmode, /cgm)
//   .description("Change your gamemode")
//   .usage("/gm [c|creative|s|survival]")
//   .permission("example.gamemode" ! "You're not allowed to change your gamemode")

// Permissions the plugin wishes to register
// Bukkit / pluginPermissions += { "example.gamemode" }
//   .default
//   .description("Change your gamemode")
//   .children("example.gamemode.others" -> true)

// Names of other plugins required to initialize your plugin
// Bukkit / pluginDependencies += "WorldEdit"

// Your plugin must be loaded before these plugins
// Bukkit / pluginLoadBefore += "WorldGuard"

// Add custom values to your plugin.yml
// Bukkit / pluginManifest += "myKey" -> "HelloWorld"
// Bukkit / pluginManifest += "anotherKey" -> Map(
//   "someSubkey" -> "random"
// )