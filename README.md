# A Multi-agent system based on Hunt the wumpus

## Introduction

 
This project aim at developing a multi-agent version of "Hunt the Wumpus". This variant of the game is defined as follows : a set of cooperating agents are placed in an unknown environment; their mission is to explore and recover a maximum of treasures that are scattered in this environment. A Wumpus agent is also present, it moves randomly and tries to disrupt the exploration of the map and recovery of treasures.

      
## Installation

The project was coded in JAVA on IntelliJ, it uses GraphStream for the representation and display of the map, and the JADE api to model the agents and allow them to communicate.

## Usage

The agents are decalred in DedaleEtuFull2018/src/princ/Principal.java, running this class will start the simulation, and modifying it will allow you to reconfigure the agents or change the map that the simulation will be running on. Each agent uses a hash table to build its own representation of the environment. Each key corresponds to a node and each value is a data structure that contains the date of discovery of this node, its neighbors and its resources.  
 
Here is a brief description of the agents :
Markup :
* the explorer agent : its mission is to explore the map in order to establish a common knowledge of the environment for all other agents. It builds the map as he travels in his own hash table.
*  The collector agent : its goal is to seek the treasures that will fit in its backpack type. If it's backpack is full or if it can not find any more treasure, it will then go to the tanker to drop his loot.
* then tanker agent : The Tanker will set its position by calculating the Betweenness centrality of all the nodes in the graph, and then select the node with the largest value. This method allows other agents to calculate the tanker's position so they can drop their treasures there.



<p align="center">
    <img src="https://raw.githubusercontent.com/gualt1995/MAS/master/Rapport/images/fosyma.PNG" width="450"
</p>
    
## Original project by :
[Gualtiero Mottola](https://github.com/gualt1995)<br>
[B.Thanh Luong](https://github.com/leondoofus)<br>
