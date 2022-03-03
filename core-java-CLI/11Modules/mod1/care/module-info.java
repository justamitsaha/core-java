//javac -p mods -d care care/zoo/animal/care/details/*.java care/zoo/animal/care/medical/*.java care/*.java
module zoo.animal.care {
   exports zoo.animal.care.medical;
   requires zoo.animal.feeding;
}