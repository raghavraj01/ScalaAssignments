package io.datatroops

class ValidUser {
  var rname = "Raghav@Raj"
  var dname = "RaghavRaj.com"

  def recipientName() {
    if (rname.matches("[a-zA-Z@]+")) {
      println("Valid Recipient Name")
    }
    else {
      println("Invalid Recipient Name")
    }
  }

  def domainName() {
    if (dname.matches("[a-zA-Z(.com)(.in)(.org)]+")) {
      println("Valid Domain Name")
    }
    else {
      println("Invalid Domain Name")
    }
  }
}

object ObjectValidUser {
  var v = new ValidUser()
  v.recipientName()
  v.domainName()
}
