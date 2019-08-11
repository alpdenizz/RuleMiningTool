# RuleMiningTool
A tool for process mining applications with declarative models: Process Discovery, Conformance Checking, 
Log Generation and Process Enhancement  

## How to run
**Prerequisite:**  
In order to start the tool, you must have the latest Oracle Java 8 JRE or JDK set in your PATH.  
If you open command prompt or terminal, you should be able to execute `java -version` and see its version.  

**For Windows:**  
Double click or press Enter to `RunnerForWindows.bat`  
OR: Double click or press Enter to `BuildAndRun.bat`  

**For NonWindows (Mac, Linux):**  
Open terminal and type `sh RunnerForNotWindows.sh`  
OR: Open terminal and type `sh BuildAndRun.sh`

## How to build
**For Eclipse IDE:**  
You can import it as an Eclipse project and run from `src/theFirst/RuM.java`  
**NOTE:** At first, Eclipse may not see JavaFX libraries therefore it may not start.  
To resolve this, you can either install e(fx)clipse from Help/Install New Software  
OR you can right click and follow Build Path/Configure Build Path and remove and add again Java 8 library.  

**For the other IDE:**  
You should be able to open it as Java Project and run from `src/theFirst/RuM.java`  
**NOTE:** Since Eclipse IDE used for the development, I don't know how to fix the issues with the other IDEs.

### Tested on
1) HP Elitebook 840 G5  
* **CPU:** 2.71 GHz Intel Core i5 4 core  
* **RAM:** 16GB DDR4 2400MHz  
* **OS:** Windows 10 Enterprise Edition (Version 10.0.18362.239)  
* **Java:** Java(TM) SE Runtime Environment (build 1.8.0_221-b11)  

2) Oracle VM VirtualBox Version 6.0.10 r132072 installed on (1)
* **RAM:** 4GB  
* **OS:** Ubuntu 18.04.3 LTS  
* **Java:** Java(TM) SE Runtime Environment (build 1.8.0_221-b11)  

### Manual
You can find a user manual in USER MANUAL.pdf
