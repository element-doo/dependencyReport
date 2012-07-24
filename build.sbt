sbtPlugin     := true

name          := "dependencyReport"

organization  := "com.micronautics"

crossPaths    := false

version	      := "0.1.0"

crossScalaVersions := Seq("2.9.2", "2.9.1-1", "2.9.1", "2.9.0-1", "2.9.0")

CrossBuilding.crossSbtVersions := Seq("0.12.0-RC4", "0.11.3")

scalaVersion <<= (crossScalaVersions)(_.head)

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "UTF-8", "-optimise")

publishTo := Some("3rd party" at "http://maven.element.hr/nexus/content/repositories/thirdparty/")

credentials += Credentials(Path.userHome / ".publish" / "element.credentials")

publishArtifact in (Compile, packageDoc) := false
