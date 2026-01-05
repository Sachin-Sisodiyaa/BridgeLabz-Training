package com.daytwo.cabbygo;

class Driver {

 // Making sensitive data private
 private String name;
 private String licenseNumber;
 private double rating;

 // Constructor to initialize driver
 public Driver(String name, String licenseNumber, double rating) {
     this.name = name;
     this.licenseNumber = licenseNumber;
     this.rating = rating;
 }

 // Public getters to read private data
 public String getName() {
     return name;
 }

 public String getLicenseNumber() {
     return licenseNumber;
 }

 public double getRating() {
     return rating;
 }
}

