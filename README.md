# Java Inheritance & Interfaces

This project demonstrates **multi-level inheritance** and **interface usage** in Java, featuring an abstract base class and three custom interfaces.

## Class Hierarchy

Animal (abstract)
├── Mammal (abstract)
│ └── Dog
├── Fish(abstract)
│ └── Blowfish
└── Bird (abstract)
└── Pigeon

## Interfaces Implemented

1. **AnimalBehavior**  
   - Abstract method: `sleep()`  
   - Implemented by: `Dog`, `Pigeon`, `Blowfish`

2. **AnimalMove**  
   - Default method: `move()` (overridden in leaf classes)  
   - Implemented by all classes via `Animal`

3. **AnimalName**  
   - Static method: `name(String)` — prints animal names

## How to Run

1. Open your terminal in the project root directory (where the `animals` folder is located).
2. **Compile all Java files**:
   ```bash
   javac animals/*.java
