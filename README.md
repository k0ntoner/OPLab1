# Dining Philosophers Simulation

## Project Overview
This project simulates the **Dining Philosophers Problem**, demonstrating scenarios of:
1. **Deadlock**: Philosophers waiting indefinitely for resources (forks).
2. **Starvation**: A scenario where one or more philosophers are unable to eat due to resource distribution.

## Files
### 1. `DeadlockPhilosophers.java`
- **Purpose**: Simulates the deadlock scenario where philosophers are unable to proceed because each holds one fork and waits indefinitely for the other.

### 2. `Fork.java`
- **Purpose**: Represents a shared resource (fork) that philosophers must acquire to eat.
- **Key Features**:
  - Ensures thread-safe operations.
  - Locks and unlocks forks for exclusive use.

### 3. `Philosopher.java`
- **Purpose**: Represents the behavior of a philosopher in the simulation.
- **Key Features**:
  - Alternates between thinking and eating states.
  - Demonstrates resource contention.

### 4. `StarvationPhilosopher.java`
- **Purpose**: Models the starvation scenario, where resource access policies can lead to unfairness in resource allocation.

### 5. `Table.java`
- **Purpose**: Acts as a coordinator for philosophers and forks.
- **Key Features**:
  - Initializes forks and philosophers.
  - Manages simulation execution.

---
