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
    val codesPostauxDF = spark.read
      .option("header", "true")
      .option("delimiter", ";")
      .csv("src/main/resources/codesPostaux.csv")

    // Inspect the structure of the DataFrame
    codesPostauxDF.printSchema()

    // Number of Communes
    println(s"Codes Postaux Count: ${codesPostauxDF.count()}")

    // Number of Communes with attribute 'Ligne_5'
    println(s"Number of Communes with attribute Ligne_5: ${codesPostauxDF.filter($"Ligne_5".isNotNull).count()}")

    // Add a column with the department number
    val codesPostauxDFWithDep = codesPostauxDF.withColumn("Num_Depart", $"Code_postal".substr(1, 2))

    // Write the result into a new CSV file
    val columnList = Seq("Code_commune_INSEE", "Nom_commune", "Code_postal", "Num_Depart")
    val newPostauxDF = codesPostauxDFWithDep.select(columnList.map(col): _*).orderBy("Code_postal")

    val outputPath = "src/main/resources/commune_et_departement.csv"

    newPostauxDF
      .write
      .option("header", "true")
      .option("sep", ";")
      .mode("overwrite")
      .csv(outputPath)

    // Communes of the department of Aisne
    println("Communes du département de l'Aisne:")
    newPostauxDF.filter($"Num_Depart" === "02").show()

    // Department with the most communes
    println("Department with the most communes:")
    val mostCommunes = newPostauxDF.groupBy("Num_Depart").count().orderBy(desc("count")).first()
    println(s"Le departement avec le plus de communes est: ${mostCommunes.getAs[String]("Num_Depart")} avec ${mostCommunes.getAs[Long]("count")} communes")

    spark.stop()
  }
}