package edu.Knoldus

import org.scalatest.flatspec.AnyFlatSpec

import java.nio.file.FileSystems
import scala.language.postfixOps

class ContentOfDirectoryTest extends AnyFlatSpec {
  //===============case 1 ==================

  " ContentOfDirectory(\"./sr\")" should "give List(./sr) because path doesn't exists " in {
    val obj: ContentOfDirectory = ContentOfDirectory("./sr") // this path doesn't exists
    assert(obj.result == List("Path doesn't exists !"))
  }

  //===============case 2======================
  "ContentOfDirectory(\"./src\")" should "give List(())" in {
    val obj = ContentOfDirectory("./src")
    assert(obj.result == List("()"))
  }
//=============case 3 ==================
  "Path Valid or not " should "give" in {
    val path = FileSystems.getDefault.getPath("./src")
    assert(path.toFile.isDirectory && path.toFile.exists())


  }
}


