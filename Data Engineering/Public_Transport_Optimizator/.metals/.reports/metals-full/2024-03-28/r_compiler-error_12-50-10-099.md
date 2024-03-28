file:///C:/Users/joaob/OneDrive/Área%20de%20Trabalho/Efrei---Big-Data-and-Machine-Learning/Data%20Engineering/Public_Transport_Optimizator/src/main/scala/fr/data/spark/DataFrame.scala
### file%3A%2F%2F%2FC%3A%2FUsers%2Fjoaob%2FOneDrive%2F%C3%81rea%2520de%2520Trabalho%2FEfrei---Big-Data-and-Machine-Learning%2FData%2520Engineering%2FPublic_Transport_Optimizator%2Fsrc%2Fmain%2Fscala%2Ffr%2Fdata%2Fspark%2FDataFrame.scala:19: error: unclosed comment
    /*
    ^

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.8
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.8\scala-library-2.13.8.jar [exists ]
Options:



action parameters:
uri: file:///C:/Users/joaob/OneDrive/Área%20de%20Trabalho/Efrei---Big-Data-and-Machine-Learning/Data%20Engineering/Public_Transport_Optimizator/src/main/scala/fr/data/spark/DataFrame.scala
text:
```scala
package fr.data.spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object DataFrame {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder
      .appName("French Postal Codes Analysis")
      .master("local")
      .getOrCreate()

    // Import the implicits for $-notation to work
    import spark.implicits._

    // Reading the CSV file
    /*
    val codesPostauxDF = spark.read
      .option("header", "true")
      .option("delimiter", ";")
      .csv("src/main/resources/codesPostaux.csv") 

    spark.stop()
  }
}
```



#### Error stacktrace:

```
scala.meta.internal.tokenizers.Reporter.incompleteInputError(Reporter.scala:27)
	scala.meta.internal.tokenizers.Reporter.incompleteInputError$(Reporter.scala:26)
	scala.meta.internal.tokenizers.Reporter$$anon$1.incompleteInputError(Reporter.scala:33)
	scala.meta.internal.tokenizers.Reporter.incompleteInputError(Reporter.scala:29)
	scala.meta.internal.tokenizers.Reporter.incompleteInputError$(Reporter.scala:29)
	scala.meta.internal.tokenizers.Reporter$$anon$1.incompleteInputError(Reporter.scala:33)
	scala.meta.internal.tokenizers.LegacyScanner.skipNestedComments(LegacyScanner.scala:53)
	scala.meta.internal.tokenizers.LegacyScanner.skipBlockComment(LegacyScanner.scala:59)
	scala.meta.internal.tokenizers.LegacyScanner.skipToCommentEnd(LegacyScanner.scala:73)
	scala.meta.internal.tokenizers.LegacyScanner.skipComment(LegacyScanner.scala:81)
	scala.meta.internal.tokenizers.LegacyScanner.fetchToken(LegacyScanner.scala:346)
	scala.meta.internal.tokenizers.LegacyScanner.nextToken(LegacyScanner.scala:246)
	scala.meta.internal.tokenizers.LegacyScanner.foreach(LegacyScanner.scala:1044)
	scala.meta.internal.tokenizers.ScalametaTokenizer.uncachedTokenize(ScalametaTokenizer.scala:24)
	scala.meta.internal.tokenizers.ScalametaTokenizer.$anonfun$tokenize$1(ScalametaTokenizer.scala:17)
	scala.collection.concurrent.TrieMap.getOrElseUpdate(TrieMap.scala:961)
	scala.meta.internal.tokenizers.ScalametaTokenizer.tokenize(ScalametaTokenizer.scala:17)
	scala.meta.internal.tokenizers.ScalametaTokenizer$$anon$2.apply(ScalametaTokenizer.scala:332)
	scala.meta.tokenizers.Api$XtensionTokenizeDialectInput.tokenize(Api.scala:25)
	scala.meta.tokenizers.Api$XtensionTokenizeInputLike.tokenize(Api.scala:14)
	scala.meta.internal.parsers.ScannerTokens$.apply(ScannerTokens.scala:880)
	scala.meta.internal.parsers.ScalametaParser.<init>(ScalametaParser.scala:33)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:35)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:384)
```
#### Short summary: 

file%3A%2F%2F%2FC%3A%2FUsers%2Fjoaob%2FOneDrive%2F%C3%81rea%2520de%2520Trabalho%2FEfrei---Big-Data-and-Machine-Learning%2FData%2520Engineering%2FPublic_Transport_Optimizator%2Fsrc%2Fmain%2Fscala%2Ffr%2Fdata%2Fspark%2FDataFrame.scala:19: error: unclosed comment
    /*
    ^