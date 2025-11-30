# Java Setup Documentation & JVM Architecture Report

## 1. Environment Setup & JDK Installation

### Install JDK and Configure Development Environment
1. Download JDK from the official Oracle website or OpenJDK.
2. Install JDK by following the installer prompts.
3. Configure environment variables:
   - **JAVA_HOME**
   - Add `%JAVA_HOME%/bin` to **PATH**
4. Verify the installation:
   ```bash
   java -version
   javac -version

  ## 2. JVM Architecture Report
  ### ASCII Diagram – JVM Architecture
                   ┌──────────────────────────────┐
                   │        Java Program          │
                   └──────────────────────────────┘
                                   │
                                   ▼
                   ┌──────────────────────────────┐
                   │         Class Loader          │
                   │  Loading • Linking • Init     │
                   └──────────────────────────────┘
                                   │
                                   ▼
                   ┌──────────────────────────────┐
                   │      Runtime Data Areas       │
                   │------------------------------ │
                   │  Method Area   – class meta   │
                   │  Heap          – objects      │
                   │  JVM Stack     – frames       │
                   │  PC Register   – instr ptr    │
                   │  Native Stack  – native calls │
                   └──────────────────────────────┘
                                   │
                                   ▼
                   ┌──────────────────────────────┐
                   │       Execution Engine        │
                   │ Interpreter • JIT • GC        │
                   └──────────────────────────────┘
                                   │
                                   ▼
                   ┌──────────────────────────────┐
                   │  Native Method Interface     │
                   └──────────────────────────────┘
                                   │
                                   ▼
                   ┌──────────────────────────────┐
                   │      Native Libraries         │
                   └──────────────────────────────┘
## 3. JIT vs Interpreter
### Interpreter
 - Executes bytecode line-by-line
 - Slower for repeated operations
 - Starts running immediately

### JIT Compiler (Just-In-Time)

- Converts frequently executed (“hot”) bytecode into native machine code
- Much faster during runtime
- Improves overall performance through optimisation
## 4. Bytecode Execution Process 
.java → .class → Class Loader → Execution Engine → Output

## 5. "Write Once, Run Anywhere"
Java bytecode can run on any operating system that has a JVM.
