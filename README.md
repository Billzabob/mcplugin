# Our Super Cool Minecraft Plugin

1. [Install sbt](https://www.scala-sbt.org/)
2. `git clone https://github.com/aki-ks/sbt-bukkit`
3. cd into it and run `sbt publishLocal`
4. cd back to this project and run `sbt Bukkit/packagePlugin`
5. The jar will be in `./target/bukkit-server/plugins/<plugin-name>.jar`

To run the server localy:
1. Download [BuildTools.jar](https://hub.spigotmc.org/jenkins/job/BuildTools/lastSuccessfulBuild/artifact/target/BuildTools.jar)
2. Run `java -jar BuildTools.jar --rev 1.14.4` (you can delete all the files it makes after, since it saves the important stuff to you local maven repo)
3. Run `sbt Bukkit/startServer`
