name := "lucene-paoding-analysis"

unmanagedSourceDirectories in Compile := Seq( (javaSource in Compile).value )

unmanagedSourceDirectories in Compile += { baseDirectory.value / "src/main/resources" }

unmanagedSourceDirectories in Test := Seq( (javaSource in Test).value )

crossPaths := false

autoScalaLibrary := false

libraryDependencies ++= Seq(
  "commons-logging" % "commons-logging" % "1.1.1"
  , "org.apache.lucene" % "lucene-core" % "4.10.2"
  , "org.apache.lucene" % "lucene-analyzers-common" % "4.10.2"
  , "org.apache.lucene" % "lucene-queries" % "4.10.2" excludeAll (
    ExclusionRule( organization = "jakarta-regexp", name = "jakarta-regexp" )
  )
  , "org.apache.lucene" % "lucene-highlighter" % "4.10.2"
  , "org.apache.lucene" % "lucene-grouping" % "4.10.2"
  , "org.apache.lucene" % "lucene-queryparser" % "4.10.2"
  , "junit" % "junit" % "4.8.2" % Test
)
