mkdir bin\view
copy .\resources\* .\bin
copy .\src\view\*.fxml .\bin\view 
javac -d .\bin -classpath ".\src;.\resources;.\lib\automaton.jar;.\lib\OperationalSupport.jar;.\lib\jREC.jar;.\lib\jcommon-1.0.16.jar;.\lib\xstream-1.3.1.jar;.\lib\collections-generic-4.01.jar;.\lib\commons-cli-1.4.jar;.\lib\commons-cli-1.4-javadoc.jar;.\lib\commons-cli-1.4-sources.jar;.\lib\commons-cli-1.4-tests.jar;.\lib\commons-cli-1.4-test-sources.jar;.\lib\gson-2.8.2.jar;.\lib\guava-16.0.1.jar;.\lib\jfreechart-1.0.13.jar;.\lib\jgraph.jar;.\lib\jgrapht-jdk1.6.jar;.\lib\log4j-1.2.17.jar;.\lib\ltl2aut.jar;.\lib\OpenXES.jar;.\lib\ProM-Contexts.jar;.\lib\ProM-Framework.jar;.\lib\resources.jar;.\lib\slickerbox1.0rc1.jar;.\lib\Spex.jar;.\lib\TheMiner.jar;.\lib\visfx-1.0-SNAPSHOT.jar;.\lib\Widgets.jar;.\lib\MINERful.jar;.\lib\commons-lang3-3.4.jar;.\lib\jeval-0.9.4.jar;.\lib\DataAwareReplayerLGPL-latest.jar;.\lib\Uitopia-0.6-20181030.jar;.\lib\DataPetriNetsLGPL-latest.jar;.\lib\ProM-Models-latest.jar;.\lib\Log-latest.jar;.\lib\DataExpression-latest.jar;.\lib\javailp-1.2a.jar;.\lib\LTL2Automaton-latest.jar;.\lib\LpSolve-latest.jar;.\lib\DataAwareDeclareReplayerMini.jar;.\lib\DeclareAnalyzerMini.jar;.\lib\DeclareMinerVisualizer-latest.jar;.\lib\DeclareCheckerMini.jar;.\lib\AlloyLogGenerator.jar" .\src\theFirst\RuM.java
start java -classpath ".\bin;.\lib\automaton.jar;.\lib\OperationalSupport.jar;.\lib\jREC.jar;.\lib\jcommon-1.0.16.jar;.\lib\xstream-1.3.1.jar;.\lib\collections-generic-4.01.jar;.\lib\commons-cli-1.4.jar;.\lib\commons-cli-1.4-javadoc.jar;.\lib\commons-cli-1.4-sources.jar;.\lib\commons-cli-1.4-tests.jar;.\lib\commons-cli-1.4-test-sources.jar;.\lib\gson-2.8.2.jar;.\lib\guava-16.0.1.jar;.\lib\jfreechart-1.0.13.jar;.\lib\jgraph.jar;.\lib\jgrapht-jdk1.6.jar;.\lib\log4j-1.2.17.jar;.\lib\ltl2aut.jar;.\lib\OpenXES.jar;.\lib\ProM-Contexts.jar;.\lib\ProM-Framework.jar;.\lib\resources.jar;.\lib\slickerbox1.0rc1.jar;.\lib\Spex.jar;.\lib\TheMiner.jar;.\lib\visfx-1.0-SNAPSHOT.jar;.\lib\Widgets.jar;.\lib\MINERful.jar;.\lib\commons-lang3-3.4.jar;.\lib\jeval-0.9.4.jar;.\lib\DataAwareReplayerLGPL-latest.jar;.\lib\Uitopia-0.6-20181030.jar;.\lib\DataPetriNetsLGPL-latest.jar;.\lib\ProM-Models-latest.jar;.\lib\Log-latest.jar;.\lib\DataExpression-latest.jar;.\lib\javailp-1.2a.jar;.\lib\LTL2Automaton-latest.jar;.\lib\LpSolve-latest.jar;.\lib\DataAwareDeclareReplayerMini.jar;.\lib\DeclareAnalyzerMini.jar;.\lib\DeclareMinerVisualizer-latest.jar;.\lib\DeclareCheckerMini.jar;.\lib\AlloyLogGenerator.jar" theFirst.RuM