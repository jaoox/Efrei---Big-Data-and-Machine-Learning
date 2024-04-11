package fr.data.spark
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

// Import the implicits for $-notation to work


object DataFrame {
cd 
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder
      .appName("Public Transport Optimizer")
      .master("local")
      .getOrCreate()

    

    println("teste")

    // Reading the CSV file
    /*
    val codesPostauxDF = spark.read
      .option("header", "true")
      .option("delimiter", ";")
      .csv("src/main/resources/xxxxx.csv") */

    spark.stop()
  }
}