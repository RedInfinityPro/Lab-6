# Lab-6
<img src="https://img.shields.io/static/-Java-333333?style=plastic&logo=java" alt="Java">

## Packages
The `Fighter` class, which extends the `Player` class, adds attributes like `sword` and `armor`, initializing them through its constructor along with inherited attributes. It includes methods for printing player information and calculating damage and defense based on specific formulas. The `Main` class utilizes `PlayerReader` to load player data from "players.txt", instantiating player objects and printing their details. The abstract `Player` class contains essential attributes and methods for all players, mandating subclasses to implement certain functionalities. Subclasses like `Priest`, `Rogue`, and `Wizard` add unique attributes and override damage and defense calculation methods, tailoring them to each character's specifications. The code handles file reading and error management effectively, ensuring robust player data management.

# Table of Comtents
- Description
- Project Structure

# Description
The `Fighter` class, an extension of the `Player` class, adds `sword` and `armor` attributes, with methods for calculating damage and defense based on these and the player's strength. The `printPlayer` method displays player details including type and attributes, while `getType` returns "Fighter." The `Main` class retrieves player data from "players.txt" using `PlayerReader`, which processes different player types, creating instances from the file data and initializing their attributes. Other subclasses include `Priest`, `Rogue`, and `Wizard`, each with unique attributes and overridden methods for displaying details and calculating their specific damage and defense requirements based on class characteristics. The implementation ensures adherence to abstract methods defined in the `Player` class for consistency across player types.

# Project Structure
📄 Fighter.class
📄 Fighter.java
📄 Main.java
📄 Main.class
📄 Player.class
📄 Player.java
📄 PlayerReader.class
📄 PlayerReader.java
📄 Priest.class
📄 Priest.java
📄 Rogue.java
📄 Rogue.class
📄 Wizared.class
📄 Wizared.java
📄 players.txt
