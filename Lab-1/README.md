*(in ../Lab-1/ directory)*


**Compile:**

javac -cp junit-4.13.2.jar "./src/c/CarRunner.java" "./src/c/Hybrid.java" "./src/c/ElectricInterface.java" "./src/c/GasolineInterface.java" "./src/u/HybridTests.java"

**Run:**

java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:./src/" org.junit.runner.JUnitCore u.HybridTests

java -cp "./src/" c.CarRunner

